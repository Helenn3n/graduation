package com.sm.graduation.dormitory.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DormitoryAllocation {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	public Short getLiving() {
		return living;
	}
	public void setLiving(Short living) {
		this.living = living;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/** 编号 */
	private Long id;
	/** 宿舍 */
	private String dormitory;
	/** 0无人居住 1有人居住 */
	private Short living;
	private String name;
}
