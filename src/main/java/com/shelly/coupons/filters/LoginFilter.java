//package com.shelly.coupons.filters;
//
//import com.shelly.coupons.utils.JWTUtils;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@Order(2)
//public class LoginFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        if(httpRequest.getMethod().equals("OPTIONS")){
//            chain.doFilter(httpRequest, response);
//            return;
//        }
//
//        String url = httpRequest.getRequestURL().toString();
//
//        if(url.endsWith("/users") && httpRequest.getMethod().equals("POST")){
//            chain.doFilter(httpRequest, response);
//            return;
//        }
//
//        if(url.endsWith("/login")){
//            chain.doFilter(httpRequest, response);
//            return;
//        }
//
//        String token = httpRequest.getHeader("token");
//
//        try {
//            JWTUtils.validateToken(token);
//            chain.doFilter(httpRequest, response);
//        } catch (Exception e) {
//            HttpServletResponse httpResponse = (HttpServletResponse) response;
//            int unAuthorizedError = 401;
//            httpResponse.setStatus(unAuthorizedError);
//        }
//    }
//}
//
