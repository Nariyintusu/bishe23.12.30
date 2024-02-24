package teach.system.service;

import java.util.List;
import teach.system.domain.Courseselection;

/**
 * 选课Service接口
 * 
 * @author x
 * @date 2024-02-18
 */
public interface ICourseselectionService 
{
    /**
     * 查询选课
     * 
     * @param chooseId 选课主键
     * @return 选课
     */
    public Courseselection selectCourseselectionByChooseId(Long chooseId);

    /**
     * 查询选课列表
     * 
     * @param courseselection 选课
     * @return 选课集合
     */
    public List<Courseselection> selectCourseselectionList(Courseselection courseselection);

    /**
     * 新增选课
     * 
     * @param courseselection 选课
     * @return 结果
     */
    public int insertCourseselection(Courseselection courseselection);

    /**
     * 修改选课
     * 
     * @param courseselection 选课
     * @return 结果
     */
    public int updateCourseselection(Courseselection courseselection);

    /**
     * 批量删除选课
     * 
     * @param chooseIds 需要删除的选课主键集合
     * @return 结果
     */
    public int deleteCourseselectionByChooseIds(Long[] chooseIds);

    /**
     * 删除选课信息
     * 
     * @param chooseId 选课主键
     * @return 结果
     */
    public int deleteCourseselectionByChooseId(Long chooseId);
}
