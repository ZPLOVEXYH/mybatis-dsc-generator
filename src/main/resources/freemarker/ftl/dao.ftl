/**
 * @filename:${entityName}Mapper ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2018 ${author} Co. Ltd. 
 * All right reserved. 
 */
package ${daoUrl};

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${entityUrl}.${entityName};

/**   
 * @Description:  ${entityComment}——Mapper
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 */
@Mapper
public interface ${entityName}Mapper extends BaseMapper<${entityName}>{
	
}
	