package com.lmq.spring.httpinvoker.demo.common.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 注：用于远程传输的对象必须实现序列化接口
 * @author luomq
 *
 */
@AllArgsConstructor
public @Data class User implements Serializable {

	private static final long serialVersionUID = 4496015884937844289L;
	
	private Long id;
	private String name;
	private int age;
	private String sex;
	private Date birthday;

}
