package com.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * 设置拦截器，验证用户是否登录，若未登录，则不让其访问其他页面（url）
 */
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取HttpSession对象，判断是否登陆
        HttpServletRequest req =  (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();

        if(session.getAttribute("model")==null){
            //非法访问，没有登陆，跳转到登陆页面
            session.setAttribute("error", "非法访问");
            // 保存客户想要去的地址, 登录成功后则直接跳转,而不是到首页
            String goURL = req.getServletPath();//(获取到地址不包括参数)
            //判断参数是否为空，不null就获取参数
            if(req.getQueryString()!=null){
                goURL+="?"+req.getQueryString();
            }
            session.setAttribute("goURL", goURL);
            res.sendRedirect(req.getContextPath() + "/user/userLogin.jsp");
        }else{
            // 如果有下一个过滤器则跳转到下一个过滤器否则目标页面
//            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
