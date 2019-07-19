/**
 * @filename:${entityName}Service ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2018 ${author} Co. Ltd. 
 * All right reserved. 
 */
package ${serviceUrl};

import ${entityUrl}.${entityName};
import com.baomidou.mybatisplus.extension.service.IService;

/**   
 *  
 * @Description:  ${entityComment}——SERVICE
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 *    
 */
public interface ${entityName}Service extends IService<${entityName}> {
	
	<#--/**
	 * @explain 查询${entityComment}对象
	 * @param   对象参数：id
	 * @return  ${entityName}
	 * @author  ${author}
	 */
	${entityName} selectByPrimaryKey(${idType} id);
	
	/**
	 * @explain 删除${entityComment}对象
	 * @param   对象参数：id
	 * @return  int
	 * @author  ${author}
	 */
	int deleteByPrimaryKey(${idType} id);
	
	/**
	 * @explain 添加${entityComment}对象
	 * @param   对象参数：${entityName}
	 * @return  int
	 * @author  ${author}
	 */
	int insertSelective(${entityName} ${objectName});
	
	/**
	 * @explain 修改${entityComment}对象
	 * @param   对象参数：${entityName}
	 * @return  int
	 * @author  ${author}
	 */
	int updateByPrimaryKeySelective(${entityName} ${objectName});
	
	/**
	 * @explain 查询${entityComment}集合
	 * @param   对象参数：${entityName}
	 * @return  List<${entityName}>
	 * @author  ${author}
	 */
	List<${entityName}> query${entityName}List(${entityName} ${objectName});
	
	/**
	 * @explain 分页查询${entityComment}
	 * @param   对象参数：${entityName}
	 * @return  PageInfo<${entityName}>
	 * @author  ${author}
	 */
	PageInfo<${entityName}> get${entityName}BySearch(AppPage<${entityName}> page);-->
}