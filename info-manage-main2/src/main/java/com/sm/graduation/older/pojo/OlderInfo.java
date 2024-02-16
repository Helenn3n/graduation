package com.sm.graduation.older.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlderInfo {
	public Long getOlderId() {
		return olderId;
	}
	public void setOlderId(Long olderId) {
		this.olderId = olderId;
	}
	public String getOlderName() {
		return olderName;
	}
	public void setOlderName(String olderName) {
		this.olderName = olderName;
	}
	public String getOlderSex() {
		return olderSex;
	}
	public void setOlderSex(String olderSex) {
		this.olderSex = olderSex;
	}
	public Long getOlderTel() {
		return olderTel;
	}
	public void setOlderTel(Long olderTel) {
		this.olderTel = olderTel;
	}
	public String getOlderAddr() {
		return olderAddr;
	}
	public void setOlderAddr(String olderAddr) {
		this.olderAddr = olderAddr;
	}
	public String getOlderIdcard() {
		return olderIdcard;
	}
	public void setOlderIdcard(String olderIdcard) {
		this.olderIdcard = olderIdcard;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	/** 编号 */
	private Long olderId;
	/** 姓名 */
	private String olderName;
	private String olderSex;
	/** 电话 */
	private Long olderTel;
	/** 住址 */
	private String olderAddr;
	/** 身份证号码 */
	private String olderIdcard;
	private String inTime;
	private String outTime;

}
