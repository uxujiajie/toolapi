package person.search.alltool.util;

import person.search.alltool.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setUserName("hahha");
        User user1 = new User();
        user1.setId(2333L);
        user1.setUserName("dsad");
        User user2 = new User();
        user2.setId(12L);
        user2.setUserName("sadas");
        System.out.println(user1.compareTo(user2));
        System.out.println(user2.compareTo(user1));

        HashMap<User, Integer> hashMap = new HashMap<>(11);
        hashMap.put(null, 1);
        HashSet hs = null;

    }
}
