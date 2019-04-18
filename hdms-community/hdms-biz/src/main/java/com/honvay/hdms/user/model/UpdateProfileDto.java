/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌瀚为云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.user.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author LIQIU
 * created on 2019/3/12
 **/
@Data
public class UpdateProfileDto {

	private Integer id;

	@NotEmpty
	private String name;

	@NotEmpty
	private String email;

	@NotEmpty
	private String mode;

	@NotEmpty
	private String phoneNumber;

	@NotEmpty
	private String sortField;

	@NotNull
	private Boolean sortDesc;

}
