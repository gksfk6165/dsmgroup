package com.org.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name="groupVo")
@Table(name="group_test")
public class groupVo {

	@Id
	@Column(name="seq")
	private int seq;

	@Column(name="group_name")
	private String groupname;

	@Column(name="group_code")
	private String groupcode;
	
	@Column(name="group_leader")
	private String groupleader;
	
	@Column(name="group_member")
	private int groupmember;
	
}
