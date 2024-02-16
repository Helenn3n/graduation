package com.sm.graduation.visitor.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getViTime() {
		return viTime;
	}
	public void setViTime(String viTime) {
		this.viTime = viTime;
	}
	/** 编号 */
	private Long id;
	/** 访客姓名 */
	private String name;
	/** 访问对象 */
	private String target;
	/** 日期 */
	private String viTime;

}
