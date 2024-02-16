package teach.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teach.system.mapper.LessonsMapper;
import teach.system.domain.Lessons;
import teach.system.service.ILessonsService;

/**
 * 课程信息管理Service业务层处理
 * 
 * @author d
 * @date 2024-02-10
 */
@Service
public class LessonsServiceImpl implements ILessonsService 
{
    @Autowired
    private LessonsMapper lessonsMapper;

    /**
     * 查询课程信息管理
     * 
     * @param courseCode 课程信息管理主键
     * @return 课程信息管理
     */
    @Override
    public Lessons selectLessonsByCourseCode(String courseCode)
    {
        return lessonsMapper.selectLessonsByCourseCode(courseCode);
    }

    /**
     * 查询课程信息管理列表
     * 
     * @param lessons 课程信息管理
     * @return 课程信息管理
     */
    @Override
    public List<Lessons> selectLessonsList(Lessons lessons)
    {
        return lessonsMapper.selectLessonsList(lessons);
    }

    /**
     * 新增课程信息管理
     * 
     * @param lessons 课程信息管理
     * @return 结果
     */
    @Override
    public int insertLessons(Lessons lessons)
    {
        return lessonsMapper.insertLessons(lessons);
    }

    /**
     * 修改课程信息管理
     * 
     * @param lessons 课程信息管理
     * @return 结果
     */
    @Override
    public int updateLessons(Lessons lessons)
    {
        return lessonsMapper.updateLessons(lessons);
    }

    /**
     * 批量删除课程信息管理
     * 
     * @param courseCodes 需要删除的课程信息管理主键
     * @return 结果
     */
    @Override
    public int deleteLessonsByCourseCodes(String[] courseCodes)
    {
        return lessonsMapper.deleteLessonsByCourseCodes(courseCodes);
    }

    /**
     * 删除课程信息管理信息
     * 
     * @param courseCode 课程信息管理主键
     * @return 结果
     */
    @Override
    public int deleteLessonsByCourseCode(String courseCode)
    {
        return lessonsMapper.deleteLessonsByCourseCode(courseCode);
    }
}
