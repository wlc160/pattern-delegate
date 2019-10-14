package com.mytask.delegate.mvc;

import com.mytask.delegate.mvc.controller.MemberController;
import com.mytask.delegate.mvc.controller.OrderController;
import com.mytask.delegate.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 工程名:patten-delegate
 * 包名:com.mytask.delegate.mvc
 * 文件名:DispatcherServlet
 * description:
 *
 * @author lcwen
 * @version V1.0: DispatcherServlet.java 2019/10/14 10:13
 **/
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> mbControlClass = MemberController.class;
            Class<?> odControlClass = OrderController.class;
            Class<?> sysControlClass = SystemController.class;
            handlerMapping.add(new Handler()
                    .setController(mbControlClass.newInstance())
                    .setMethod(mbControlClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/delegate/getMemberById.json"));
            handlerMapping.add(new Handler()
                    .setController(odControlClass.newInstance())
                    .setMethod(odControlClass.getMethod("getOrderById",new Class[]{String.class}))
                    .setUrl("/delegate/getOrderById.json"));
             handlerMapping.add(new Handler()
                    .setController(sysControlClass.newInstance())
                    .setMethod(sysControlClass.getMethod("logout",null))
                    .setUrl("/delegate/logout.json"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);
    }

    private void doDispatch(HttpServletRequest request , HttpServletResponse response){

        //1、获取用户请求的url，如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入

        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择），根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）

        String uri = request.getRequestURI();
        Handler handler = null;
        for(Handler hd : handlerMapping){
            if (hd.getUrl().equals(uri)){
                handler = hd;
            }
        }

        try{
            if (handler == null){
                response.getWriter().write("404 is not found");
                return;
            }

            Object obj = handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
