package teach.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teach.system.mapper.TcclassesMapper;
import teach.system.domain.Tcclasses;
import teach.system.service.ITcclassesService;

/**
 * 班级Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
@Service
public class TcclassesServiceImpl implements ITcclassesService 
{
    @Autowired
    private TcclassesMapper tcclassesMapper;

    /**
     * 查询班级
     * 
     * @param classId 班级主键
     * @return 班级
     */
    @Override
    public Tcclasses selectTcclassesByClassId(Long classId)
    {
        return tcclassesMapper.selectTcclassesByClassId(classId);
    }

    /**
     * 查询班级列表
     * 
     * @param tcclasses 班级
     * @return 班级
     */
    @Override
    public List<Tcclasses> selectTcclassesList(Tcclasses tcclasses)
    {
        return tcclassesMapper.selectTcclassesList(tcclasses);
    }

    /**
     * 新增班级
     * 
     * @param tcclasses 班级
     * @return 结果
     */
    @Override
    public int insertTcclasses(Tcclasses tcclasses)
    {
        return tcclassesMapper.insertTcclasses(tcclasses);
    }

    /**
     * 修改班级
     * 
     * @param tcclasses 班级
     * @return 结果
     */
    @Override
    public int updateTcclasses(Tcclasses tcclasses)
    {
        return tcclassesMapper.updateTcclasses(tcclasses);
    }

    /**
     * 批量删除班级
     * 
     * @param classIds 需要删除的班级主键
     * @return 结果
     */
    @Override
    public int deleteTcclassesByClassIds(Long[] classIds)
    {
        return tcclassesMapper.deleteTcclassesByClassIds(classIds);
    }

    /**
     * 删除班级信息
     * 
     * @param classId 班级主键
     * @return 结果
     */
    @Override
    public int deleteTcclassesByClassId(Long classId)
    {
        return tcclassesMapper.deleteTcclassesByClassId(classId);
    }
}
