import com.bin.spring.design.proxy.DynamicProxy;
import com.bin.spring.design.proxy.StaticProxy;
import com.bin.spring.service.Service;
import com.bin.spring.service.impl.ServiceImpl;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        dynamicTest();
        staticTest();
    }

    private static void staticTest() {
        StaticProxy staticProxy = new StaticProxy(new ServiceImpl());
        System.out.println(staticProxy.showTime());
    }

    private static void dynamicTest() {
        DynamicProxy dynamicProxy = new DynamicProxy(new ServiceImpl());
        Service result = (Service) dynamicProxy.call();
        System.out.println(result.sayHello("zhangsan"));
    }
}
