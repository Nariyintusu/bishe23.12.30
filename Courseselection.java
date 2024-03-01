package teach.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import teach.common.annotation.Excel;
import teach.common.core.domain.BaseEntity;

/**
 * 选课对象 courseselection
 * 
 * @author x
 * @date 2024-02-18
 */
public class Courseselection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 选课ID */
    private Long chooseId;

    /** 学生ID */
    @Excel(name = "学生ID")
    private Long studentId;

    /** 课程ID */
    @Excel(name = "课程ID")
    private Long courseId;

    /** 选课状态 */
    @Excel(name = "选课状态")
    private String chooseStatus;

    /** 选课时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "选课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chooseTime;

    /** 分数 */
    @Excel(name = "分数")
    private Long score;

    /** 学期 */
    @Excel(name = "学期")
    private String semester;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setChooseId(Long chooseId) 
    {
        this.chooseId = chooseId;
    }

    public Long getChooseId() 
    {
        return chooseId;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setChooseStatus(String chooseStatus) 
    {
        this.chooseStatus = chooseStatus;
    }

    public String getChooseStatus() 
    {
        return chooseStatus;
    }
    public void setChooseTime(Date chooseTime) 
    {
        this.chooseTime = chooseTime;
    }

    public Date getChooseTime() 
    {
        return chooseTime;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setSemester(String semester) 
    {
        this.semester = semester;
    }

    public String getSemester() 
    {
        return semester;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chooseId", getChooseId())
            .append("studentId", getStudentId())
            .append("courseId", getCourseId())
            .append("chooseStatus", getChooseStatus())
            .append("chooseTime", getChooseTime())
            .append("score", getScore())
            .append("semester", getSemester())
            .append("remarks", getRemarks())
            .toString();
    }
}
