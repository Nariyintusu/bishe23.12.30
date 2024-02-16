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
import teach.system.domain.Lessons;
import teach.system.service.ILessonsService;
import teach.common.utils.poi.ExcelUtil;
import teach.common.core.page.TableDataInfo;

/**
 * 课程信息管理Controller
 * 
 * @author d
 * @date 2024-02-10
 */
@RestController
@RequestMapping("/system/lessons")
public class LessonsController extends BaseController
{
    @Autowired
    private ILessonsService lessonsService;

    /**
     * 查询课程信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:list')")
    @GetMapping("/list")
    public TableDataInfo list(Lessons lessons)
    {
        startPage();
        List<Lessons> list = lessonsService.selectLessonsList(lessons);
        return getDataTable(list);
    }

    /**
     * 导出课程信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:export')")
    @Log(title = "课程信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Lessons lessons)
    {
        List<Lessons> list = lessonsService.selectLessonsList(lessons);
        ExcelUtil<Lessons> util = new ExcelUtil<Lessons>(Lessons.class);
        util.exportExcel(response, list, "课程信息管理数据");
    }

    /**
     * 获取课程信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:query')")
    @GetMapping(value = "/{courseCode}")
    public AjaxResult getInfo(@PathVariable("courseCode") String courseCode)
    {
        return success(lessonsService.selectLessonsByCourseCode(courseCode));
    }

    /**
     * 新增课程信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:add')")
    @Log(title = "课程信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Lessons lessons)
    {
        return toAjax(lessonsService.insertLessons(lessons));
    }

    /**
     * 修改课程信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:edit')")
    @Log(title = "课程信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Lessons lessons)
    {
        return toAjax(lessonsService.updateLessons(lessons));
    }

    /**
     * 删除课程信息管理
     */
    @PreAuthorize("@ss.hasPermi('system:lessons:remove')")
    @Log(title = "课程信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseCodes}")
    public AjaxResult remove(@PathVariable String[] courseCodes)
    {
        return toAjax(lessonsService.deleteLessonsByCourseCodes(courseCodes));
    }
}
