package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dsm")
public class gmController {

	@GetMapping("/group")
	public String groupManage() {
		
		return "group_manage";
	}
}
