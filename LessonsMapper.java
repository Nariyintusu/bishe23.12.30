package teach.system.mapper;

import java.util.List;
import teach.system.domain.Lessons;

/**
 * 课程信息管理Mapper接口
 * 
 * @author d
 * @date 2024-02-10
 */
public interface LessonsMapper 
{
    /**
     * 查询课程信息管理
     * 
     * @param courseCode 课程信息管理主键
     * @return 课程信息管理
     */
    public Lessons selectLessonsByCourseCode(String courseCode);

    /**
     * 查询课程信息管理列表
     * 
     * @param lessons 课程信息管理
     * @return 课程信息管理集合
     */
    public List<Lessons> selectLessonsList(Lessons lessons);

    /**
     * 新增课程信息管理
     * 
     * @param lessons 课程信息管理
     * @return 结果
     */
    public int insertLessons(Lessons lessons);

    /**
     * 修改课程信息管理
     * 
     * @param lessons 课程信息管理
     * @return 结果
     */
    public int updateLessons(Lessons lessons);

    /**
     * 删除课程信息管理
     * 
     * @param courseCode 课程信息管理主键
     * @return 结果
     */
    public int deleteLessonsByCourseCode(String courseCode);

    /**
     * 批量删除课程信息管理
     * 
     * @param courseCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLessonsByCourseCodes(String[] courseCodes);
}
