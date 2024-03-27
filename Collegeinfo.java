package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Collegeinfo
* Description: 学院信息实体类
*/
@TableName("Collegeinfo")
public class Collegeinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 编号
    */
        private Integer id;
    /**
    * 院系名
    */
        private String collegename;
    /**
    * 备注
    */
        private String collegeintro;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public String getCollegename() {
        return collegename;
        }

        public void setCollegename(String collegename) {
        this.collegename = collegename;
        }

        public String getCollegeintro() {
        return collegeintro;
        }

        public void setCollegeintro(String collegeintro) {
        this.collegeintro = collegeintro;
        }


}
