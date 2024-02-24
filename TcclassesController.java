package teach.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teach.common.annotation.Log;
import teach.common.core.controller.BaseController;
import teach.common.core.domain.AjaxResult;
import teach.common.enums.BusinessType;
import teach.system.domain.Tcclasses;
import teach.system.service.ITcclassesService;
import teach.common.utils.poi.ExcelUtil;
import teach.common.core.page.TableDataInfo;

/**
 * 班级Controller
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
@RestController
@RequestMapping("/system/tcclasses")
public class TcclassesController extends BaseController
{
    @Autowired
    private ITcclassesService tcclassesService;

    /**
     * 查询班级列表
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:list')")
    @GetMapping("/list")
    public TableDataInfo list(Tcclasses tcclasses)
    {
        startPage();
        List<Tcclasses> list = tcclassesService.selectTcclassesList(tcclasses);
        return getDataTable(list);
    }

    /**
     * 导出班级列表
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:export')")
    @Log(title = "班级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Tcclasses tcclasses)
    {
        List<Tcclasses> list = tcclassesService.selectTcclassesList(tcclasses);
        ExcelUtil<Tcclasses> util = new ExcelUtil<Tcclasses>(Tcclasses.class);
        util.exportExcel(response, list, "班级数据");
    }

    /**
     * 获取班级详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:query')")
    @GetMapping(value = "/{classId}")
    public AjaxResult getInfo(@PathVariable("classId") Long classId)
    {
        return success(tcclassesService.selectTcclassesByClassId(classId));
    }

    /**
     * 新增班级
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:add')")
    @Log(title = "班级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Tcclasses tcclasses)
    {
        return toAjax(tcclassesService.insertTcclasses(tcclasses));
    }

    /**
     * 修改班级
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:edit')")
    @Log(title = "班级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Tcclasses tcclasses)
    {
        return toAjax(tcclassesService.updateTcclasses(tcclasses));
    }

    /**
     * 删除班级
     */
    @PreAuthorize("@ss.hasPermi('system:tcclasses:remove')")
    @Log(title = "班级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classIds}")
    public AjaxResult remove(@PathVariable Long[] classIds)
    {
        return toAjax(tcclassesService.deleteTcclassesByClassIds(classIds));
    }
}
