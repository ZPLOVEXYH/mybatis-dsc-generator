/**
 * @filename:UserController 2019年4月9日
 * @project wallet-manage  V1.0
 * Copyright(c) 2018 BianPeng Co. Ltd. 
 * All right reserved. 
 */
package com.github.mybatis.fl.test;

import com.github.mybatis.fl.entity.BasisInfo;
import com.github.mybatis.fl.util.EntityInfoUtil;
import com.github.mybatis.fl.util.Generator;
import com.github.mybatis.fl.util.MySqlToJavaUtil;

import java.sql.SQLException;
import java.util.Date;

/**
 * Copyright: Copyright (c) 2019
 * 
 * <p>
 * 说明： 自动生成工具
 * </P>
 * <p>
 * 源码地址：https://gitee.com/flying-cattle/mybatis-dsc-generator
 * </P>
 */
public class MyGenerator {
	// 基础信息：项目名、作者、版本
	public static final String PROJECT = "depot-manager";
	public static final String AUTHOR = "ZhangPeng";
	public static final String VERSION = "V1.0";
	// 数据库连接信息：连接URL、用户名、秘密、数据库名
	public static final String URL = "jdbc:mysql://192.168.43.107:3306/srsdb?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false&useSSL=true&serverTimezone=UTC";
	public static final String NAME = "root";
	public static final String PASS = "123456";
	public static final String DATABASE = "srsdb";

	// 类信息：类名、对象名（一般是【类名】的首字母小些）、类说明、时间
	/**
	 * p_business_type	PBusinessType	业务类型表
	 * p_enterprise_type	PEnterpriseType 	企业类型表
	 * p_goods_arr_status	PGoodsArrStatus	到货状态表
	 * p_goods_status	PGoodsStatus	货物状态表
	 * p_goods_type	PGoodsType	货物类型表
	 * p_pack_type	PPackType	包装类型表
	 * p_work_sheet_status	PWorkSheetStatus	作业单状态表
	 * p_area_code	PAreaCode	监管区域表
	 * p_conta_model	PContaModel	箱型表
	 * p_conta_op_type	PContaOptype	集装箱操作类型表
	 * p_customs_code	PCustomsCode	海关代码表
	 * p_transport_type	PTransportType	运输方式类型表
	 * c_discharges	CDischarges	装卸货地表
	 * c_enterprises	CEnterprises	企业信息表
	 * c_station_area_positions	CStationAreaPositions	堆位表
	 * c_station_areas	CStationAreas	堆区表
	 * c_stations	CStations	场站表
	 * c_vehicle	CVehicle	车辆备案表
	 */
	public static final String CLASSNAME = "CDischarges";
	public static final String TABLE = "c_discharges";
	public static final String CLASSCOMMENT = "装卸货地表";
	public static final String TIME = "2019年7月19日";
	public static final String AGILE = new Date().getTime() + "";

	// 路径信息，分开路径方便聚合工程项目，微服务项目
//	public static final String ENTITY_URL = "com.buybit.wm.entity";
//	public static final String DAO_URL = "com.buybit.wm.dao";
//	public static final String XML_URL = "mapper";
//	public static final String SERVICE_URL = "com.buybit.wm.service";
//	public static final String SERVICE_IMPL_URL = "com.buybit.wm.service.impl";
//	public static final String CONTROLLER_URL = "com.buybit.wm.controller";

	public static final String ENTITY_URL = "cn.samples.depot.web.entity";
	public static final String DAO_URL = "cn.samples.depot.web.mapper";
	public static final String XML_URL = "cn.samples.depot.web.mapper";
	public static final String SERVICE_URL = "cn.samples.depot.web.service";
	public static final String SERVICE_IMPL_URL = "cn.samples.depot.web.service.impl";
	public static final String CONTROLLER_URL = "cn.samples.depot.web.controller";

	public static void main(String[] args) {
		BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, TIME, AGILE, ENTITY_URL,
				DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL);
		bi.setTable(TABLE);
		bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
		bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
		bi.setEntityComment(CLASSCOMMENT);
		try {
			bi = EntityInfoUtil.getInfo(bi);
//			String fileUrl = System.getProperty("user.path");
			String fileUrl = "C:/idea_dev/MyBatisPlusGenerator/src/main/";// 生成文件存放位置
			String aa1 = Generator.createEntity(fileUrl + "java\\", bi).toString();
			String aa2 = Generator.createDao(fileUrl + "java\\", bi).toString();
			String aa3 = Generator.createDaoImpl(fileUrl + "resources\\", bi).toString();
			String aa4 = Generator.createService(fileUrl + "java\\", bi).toString();
			String aa5 = Generator.createServiceImpl(fileUrl + "java\\", bi).toString();
			String aa6 = Generator.createController(fileUrl + "java\\", bi).toString();

			// 是否创建swagger配置文件
//			 String aa7 = Generator.createSwaggerConfig(fileUrl, bi).toString();

			System.out.println(aa1);
			System.out.println(aa2);
			System.out.println(aa3);
			System.out.println(aa4);
			System.out.println(aa5);
			System.out.println(aa6);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
