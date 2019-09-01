package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;

/**
 * @author userzcm
 *
 */
@Controller
public class SampleController {
	
	/**
	 * @return
	 */
	@RequestMapping("/")
	@ResponseBody
	String InCreate() {
		return "dddd";
	}
	
	@RequestMapping("/rest")
	public Map<String,String> returnCreate(){
		Map<String,String> map = new HashMap<>();
		map.put("name", "kiss");
		System.out.println("这是master");
		return map;
	}
	
	@RequestMapping("/restJson")
	public User restJson(){
		return new User(111, "123123", "123123", new Date());
	}
	
	@RequestMapping("/restTemplate")
	public Object restTemplate() {
		return "index";
	}


}
