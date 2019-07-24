package com.service.impl;

import com.config.UtilsCache;
import com.mapper.BillDao;
import com.mapper.impl.BillDaoImpl;
import com.pojo.Bill;
import com.pojo.Products;
import com.service.BillService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillServiceImpl implements BillService {
    private BillDao billDao = new BillDaoImpl();
    @Override
    public Map<String, Object> addBillService(Bill bill) {
        Map<String, Object> map = new HashMap<>();
        if (bill==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
            Integer integer = billDao.addBill(null,bill);
            if (integer>0){
                UtilsCache.setBillUtils();//清空缓存
                map.put("code",200);
                map.put("msg","添加成功");
            }else {
                map.put("code",-4);
                map.put("msg","添加失败");
            }
        }
        return null;
    }

    @Override
    public Map<String, Object> findBillService(Bill bill) {
        Map<String, Object> map = new HashMap<>();
        if(bill==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
//            billDao.
        }
        return null;
    }

    @Override
    public Map<String, Object> findBillAllService(Integer page) {
        Map<String, Object> map = new HashMap<>();
        List<Bill> bills = UtilsCache.getBillUtils();
        if (page==null){
            page = 1;
        }
        Integer end;//结束下标
        Integer start = 5*(page-1);//起始下标
        if (bills.size()>start){
            if (bills.size()-start>=5){
                end = start+5;
            }else {
                end = bills.size();
            }
            map.put("userList",bills.subList(start,end));
            map.put("count",bills.size());
        }else{
            map.put("code",-5);
            map.put("msg","没有更多账单信息");
        }
        return map;
    }
}
