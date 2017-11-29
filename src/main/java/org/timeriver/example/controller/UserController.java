package org.timeriver.example.controller;

import org.springframework.web.bind.annotation.*;
import org.timeriver.example.domain.UserDO;
import org.timeriver.example.query.QueryUser;
import org.timeriver.example.service.UserService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService;
	
	/**
	 * <pre>
	 *     http://localhost:8080/user
	 * </pre>
	 */
	@RequestMapping
    public String index() {
		Thread thread = Thread.currentThread();
		System.out.println(thread +"===index==="+ thread.getClass().getClassLoader());
		return "hello world";
	}

	/**
	 * <pre>
	 *     http://localhost:8080/user/list
	 * </pre>
	 */
	@RequestMapping(value = "/list")
	public List<UserDO> list() {
		QueryUser queryUser = new QueryUser();
		queryUser.setName("t");
		return userService.listUser(queryUser);
	}

	/**
	 * <pre>
	 *     http://localhost:8080/user/get //error
	 *     http://localhost:8080/index/get?name=timeriver //ok
	 * </pre>
	 */
	@RequestMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		return map;
	}

	/**
	 * <pre>
	 *     @PathVariable rest占位符
	 *     @PathVariable("username") String name //占位符映射参数名
	 *     http://localhost:8080/user/rest/1/timeriver //ok
	 * </pre>
	 */
	@GetMapping
	@RequestMapping(value = "/rest/{id}/{username}")
	public UserDO getUser(@PathVariable int id, @PathVariable("username") String name) {
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setName(name);
		userDO.setCreateTime(new Date());
		return userDO;
	}

}
