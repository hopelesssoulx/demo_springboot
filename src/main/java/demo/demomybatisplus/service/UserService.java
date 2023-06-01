package demo.demomybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;

import demo.demomybatisplus.pojo.User;

/**
 * UserService继承IService模板提供的基础功能
 */
public interface UserService extends IService<User> {

    Object getUsers();

    Object getUserById(Long id);

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUserById(User user);
}
