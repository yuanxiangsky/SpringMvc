package com.ctmctv.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by YuanXiang on 2017/11/29.
 */
public class Myinterceptor implements HandlerInterceptor {

    //1 方法将在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("拦截器1处理成功");
        return true;
    }

    //2 该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用，可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作。
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //3 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行，该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行。
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
