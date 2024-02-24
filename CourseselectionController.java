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
import teach.system.domain.Courseselection;
import teach.system.service.ICourseselectionService;
import teach.common.utils.poi.ExcelUtil;
import teach.common.core.page.TableDataInfo;

/**
 * 选课Controller
 * 
 * @author x
 * @date 2024-02-18
 */
@RestController
@RequestMapping("/system/courseselection")
public class CourseselectionController extends BaseController
{
    @Autowired
    private ICourseselectionService courseselectionService;

    /**
     * 查询选课列表
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:list')")
    @GetMapping("/list")
    public TableDataInfo list(Courseselection courseselection)
    {
        startPage();
        List<Courseselection> list = courseselectionService.selectCourseselectionList(courseselection);
        return getDataTable(list);
    }

    /**
     * 导出选课列表
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:export')")
    @Log(title = "选课", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Courseselection courseselection)
    {
        List<Courseselection> list = courseselectionService.selectCourseselectionList(courseselection);
        ExcelUtil<Courseselection> util = new ExcelUtil<Courseselection>(Courseselection.class);
        util.exportExcel(response, list, "选课数据");
    }

    /**
     * 获取选课详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:query')")
    @GetMapping(value = "/{chooseId}")
    public AjaxResult getInfo(@PathVariable("chooseId") Long chooseId)
    {
        return success(courseselectionService.selectCourseselectionByChooseId(chooseId));
    }

    /**
     * 新增选课
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:add')")
    @Log(title = "选课", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Courseselection courseselection)
    {
        return toAjax(courseselectionService.insertCourseselection(courseselection));
    }

    /**
     * 修改选课
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:edit')")
    @Log(title = "选课", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Courseselection courseselection)
    {
        return toAjax(courseselectionService.updateCourseselection(courseselection));
    }

    /**
     * 删除选课
     */
    @PreAuthorize("@ss.hasPermi('system:courseselection:remove')")
    @Log(title = "选课", businessType = BusinessType.DELETE)
	@DeleteMapping("/{chooseIds}")
    public AjaxResult remove(@PathVariable Long[] chooseIds)
    {
        return toAjax(courseselectionService.deleteCourseselectionByChooseIds(chooseIds));
    }
}
