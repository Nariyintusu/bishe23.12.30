package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Teacherinfo
* Description: 教师信息实体类
*/
@TableName("Teacherinfo")
public class Teacherinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 工号
    */
        private Integer id;
    /**
    * 姓名
    */
        private String name;
    /**
    * 性别
    */
        private String sex;
    /**
    * 联系电话
    */
        private String phone;
    /**
    * 登录密码
    */
        private String password;
    /**
    * 所属院系ID
    */
        private String cid;
    /**
    * 职称
    */
        private String title;
    /**
    * 职务
    */
        private String job;
    /**
    * 权限
    */
        private String power;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
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

        public String getPhone() {
        return phone;
        }

        public void setPhone(String phone) {
        this.phone = phone;
        }

        public String getPassword() {
        return password;
        }

        public void setPassword(String password) {
        this.password = password;
        }

        public String getCid() {
        return cid;
        }

        public void setCid(String cid) {
        this.cid = cid;
        }

        public String getTitle() {
        return title;
        }

        public void setTitle(String title) {
        this.title = title;
        }

        public String getJob() {
        return job;
        }

        public void setJob(String job) {
        this.job = job;
        }

        public String getPower() {
        return power;
        }

        public void setPower(String power) {
        this.power = power;
        }


}
