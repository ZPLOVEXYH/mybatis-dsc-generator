/**
 * @filename:PWorkSheetStatus 2019年7月16日
 * @project depot-manager  V1.0
 * Copyright(c) 2018 ZhangPeng Co. Ltd. 
 * All right reserved. 
 */
package cn.samples.depot.web.entity;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**   
 *  
 * @Description:  作业单状态表
 * @Author:       ZhangPeng   
 * @CreateDate:   2019年7月16日
 * @Version:      V1.0
 *    
 */
@Builder
@Data
@TableName("p_work_sheet_status")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PWorkSheetStatus extends Model<PWorkSheetStatus> implements Serializable {

	private static final long serialVersionUID = 1563274726076L;
	
    /**
	 *  类型值
	 */

	@ApiModelProperty(name = "Code" , value = "类型值")
    @TableField(value = "Code")
	private String Code;

    /**
	 *  类型名称
	 */

	@ApiModelProperty(name = "Name" , value = "类型名称")
    @TableField(value = "Name")
	private String Name;

    /**
	 *  是否启用
	 */

	@ApiModelProperty(name = "Enable" , value = "是否启用")
    @TableField(value = "Enable")
	private Integer Enable;

    /**
	 *  操作时间
	 */

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(name = "CTime" , value = "操作时间")
    @TableField(value = "CTime")
	private Date CTime;

}
