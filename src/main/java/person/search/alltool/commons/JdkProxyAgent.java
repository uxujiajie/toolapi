package person.search.alltool.commons;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyAgent implements InvocationHandler {
    private final Object tartget;

    public JdkProxyAgent(Object tartget) {
        this.tartget = tartget;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before proxy");
        Object result = method.invoke(tartget, args);
        System.out.println("after proxy");
        return result;
    }
}
