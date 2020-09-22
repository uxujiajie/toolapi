package person.search.alltool.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.util.List;

@Document
public class User implements Serializable,Comparable<User> {

    private static final long serivalVersionUID= -123456789L;
    @MongoId
    private Long id;
    @Field("user_name")
    private String userName;

    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public int compareTo(User user) {
            if (this.getId() >= user.getId() ) {
                return 1;
            } else {
                return -1;
            }
    }
}
