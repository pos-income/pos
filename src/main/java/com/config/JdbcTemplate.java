package com.config;


import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



/**
 * 增删改查通用模板
 * @author wdb
 *
 */
public class JdbcTemplate <T>{
    public JdbcTemplate() {}

    /**
     *
     *  DML 操作模板
     *
     *  */
    public static Integer update(Connection co,String sql,Object...args) {
        Connection conn = null;
        PreparedStatement st =null;
        try {
            conn=co==null?JdbcUtils.getConn():co;
            st = conn.prepareStatement(sql);
            for(int i=0;i<args.length;i++) {
                st.setObject(i+1, args[i]);
            }
            int i = st.executeUpdate();
           // System.out.println(i);
            return i;
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if (co==null){
                JdbcUtils.closeStream(conn, st, null);
            }
        }
        return 0;

    }


    public  List<T> query(String sql,Object o,Object...args) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            conn=JdbcUtils.getConn();
            st= conn.prepareStatement(sql);
            //设置参数完毕
            //判断参数是否为空
            if (args!=null){
                for(int i=0;i<args.length;i++) {
                    st.setObject(i+1, args[i]);
                }
            }
            rs = st.executeQuery();
            ArrayList<T> list = new ArrayList<>();
            return resultDemo(rs, o);

        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            JdbcUtils.closeStream(conn, st, rs);
        }
        return null;
    }
    public  List<T> resultDemo(ResultSet rs,Object o) throws Exception {
        ArrayList<T> list = new ArrayList<T>();
        while(rs.next()) {
            //可以获取指定表中每一列的列名
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();//获取当前表的列个数
            //当前对象的字节码文件
            Class clazz = o.getClass();
            //当前文件的父类字节码文件
            Class superclass = o.getClass().getSuperclass();
            Object newInstance = clazz.newInstance();//通过无参构造创建对象
            for(int i=1;i<=count;i++) {
                String columnName = metaData.getColumnName(i);

                /* *
                 *
                 * 反射   代理
                 **/

               // System.out.println(1223);
//                System.out.println(clazz.getDeclaredField(columnName));
                //全局变量
                Field f=null;
                //当父类字节码文件里没有查找的对象时捕获抛出的异常
               try {
                   f=superclass.getDeclaredField(columnName);

               }catch (NoSuchFieldException e){
                   f = clazz.getDeclaredField(columnName);

               }
                f.setAccessible(true);//破除私有

                if(rs.getObject(i)!=null) {
                    f.set(newInstance, rs.getObject(i));
                }
            }
            list.add((T) newInstance);
        }
        return list;
    }
}

