package teach.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import teach.common.annotation.Excel;
import teach.common.core.domain.BaseEntity;

/**
 * 课程信息管理对象 lessons
 * 
 * @author d
 * @date 2024-02-10
 */
public class Lessons extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课号 */
    private String courseCode;

    /** 课名 */
    @Excel(name = "课名")
    private String courseName;

    /** 课程大纲 */
    @Excel(name = "课程大纲")
    private String courseSyllabus;

    /** 课程负责人工号 */
    @Excel(name = "课程负责人工号")
    private String courseCoordinatorId;

    public void setCourseCode(String courseCode) 
    {
        this.courseCode = courseCode;
    }

    public String getCourseCode() 
    {
        return courseCode;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseSyllabus(String courseSyllabus) 
    {
        this.courseSyllabus = courseSyllabus;
    }

    public String getCourseSyllabus() 
    {
        return courseSyllabus;
    }
    public void setCourseCoordinatorId(String courseCoordinatorId) 
    {
        this.courseCoordinatorId = courseCoordinatorId;
    }

    public String getCourseCoordinatorId() 
    {
        return courseCoordinatorId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("courseCode", getCourseCode())
            .append("courseName", getCourseName())
            .append("courseSyllabus", getCourseSyllabus())
            .append("courseCoordinatorId", getCourseCoordinatorId())
            .toString();
    }
}
