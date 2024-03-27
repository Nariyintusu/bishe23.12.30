package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Scheduleinfo
* Description: 课表信息实体类
*/
@TableName("Scheduleinfo")
public class Scheduleinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 课表ID
    */
        private Integer id;
    /**
    * 学期
    */
        private String semester;
    /**
    * 课号
    */
        private String coursenum;
    /**
    * 教师工号
    */
        private String tid;
    /**
    * 班级ID
    */
        private String classid;
    /**
    * 时间
    */
        private String times;
    /**
    * 备注
    */
        private String intro;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public String getSemester() {
        return semester;
        }

        public void setSemester(String semester) {
        this.semester = semester;
        }

        public String getCoursenum() {
        return coursenum;
        }

        public void setCoursenum(String coursenum) {
        this.coursenum = coursenum;
        }

        public String getTid() {
        return tid;
        }

        public void setTid(String tid) {
        this.tid = tid;
        }

        public String getClassid() {
        return classid;
        }

        public void setClassid(String classid) {
        this.classid = classid;
        }

        public String getTimes() {
        return times;
        }

        public void setTimes(String times) {
        this.times = times;
        }

        public String getIntro() {
        return intro;
        }

        public void setIntro(String intro) {
        this.intro = intro;
        }


}
