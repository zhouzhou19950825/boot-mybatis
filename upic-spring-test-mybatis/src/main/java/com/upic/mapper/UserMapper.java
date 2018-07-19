package com.upic.mapper;

import java.util.List;

import com.upic.model.User;
/**
 * 
 * @author dongtengzhou
 *
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> selectAllUser();
}