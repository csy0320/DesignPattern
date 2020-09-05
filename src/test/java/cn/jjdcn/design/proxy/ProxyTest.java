package cn.jjdcn.design.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void test() {
        Lawyer lawyer = new Lawyer();
        lawyer.speak();
    }

    @Test
    public void testJDKProxy() {
        JDKProxy marryProxy = new JDKProxy(new Marry());
        Speaker speaker = (Speaker) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{Speaker.class}, marryProxy);
        speaker.speak();
    }


    @Test
    public void testCGLibProxy() {
        CGLibProxy<Jack> jackProxy = new CGLibProxy<>(new Jack());
        Jack jack = (Jack) Enhancer.create(Jack.class, jackProxy);
        jack.speak();

    }

}
