package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.service.groupService;
import com.org.vo.groupVo;

@RestController
@RequestMapping("/dsm")
public class gmRestController {


	@Autowired
	private groupService service;
	
	@PostMapping("/group/list")
	public List<groupVo> groupManage() {
		
		List<groupVo> list = service.groupfindall();
		return list;
	}
}
