package com.upic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upic.model.User;
import com.upic.service.UserService;

/**
 * 
 * @author dongtengzhou
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add")
	public int addUser(User user) {
		return userService.addUser(user);
	}

	@RequestMapping(value = "/all/{pageNum}/{pageSize}")
	public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

		return userService.findAllUser(pageNum, pageSize);
	}
}