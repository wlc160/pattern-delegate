package com.mytask.delegate.mvc;

import java.lang.reflect.Method;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.mvc
 * 文件名:Handler
 * description:
 *
 * @author lcwen
 * @version V1.0: Handler.java 2019/10/14 10:26
 **/
public class Handler {

    private Object controller;
    private Method method;
    private String url;

    public Object getController() {
        return controller;
    }

    public Handler setController(Object controller) {
        this.controller = controller;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public Handler setMethod(Method method) {
        this.method = method;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Handler setUrl(String url) {
        this.url = url;
        return this;
    }
}
