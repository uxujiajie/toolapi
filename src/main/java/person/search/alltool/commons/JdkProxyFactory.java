package person.search.alltool.commons;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {

    public static Object getProxy(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                                        object.getClass().getInterfaces(), new JdkProxyAgent(object));
    }

    public static void main(String[] args) {
        //test jdk proxy case
        JdkProxy jdk = (JdkProxy) JdkProxyFactory.getProxy(new JdkProxyImpl());
        jdk.sendMsg("hello");
    }
}
