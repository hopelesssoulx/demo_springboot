package demo.demomybatisplus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.demomybatisplus.mapper.UserMapper;
import demo.demomybatisplus.pojo.User;

@SpringBootTest
public class TestMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        // // selectList()根据MP内置的条件构造器查询一个list集合，null表示没有条件，即查询所有
        // userMapper.selectList(null).forEach(System.out::println);

        // 查询所有用户信息
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        // 插入用户信息
        // insert into user (id, name, age, email) values (?, ?, ?, ?)
        User user = new User(null, "zhangsan", 23, "zhangsan@bababa.com");
        int rs = userMapper.insert(user);
        System.out.println("--------test--------affected rows: " + rs);
        System.out.println("--------test--------: " + user.getId());
    }

    @Test
    public void testDeleteById() {
        // 通过id删除用户信息
        // delete from user where id=?
        int rs = userMapper.deleteById(1663801062294335489L);
        System.out.println("--------test--------affected rows: " + rs);
    }

    @Test
    public void testDeleteBatchIds() {
        // 通过多个id批量删除
        // delete from user where id in (?, ?, ?)
        List<Long> idList = Arrays.asList(1L, 2L, 3L);
        int rs = userMapper.deleteBatchIds(idList);
        System.out.println("--------test--------affected rows: " + rs);
    }

    @Test
    public void testDeleteByMap() {
        // 根据map集合中所设置的条件删除记录
        // delete from user where name=? and age=?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 23);
        map.put("name", "zhangsan");

        int rs = userMapper.deleteByMap(map);
        System.out.println("--------test--------affected rows: " + rs);
    }

    @Test
    public void testUpdateById() {
        User user = new User(4L, "admin", 22, null);
        // 根据id更新用户信息
        // update user set name=?, age=?, where id=?
        int rs = userMapper.updateById(user);
        System.out.println("--------test--------affected rows: " + rs);
    }

    @Test
    public void testSelectById() {
        // 根据id查询用户信息
        // select id, name, age, email from user where id=?
        User user = userMapper.selectById(4L);
        System.out.println(user);
    }

    @Test
    public void testSelectBatchIds() {
        // 根据多个id查询多个用户信息
        // select id, name, age, email from user where id in(?, ?)
        List<Long> idList = Arrays.asList(4L, 5L); // [4, 5]
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap() {
        // 通过map条件查询用户信息
        // select id, name, age, email from user where name=? and age=?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 22);
        map.put("name", "admin");

        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);
    }

    @Test
    public void testCustomSelectMapById() {
        // 自定义customSelect
        Map<String, Object> map = userMapper.customSelect(4L);
        System.out.println(map);
    }

}
