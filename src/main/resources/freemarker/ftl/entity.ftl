/**
 * @filename:${entityName} ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2018 ${author} Co. Ltd. 
 * All right reserved. 
 */
package ${entityUrl};

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import cn.samples.depot.common.model.CRUDView;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**   
 * @Description:  ${entityComment}
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 */
@TableName("${table}")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ${entityName} extends Model<${entityName}> {

    public interface View extends CRUDView {
        interface Table extends CRUDView, CRUDView.Table {//表格
        }

        interface Form extends CRUDView.Table {//表单
        }

        interface SELECT extends View { //下拉
        }
    }

<#list cis as ci>
    <#if ci.column!="id">
    /**
	 *  ${ci.comment}
	 */
    <#else>
    /**
	 *  ${ci.comment}
	 */
    </#if>
	<#if ci.javaType=="Date">
	<#if ci.jdbcType=="date">
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
    <#elseif ci.jdbcType=="time">
    @DateTimeFormat(pattern = "HH:mm:ss")
	@JsonFormat(pattern="HH:mm:ss")
	<#else>
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	</#if>
	</#if>
	@ApiModelProperty(name = "${ci.property}" , value = "${ci.comment}")
    <#if ci.column!="id">
    @TableField(value = "${ci.column}")
    <#else>
    @TableId(value = "${ci.column}", type = IdType.AUTO)
    </#if>
    <#if ci.column=="create_time">
    @CreatedDate
    private ${ci.javaType} ${ci.property} = System.currentTimeMillis();
    <#else>
    private ${ci.javaType} ${ci.property};
    </#if>


</#list>
}
	