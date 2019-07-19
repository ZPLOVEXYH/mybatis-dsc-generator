/**
 * @filename:${entityName}Controller ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2018 ${author} Co. Ltd. 
 * All right reserved. 
 */
package ${controllerUrl};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.samples.depot.common.utils.JsonResult;
import cn.samples.depot.common.utils.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.item.util.AppPage;
import com.item.util.JsonResult;
import ${entityUrl}.${entityName};
import ${serviceUrl}.${entityName}Service;
import lombok.extern.slf4j.Slf4j;
import cn.samples.depot.common.utils.Params;
import cn.samples.depot.web.bean.BaseQuery;
import javax.validation.Valid;
import java.util.Arrays;
import cn.samples.depot.common.model.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import cn.samples.depot.common.config.aop.AddLog;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import static cn.samples.depot.common.utils.Controllers.CODE;
import static cn.samples.depot.common.utils.Controllers.ID;
import static cn.samples.depot.common.utils.Controllers.QUERY;
import static cn.samples.depot.common.utils.Controllers.M_PAGE;
import static cn.samples.depot.web.controller.${entityName}Controller.API;

/**
 *
 * @Description:  ${entityComment}接口层
 * @Author:       ${author}
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 *
 */
@Api(description = "${entityComment}",value="${entityComment}")
@RestController
@RequestMapping(value = API)
@Slf4j
public class ${entityName}Controller {

	static final String API = "/${entityName}";

	@Autowired
	private ${entityName}Service ${objectName}Service;

    /**
    * @explain 分页条件查询${entityComment}
    * @return  PageInfo<${entityName}>
    * @author  ${author}
    * @time    ${createTime}
    */
    @AddLog
    @GetMapping
    @ApiOperation(value = "分页查询", notes = "分页查询返回对象[PageInfo<${entityName}>],作者：${author}")
    public JsonResult index(@RequestBody ${entityName} ${objectName},
    @RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum,
    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {

		QueryWrapper<${entityName}> wrapper = new QueryWrapper<>();
		if (null != ${objectName}.getEnable()) {
		wrapper.lambda().eq(${entityName}::getEnable, ${objectName}.getEnable());
		}

		// 查询第1页，每页返回10条
		Page<${entityName}> page = new Page<>(pageNum, pageSize);

        return JsonResult.data(Params.param(M_PAGE, ${objectName}Service.page(page, wrapper))
        .set("query", Optional.ofNullable(${objectName}).orElseGet(${entityName}::new))
        .set("status", Lists.newArrayList(Status.ENABLED, Status.DISABLED)));
    }

	/**
	 * @explain 保存${entityComment}对象
	 * @return  int
	 * @author  ${author}
	 * @time    ${createTime}
	 */
    @AddLog
    @PostMapping
	@ApiOperation(value = "保存${entityComment}", notes = "保存${entityComment}[${objectName}],作者：${author}")
	public JsonResult save(@RequestBody ${entityName} ${objectName}) {
		return JsonResult.data(${objectName}Service.save(${objectName}));
	}

	/**
	 * @explain 单个删除${entityComment}对象
	 * @return  int
	 * @author  ${author}
	 * @time    ${createTime}
	 */
    @AddLog
    @DeleteMapping(value = ID)
	@ApiOperation(value = "单个删除${entityComment}", notes = "单个删除${entityComment},作者：${author}")
	public JsonResult deleteSingle(@PathVariable String id) {
    	return JsonResult.data(${objectName}Service.removeById(id));
	}

	/**
	 * @explain 批量删除${entityComment}对象
	 * @return  int
	 * @author  ${author}
	 * @time    ${createTime}
	 */
    @AddLog
    @DeleteMapping
	@ApiOperation(value = "批量删除${entityComment}", notes = "批量删除${entityComment},作者：${author}")
	public JsonResult deleteBatch(@RequestParam("ids") String... ids) {
    	return JsonResult.data(${objectName}Service.removeByIds(Arrays.asList(ids)));
	}

	/**
	 * @explain 更新${entityComment}对象
	 * @return  ${objectName}
	 * @author  ${author}
	 * @time    ${createTime}
	 */
    @AddLog
    @PutMapping(value = ID)
	@ApiOperation(value = "更新${entityComment}", notes = "更新${entityComment}[${objectName}],作者：${author}")
	public JsonResult update(@RequestBody ${entityName} ${objectName}) {
		return JsonResult.data(${objectName}Service.update(${objectName}, Wrappers.<${entityName}>lambdaQuery().eq(${entityName}::getId, ${objectName}.getId())));
	}

}