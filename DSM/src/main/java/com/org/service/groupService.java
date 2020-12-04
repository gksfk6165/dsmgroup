package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.repository.groupRepository;
import com.org.vo.groupVo;

@Service
public class groupService {

	@Autowired
	private groupRepository groupRepository;
	
	
	public List<groupVo> groupfindall(){
		return groupRepository.findAll();
	}
	
	
}
