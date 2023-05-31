package demo.demomybatisplus;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.demomybatisplus.pojo.User;
import demo.demomybatisplus.service.UserService;

@SpringBootTest
public class TestService {

    @Autowired
    private UserService userService;

    @Test
    public void testGetCount() {
        // 测试查询记录数
        long count = userService.count();
        System.out.println("--------test--------count: " + count);
    }

    @Test
    public void testSaveBatch() {
        // sql长度有限制，海量数据插入单条sql无法实行，
        // 因此MP将批量插入放在了通用Service中实现，而不是通用Mapper
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User(null, null, i, null);
            user.setName("abaaba" + i);
            user.setAge(20 + i);
            users.add(user);
        }
        // sql: insert into user (username, age) values (?, ?)
        userService.saveBatch(users);
    }

}
