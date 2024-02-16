package com.sm.graduation.accident.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccidentRecord {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccident() {
		return accident;
	}
	public void setAccident(String accident) {
		this.accident = accident;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAccTime() {
		return accTime;
	}
	public void setAccTime(String accTime) {
		this.accTime = accTime;
	}
	public Long getLoss() {
		return loss;
	}
	public void setLoss(Long loss) {
		this.loss = loss;
	}
	/** 编号 */
	private Long id;
	/** 事故 */
	private String accident;
	private String desc;
	/** 年月 */
	private String accTime;
	/** 损失 */
	private Long loss;

}
