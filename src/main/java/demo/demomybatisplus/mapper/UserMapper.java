package demo.demomybatisplus.mapper;

import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import demo.demomybatisplus.pojo.User;

public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义方法customSelect
     * 根据id查询用户信息为map集合
     * UserMapper.xml里customSelect
     * 
     * @param id
     * @return
     */
    Map<String, Object> customSelect(Long id);

}
