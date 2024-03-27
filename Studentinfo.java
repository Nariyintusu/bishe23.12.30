package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Studentinfo
* Description: 学生信息实体类
*/
@TableName("Studentinfo")
public class Studentinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 学号
    */
        private Integer stuid;
    /**
    * 姓名
    */
        private String name;
    /**
    * 性别
    */
        private String sex;
    /**
    * 专业ID
    */
        private String majorid;
    /**
    * 所属院系ID
    */
        private String cid;


        public Integer getStuid() {
        return stuid;
        }

        public void setStuid(Integer stuid) {
        this.stuid = stuid;
        }

        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public String getSex() {
        return sex;
        }

        public void setSex(String sex) {
        this.sex = sex;
        }

        public String getMajorid() {
        return majorid;
        }

        public void setMajorid(String majorid) {
        this.majorid = majorid;
        }

        public String getCid() {
        return cid;
        }

        public void setCid(String cid) {
        this.cid = cid;
        }


}
