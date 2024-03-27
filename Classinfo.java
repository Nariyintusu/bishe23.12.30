package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Classinfo
* Description: 班级信息实体类
*/
@TableName("Classinfo")
public class Classinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 班级ID
    */
        private Integer id;
    /**
    * 年级
    */
        private String grade;
    /**
    * 专业名
    */
        private String majorname;
    /**
    * 专业ID
    */
        private String majorid;
    /**
    * 人数
    */
        private String nums;
    /**
    * 学生表
    */
        private String stuinfo;
    /**
    * 培养方案版本
    */
        private String versions;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public String getGrade() {
        return grade;
        }

        public void setGrade(String grade) {
        this.grade = grade;
        }

        public String getMajorname() {
        return majorname;
        }

        public void setMajorname(String majorname) {
        this.majorname = majorname;
        }

        public String getMajorid() {
        return majorid;
        }

        public void setMajorid(String majorid) {
        this.majorid = majorid;
        }

        public String getNums() {
        return nums;
        }

        public void setNums(String nums) {
        this.nums = nums;
        }

        public String getStuinfo() {
        return stuinfo;
        }

        public void setStuinfo(String stuinfo) {
        this.stuinfo = stuinfo;
        }

        public String getVersions() {
        return versions;
        }

        public void setVersions(String versions) {
        this.versions = versions;
        }


}
