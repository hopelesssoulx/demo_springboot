package demo.demomybatisplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import demo.demomybatisplus.mapper.UserMapper;
import demo.demomybatisplus.pojo.User;
import demo.demomybatisplus.service.UserService;

/**
 * ServiceImpl实现了IService，提供了IService中基础功能的实现
 * 若ServiceImpl无法满足业务需求，则可以使用自定的UserService定义方法，并在实现类中实现
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Object getUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public Object getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateById(user);
    }

}
