package com.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.vo.groupVo;

@Repository
public interface groupRepository extends JpaRepository<groupVo, Integer> {
	
	public List<groupVo> findAll();

}
