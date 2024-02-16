package com.sm.graduation.food.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyCatering {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonName() {
		return monName;
	}
	public void setMonName(String monName) {
		this.monName = monName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getMonTime() {
		return monTime;
	}
	public void setMonTime(String monTime) {
		this.monTime = monTime;
	}
	/** 编号 */
	private Long id;
	/** 菜肴 */
	private String monName;
	/** 费用 */
	private Integer cost;
	/** 日期 */
	private String monTime;
}
