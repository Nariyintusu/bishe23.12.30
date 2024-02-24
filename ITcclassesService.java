package teach.system.service;

import java.util.List;
import teach.system.domain.Tcclasses;

/**
 * 班级Service接口
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
public interface ITcclassesService 
{
    /**
     * 查询班级
     * 
     * @param classId 班级主键
     * @return 班级
     */
    public Tcclasses selectTcclassesByClassId(Long classId);

    /**
     * 查询班级列表
     * 
     * @param tcclasses 班级
     * @return 班级集合
     */
    public List<Tcclasses> selectTcclassesList(Tcclasses tcclasses);

    /**
     * 新增班级
     * 
     * @param tcclasses 班级
     * @return 结果
     */
    public int insertTcclasses(Tcclasses tcclasses);

    /**
     * 修改班级
     * 
     * @param tcclasses 班级
     * @return 结果
     */
    public int updateTcclasses(Tcclasses tcclasses);

    /**
     * 批量删除班级
     * 
     * @param classIds 需要删除的班级主键集合
     * @return 结果
     */
    public int deleteTcclassesByClassIds(Long[] classIds);

    /**
     * 删除班级信息
     * 
     * @param classId 班级主键
     * @return 结果
     */
    public int deleteTcclassesByClassId(Long classId);
}
