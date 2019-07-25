package com;

import com.mapper.JobDao.JobDaoImpl;
import com.mapper.LoggerDao.LoggerDao;
import com.mapper.LoggerDao.LoggerDaoImpl;
import com.mapper.MoneyDao.MoneyDaoImpl;
import com.mapper.ProductsDao.ProductsDaoImpl;
import com.mapper.UserDao.UserDaoImpl;
import com.pojo.*;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import java.math.BigDecimal;

public  class Test001 {
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();

        Users users =new Users();
        UserDaoImpl userDao = new UserDaoImpl();
       /* //测试用户添加
        users.setJid(1);
        users.setUserName("12");
        users.setPassword("123");
        users.setTime("2019-07-19");
        userDao.addUser(users);*/
       /* //测试用户通过UserName单个查询
       users.setUserName("12");
       userDao.addUser(users);
        System.out.println(users.getUserName());
        System.out.println(userDao.findUser(users).getUserName());
        userDao.findUser(users);*/
        //测试查询所有用户信息
        /*users.setJid(1);
        users.setUserName("12");
        users.setPassword("123");
        users.setTime("2019-07-19");
        userDao.addUser(users);
        System.out.println(userDao.findUserAll(null).toString());
*/
        Job job = new Job();
        JobDaoImpl jobDao =new JobDaoImpl();
        //修改
        /*job.setId(2);
        job.setJname("管理员");
        System.out.println(jobDao.updateJob(job));*/
        /*//测试job添加
        //job.setJname("job");
        //System.out.println(jobDao.addJob(job));
        //测试Job查询
        //System.out.println(jobDao.findJobAll(job).toString());
        //测试通过Jname删除
        job.setJname("job");
        System.out.println(jobDao.delete(job));*/

        Products products =new Products();
        ProductsDaoImpl productsDao = new ProductsDaoImpl();
        products.setId(10);
        products.setCounts(5);
        products.setPrices(new BigDecimal(10));
        products.setProductName("大力出奇迹");
        //测试添加
        //System.out.println(productsDao.addProducts(products));
        //测试修改
       // System.out.println(productsDao.update(products));
        //测试模糊查询
        //System.out.println(productsDao.likeIdProducts("1"));
        //测试修改所有信息
       // System.out.println(productsDao.updateAll(products));

        /* users.setIsLog(1);
        users.setId(10);
        userDao.updataLog(users);*/
        //Bill bill = new Bill();
       // BillDaoImpl billDao =new BillDaoImpl();
       /* bill.setBid("B123345");
        System.out.println(billDao.findBillAll(bill));*/

        Money money = new Money();
        MoneyDaoImpl moneyDao =new MoneyDaoImpl();
        money.setBid("123");
        money.setResidue(new BigDecimal(22));
        money.setTime("2019-7-25");
        money.setIncome(new BigDecimal(22));
        money.setOutcome(new BigDecimal(22));
        //money.setUid(10);
        money.setUid(100);
        //System.out.println(money);
        //测试添加
        //System.out.println(moneyDao.addMoney(null, money));
//        List<Money> money1 = moneyDao.findMoney(money);
//        System.out.println(moneyDao.findMoney(money).get(0).getUserName());
        //System.out.println(moneyDao.findMoneyAll(null).get(0));

        //EmailCode emailCode = new EmailCode("751941218@qq.com");
        //emailCode.run();
      /*  MoneyServiceImpl moneyService =new MoneyServiceImpl();
        Map<String, Object> moneyAllService = moneyService.findMoneyAllService(1);
        List<Money> userList = (List<Money>) moneyAllService.get("userList");
        System.out.println(userList.get(0).getUserName());*/
        Logger logger =new Logger();
        LoggerDaoImpl loggerDao =new LoggerDaoImpl();
        logger.setId(23);
        logger.setPlay("退出登录");
        logger.setTime("2019-7-25");
        logger.setUid(10);
        //测试添加
        //System.out.println(loggerDao.addLogger(logger));
        //测试查询
        //System.out.println(loggerDao.findLoggerAll(null));

    }
}
