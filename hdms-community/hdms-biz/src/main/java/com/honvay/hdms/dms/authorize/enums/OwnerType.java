/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌瀚为云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dms.authorize.enums;

import java.util.stream.Stream;

/**
 * @author LIQIU
 * created on 2019/2/22
 **/
public enum OwnerType {
	/**
	 * 用户
	 */
	USER(1, "用户"),
	/**
	 * 部门
	 */
	DEPARTMENT(2, "部门");

	OwnerType(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer code;

	private String name;

	public static OwnerType of(Integer code) {
		return Stream.of(values())
				.filter(ownerType -> ownerType.getCode().equals(code))
				.findAny().orElse(null);
	}
}
