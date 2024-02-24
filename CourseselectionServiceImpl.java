package teach.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teach.system.mapper.CourseselectionMapper;
import teach.system.domain.Courseselection;
import teach.system.service.ICourseselectionService;

/**
 * 选课Service业务层处理
 * 
 * @author x
 * @date 2024-02-18
 */
@Service
public class CourseselectionServiceImpl implements ICourseselectionService 
{
    @Autowired
    private CourseselectionMapper courseselectionMapper;

    /**
     * 查询选课
     * 
     * @param chooseId 选课主键
     * @return 选课
     */
    @Override
    public Courseselection selectCourseselectionByChooseId(Long chooseId)
    {
        return courseselectionMapper.selectCourseselectionByChooseId(chooseId);
    }

    /**
     * 查询选课列表
     * 
     * @param courseselection 选课
     * @return 选课
     */
    @Override
    public List<Courseselection> selectCourseselectionList(Courseselection courseselection)
    {
        return courseselectionMapper.selectCourseselectionList(courseselection);
    }

    /**
     * 新增选课
     * 
     * @param courseselection 选课
     * @return 结果
     */
    @Override
    public int insertCourseselection(Courseselection courseselection)
    {
        return courseselectionMapper.insertCourseselection(courseselection);
    }

    /**
     * 修改选课
     * 
     * @param courseselection 选课
     * @return 结果
     */
    @Override
    public int updateCourseselection(Courseselection courseselection)
    {
        return courseselectionMapper.updateCourseselection(courseselection);
    }

    /**
     * 批量删除选课
     * 
     * @param chooseIds 需要删除的选课主键
     * @return 结果
     */
    @Override
    public int deleteCourseselectionByChooseIds(Long[] chooseIds)
    {
        return courseselectionMapper.deleteCourseselectionByChooseIds(chooseIds);
    }

    /**
     * 删除选课信息
     * 
     * @param chooseId 选课主键
     * @return 结果
     */
    @Override
    public int deleteCourseselectionByChooseId(Long chooseId)
    {
        return courseselectionMapper.deleteCourseselectionByChooseId(chooseId);
    }
}
