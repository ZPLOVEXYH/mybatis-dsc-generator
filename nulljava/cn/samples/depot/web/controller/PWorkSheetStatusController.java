/**
 * @filename:PWorkSheetStatusController 2019年7月16日
 * @project depot-manager  V1.0
 * Copyright(c) 2018 ZhangPeng Co. Ltd. 
 * All right reserved. 
 */
package cn.samples.depot.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.item.util.AppPage;
import com.item.util.JsonResult;
import cn.samples.depot.web.entity.PWorkSheetStatus;
import cn.samples.depot.web.service.PWorkSheetStatusService;
import lombok.extern.slf4j.Slf4j;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**   
 * 
 * @Description:  作业单状态表接口层
 * @Author:       ZhangPeng   
 * @CreateDate:   2019年7月16日
 * @Version:      V1.0
 *    
 */
@Api(description = "作业单状态表",value="作业单状态表" )
@RestController
@RequestMapping(value = API)
@Slf4j
public class PWorkSheetStatusController {

	static final String API = "/PWorkSheetStatus";
	
	@Autowired
	private PWorkSheetStatusService pWorkSheetStatusService;
	
	/**
	 * @explain 查询作业单状态表对象  <swagger GET请求>
	 * @param   对象参数：id
	 * @return  pWorkSheetStatus
	 * @author  ZhangPeng
	 * @time    2019年7月16日
	 */
	@GetMapping("/getPWorkSheetStatusById/{id}")
	@ApiOperation(value = "获取作业单状态表信息", notes = "获取作业单状态表信息[pWorkSheetStatus]，作者：ZhangPeng")
	@ApiImplicitParam(paramType="path", name = "id", value = "作业单状态表id", required = true, dataType = "FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> idType  [in template "controller.ftl" at line 60, column 119]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${idType}  [in template "controller.ftl" at line 60, column 117]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.EvalUtil.coerceModelToTextualCommon(EvalUtil.java:467)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:389)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:358)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:100)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:63)
	at freemarker.core.Environment.visit(Environment.java:330)
	at freemarker.core.Environment.visit(Environment.java:336)
	at freemarker.core.Environment.process(Environment.java:309)
	at freemarker.template.Template.process(Template.java:384)
	at com.github.mybatis.fl.util.FreemarkerUtil.createFile(FreemarkerUtil.java:62)
	at com.github.mybatis.fl.util.Generator.createController(Generator.java:77)
	at com.github.mybatis.fl.test.MyGenerator.main(MyGenerator.java:76)
