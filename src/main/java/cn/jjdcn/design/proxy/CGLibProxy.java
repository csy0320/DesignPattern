package cn.jjdcn.design.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy<T> implements MethodInterceptor {

    private T target;

    public CGLibProxy(T t) {
        this.target = t;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("speak".equals(method.getName())){
            System.out.println("CGLib do something~~~");
            method.invoke(target, objects);
            System.out.println("CGLib done.");
        }

        return null;
    }
}
