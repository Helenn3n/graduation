package com.sm.graduation.high.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HighRisk {
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
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getHighCase() {
		return highCase;
	}
	public void setHighCase(String highCase) {
		this.highCase = highCase;
	}
	public String getRelatives() {
		return relatives;
	}
	public void setRelatives(String relatives) {
		this.relatives = relatives;
	}
	public Long getReTel() {
		return reTel;
	}
	public void setReTel(Long reTel) {
		this.reTel = reTel;
	}
	/** 档案编号 */
	private Long id;
	/** 姓名 */
	private String name;
	/** 电话 */
	private Long tel;
	/** 病例 */
	private String highCase;
	/** 亲属 */
	private String relatives;
	/** 亲属电话 */
	private Long reTel;

}
