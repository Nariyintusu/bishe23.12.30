package teach.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import teach.common.annotation.Excel;
import teach.common.core.domain.BaseEntity;

/**
 * 班级对象 tcclasses
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
public class Tcclasses extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级ID */
    private Long classId;

    /** 班级名称 */
    @Excel(name = "班级名称")
    private String className;

    /** 班主任 */
    @Excel(name = "班主任")
    private String classTeacher;

    /** 学生人数 */
    @Excel(name = "学生人数")
    private Long studentCount;

    /** 入学年份 */
    @Excel(name = "入学年份")
    private Long entryYear;

    /** 所属年级 */
    @Excel(name = "所属年级")
    private String grade;

    /** 所属专业 */
    @Excel(name = "所属专业")
    private String major;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationDate;

    /** 最后更新日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdatedDate;

    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }
    public void setClassTeacher(String classTeacher) 
    {
        this.classTeacher = classTeacher;
    }

    public String getClassTeacher() 
    {
        return classTeacher;
    }
    public void setStudentCount(Long studentCount) 
    {
        this.studentCount = studentCount;
    }

    public Long getStudentCount() 
    {
        return studentCount;
    }
    public void setEntryYear(Long entryYear) 
    {
        this.entryYear = entryYear;
    }

    public Long getEntryYear() 
    {
        return entryYear;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setCreationDate(Date creationDate) 
    {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() 
    {
        return creationDate;
    }
    public void setLastUpdatedDate(Date lastUpdatedDate) 
    {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getLastUpdatedDate() 
    {
        return lastUpdatedDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("classId", getClassId())
            .append("className", getClassName())
            .append("classTeacher", getClassTeacher())
            .append("studentCount", getStudentCount())
            .append("entryYear", getEntryYear())
            .append("grade", getGrade())
            .append("major", getMajor())
            .append("creationDate", getCreationDate())
            .append("lastUpdatedDate", getLastUpdatedDate())
            .toString();
    }
}
