/**
 * @filename:PWorkSheetStatusServiceImpl 2019年7月16日
 * @project depot-manager  V1.0
 * Copyright(c) 2018 ZhangPeng Co. Ltd. 
 * All right reserved. 
 */
package cn.samples.depot.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.util.AppPage;
import cn.samples.depot.web.entity.PWorkSheetStatus;
import cn.samples.depot.web.dao.PWorkSheetStatusMapper;
import cn.samples.depot.web.service.PWorkSheetStatusService;

/**   
 *  
 * @Description:  作业单状态表——SERVICEIMPL
 * @Author:       ZhangPeng   
 * @CreateDate:   2019年7月16日
 * @Version:      V1.0
 *    
 */
@Service
public class PWorkSheetStatusServiceImpl extends ServiceImpl<PWorkSheetStatusMapper, PWorkSheetStatus> implements PWorkSheetStatusService {
	
	@Autowired
	public PWorkSheetStatusMapper pWorkSheetStatusMapper;
	
	//查询对象
	@Override
	public PWorkSheetStatus selectByPrimaryKey(FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> idType  [in template "serviceImpl.ftl" at line 37, column 51]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${idType}  [in template "serviceImpl.ftl" at line 37, column 49]
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
	at com.github.mybatis.fl.util.Generator.createServiceImpl(Generator.java:71)
	at com.github.mybatis.fl.test.MyGenerator.main(MyGenerator.java:75)
