## springboot 热部署

```java
<!--热部署插件-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <!--依赖不会传递-->
    <optional>true</optional>
</dependency>
```

具体步骤：打开顶部工具栏  File -> Settings -> Default Settings -> Build -> Compiler  然后勾选 Build project automatically 。

同时按住 Ctrl + Shift + Alt + / 然后进入Registry ，勾选自动编译并调整延时参数。

![image-20200906215623054](/home/xuz/.config/Typora/typora-user-images/image-20200906215623054.png)

顶部菜单- >Edit Configurations->SpringBoot插件->目标项目->勾选热更新。

2个update

![image-20200906215736784](/home/xuz/.config/Typora/typora-user-images/image-20200906215736784.png)



