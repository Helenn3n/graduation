package com.sm.graduation.registry.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author HelenZhang
 * @Date 2024/3/4 09:27
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registry {
    public Long getOlderId() {
        return elderId;
    }
    public void setOlderId(Long elderId) {
        this.elderId = elderId;
    }
    public String getOlderName() {
        return elderName;
    }
    public void setOlderName(String elderName) {
        this.elderName = elderName;
    }
    public String getOlderSex() {
        return elderSex;
    }
    public void setOlderSex(String elderSex) {
        this.elderSex = elderSex;
    }
    public Long getOlderTel() {
        return elderTel;
    }
    public void setOlderTel(Long elderTel) {
        this.elderTel = elderTel;
    }
    public String getOlderAddr() {
        return elderAddr;
    }
    public void setOlderAddr(String elderAddr) {
        this.elderAddr = elderAddr;
    }
    public String getOlderIdcard() {
        return elderIdcard;
    }
    public void setOlderIdcard(String elderIdcard) {
        this.elderIdcard = elderIdcard;
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
    private Long elderId;
    /** 姓名 */
    private String elderName;
    private String elderSex;
    /** 电话 */
    private Long elderTel;
    /** 住址 */
    private String elderAddr;
    /** 身份证号码 */
    private String elderIdcard;
    private String inTime;
    private String outTime;

}