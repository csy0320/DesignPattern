package cn.jjdcn.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object object;

    public JDKProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("speak".equals(method.getName())) {

            System.out.println("JDKProxy do something~~~");
            method.invoke(this.object, args);
            System.out.println("JDKProxy done");

        }

        return null;
    }
}
