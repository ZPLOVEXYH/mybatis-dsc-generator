/**
 * @filename:PWorkSheetStatusMapper 2019年7月16日
 * @project depot-manager  V1.0
 * Copyright(c) 2018 ZhangPeng Co. Ltd. 
 * All right reserved. 
 */
package cn.samples.depot.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.samples.depot.web.entity.PWorkSheetStatus;

/**   
 *  
 * @Description:  作业单状态表——Mapper
 * @Author:       ZhangPeng   
 * @CreateDate:   2019年7月16日
 * @Version:      V1.0
 *    
 */
@Mapper
public interface PWorkSheetStatusMapper extends BaseMapper<PWorkSheetStatus>{
	
	PWorkSheetStatus selectByPrimaryKey(FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> idType  [in template "dao.ftl" at line 25, column 44]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${idType}  [in template "dao.ftl" at line 25, column 42]
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
	at com.github.mybatis.fl.util.Generator.createDao(Generator.java:46)
	at com.github.mybatis.fl.test.MyGenerator.main(MyGenerator.java:72)
