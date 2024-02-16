package com.sm.graduation.test.pojo;

import com.sm.graduation.nurse.pojo.Nursing;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author HelenZhang
 * @Date 2024/1/22 02:03
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    /** 编号 */
    private Long id;
    /** 费用 */
    private Double cost;
    /** 年份 */
    private String year;

}
