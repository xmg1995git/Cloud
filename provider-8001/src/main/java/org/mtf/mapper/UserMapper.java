package org.mtf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mtf.entities.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    @Select("SELECT count(1) FROM t_user")
    int userTotal();

    long saveUser(User user);


    User getUserById(String id);


}
