package com.qf.fm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 创建时间：2017年12月18日 上午11:59:15 项目名称：Freemark_case
 * 
 * @author xph
 * @version 1.0 文件名称：Test1.java 类说明：
 */
public class Test1 {

	public static void main(String[] args) throws Exception {
		// 创建配置对象
		
		Configuration configuration = new Configuration();
		// 加载模板目录
		configuration.setDirectoryForTemplateLoading(new File("src/main/java/com/qf/fm/"));
		Map<String,Object> map=new HashMap<>();
		map.put("id", 12);
		map.put("author", "1712");
		map.put("content", "哈哈哈哈dsdsdsds");
		map.put("time", "123");
		//map.put("SpliderTime", "111");
		Template template=configuration.getTemplate("joke.ftl");
		//将自定义数据按照模板进行输出：输出到控制台
		template.process(map, new FileWriter("12.html"));
	}
}
