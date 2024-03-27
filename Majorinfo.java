package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Majorinfo
* Description: 专业信息实体类
*/
@TableName("Majorinfo")
public class Majorinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 专业ID
    */
        private Integer id;
    /**
    * 专业名
    */
        private String majorname;
    /**
    * 所属院系ID
    */
        private String cid;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public String getMajorname() {
        return majorname;
        }

        public void setMajorname(String majorname) {
        this.majorname = majorname;
        }

        public String getCid() {
        return cid;
        }

        public void setCid(String cid) {
        this.cid = cid;
        }


}
