package com.sm.graduation.complaint.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author HelenZhang
 * @Date 2024/3/6 09:38
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Complaint {
    private Long id;
    private String comUsr;
    private String comInst;
    private String comContent;
    private String comResult;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComUsr() {
        return comUsr;
    }

    public void setComUsr(String comUsr) {
        this.comUsr = comUsr;
    }

    public String getComInst() {
        return comInst;
    }

    public void setComInst(String comInst) {
        this.comInst = comInst;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public String getComResult() {
        return comResult;
    }

    public void setComResult(String comResult) {
        this.comResult = comResult;
    }
}
