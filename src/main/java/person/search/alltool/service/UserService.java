package person.search.alltool.service;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import person.search.alltool.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 保存用户
     * @param user 用户信息
     */
    void saveUser(User user);

    /**
     * 检索用户
     * @param userName 用户名
     * @param note 信息
     * @param skip 跳过页
     * @param limit 每页查询数
     * @return 返回查询到User
     */
    List<User> findUser(String userName, String note, int skip, int limit);

    UpdateResult updateUser(Long id, String userName, String note);
    User getUser(Long id);

    DeleteResult deleteUser(Long id);
}
