package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Cultureinfo
* Description: 培养信息实体类
*/
@TableName("Cultureinfo")
public class Cultureinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 培养方案ID
    */
        private Integer id;
    /**
    * 专业ID
    */
        private String majorid;
    /**
    * 版本
    */
        private String versions;
    /**
    * 支撑矩阵表
    */
        private String matrixtable;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public String getMajorid() {
        return majorid;
        }

        public void setMajorid(String majorid) {
        this.majorid = majorid;
        }

        public String getVersions() {
        return versions;
        }

        public void setVersions(String versions) {
        this.versions = versions;
        }

        public String getMatrixtable() {
        return matrixtable;
        }

        public void setMatrixtable(String matrixtable) {
        this.matrixtable = matrixtable;
        }


}
