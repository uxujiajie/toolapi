package person.search.alltool.service.impl;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import person.search.alltool.pojo.User;
import person.search.alltool.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public UserServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public void saveUser(User user) {
        //文档采用类名首字母小写方式
        mongoTemplate.save(user);
        //文档使用名称位～
        //mongoTemplate.save(user, "user");
    }

    @Override
    public List<User> findUser(String userName, String note, int skip, int limit) {

        //regex 模糊查询
        Criteria criteria = Criteria.where("userName").regex(userName);//.and("note").regex(note);
        //limit 查询条数 skip 跳过多少页
        Query query = Query.query(criteria).limit(limit).skip(skip);
        return mongoTemplate.find(query, User.class);
    }

    @Override
    public UpdateResult updateUser(Long id, String userName, String note) {
        Criteria criteria = Criteria.where("id").is("id");
        Query query = Query.query(criteria);
        Update update = Update.update("userName", userName);
        update.set("note", note);

        //更新所有匹配到的文档
        //UpdateResult ur1 = mongoTemplate.updateMulti(query, update,User.class);
        //更新第一个文档
        return mongoTemplate.updateFirst(query, update, User.class);
    }

    @Override
    public User getUser(Long id) {
        //first method
        // is 精准查询
        //Criteria criteria = Criteria.where("id").is(id);
        //Query query = Query.query(criteria);
        //return mongoTemplate.findOne(query, User.class);
        //second method
        return mongoTemplate.findById(id, User.class);
    }

    @Override
    public DeleteResult deleteUser(Long id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = Query.query(criteria);

        return mongoTemplate.remove(query, User.class);
    }
}
