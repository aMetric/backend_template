package com.coderwhs.init.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coderwhs.init.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
