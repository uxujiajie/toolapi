package person.search.alltool.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import person.search.alltool.pojo.User;
import person.search.alltool.service.UserService;

import java.util.List;


@Controller
@RequestMapping("/user")
@Api(tags = "userController")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/page")
    public String index() {
        return "/html/user/user.html";
    }
    @ResponseBody
    @PostMapping("/save")
    @ApiOperation("保存用户")
    public User saveUser(User user) {
        userService.saveUser(user);
        return user;
    }
    @GetMapping("/list/{userName}")
    @ApiOperation("查询用户列表")
    @ResponseBody
    public List<User> userList(@PathVariable String userName) {
        return userService.findUser(userName, null, 0, 20);
    }
}
