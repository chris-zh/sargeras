package com.sargeras.pub.controller;

import org.apache.log4j.Logger;

import com.sargeras.pub.Log4jUtil;
/**
 * Controller基类
 * 子类可继承以获得组件
 * 添加日志组件
 * @author Administrator
 *
 */
public class BaseController {
	protected static Logger logger = Logger.getLogger(BaseController.class);  
}
