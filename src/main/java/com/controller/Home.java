package com.controller;

import com.service.BillService;
import com.service.ProductService;
import com.service.impl.BillServiceImpl;
import com.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/home")
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //获取商品
        ProductService productService = new ProductServiceImpl();
        Map<String, Object> productsAll = productService.findProductsAllService(null, 1);
        session.setAttribute("productsAll",productsAll);
        //获取账单
        BillService billService = new BillServiceImpl();
        Map<String, Object> billAll = billService.findBillAllService(1);
        session.setAttribute("billAll",billAll);
    }
}
