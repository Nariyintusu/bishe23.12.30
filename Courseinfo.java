package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * ClassName:Courseinfo
 * Description: 课程信息实体类
 */
@TableName("Courseinfo")
public class Courseinfo {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 课程编号
     */
    private String id;
    /**
     * 课程名
     */
    private String name;
    /**
     * 学分
     */
    private String score;
    /**
     * 课程大钢
     */
    private String outline;
    /**
     * 课程负责人工号
     */
    private String manageid;
    /**
     * 所属院系ID
     */
    private String cid;
    /**
     * 学时
     */
    private String classhour;
    /**
     * 命题表
     */
    private String a1;
    /**
     * 大纲表
     */
    private String a2;
    /**
     * 成绩表
     */
    private String a3;
    /**
     * 达成度
     */
    private String a4;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getManageid() {
        return manageid;
    }

    public void setManageid(String manageid) {
        this.manageid = manageid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getClasshour() {
        return classhour;
    }

    public void setClasshour(String classhour) {
        this.classhour = classhour;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }


}
