package person.search.alltool.commons;

public class JdkProxyImpl implements JdkProxy {
    @Override
    public String sendMsg(String msg) {
        System.out.println("proxy-->start");
        return msg;
    }
}
