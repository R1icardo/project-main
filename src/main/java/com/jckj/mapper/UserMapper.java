package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAll(
            @Param(value = "page")int page,
            @Param(value = "limit")int limit);

    Integer count();

}
