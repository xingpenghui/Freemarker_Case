package com.qf.fm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

/**  
* 创建时间：2017年12月18日 上午9:48:21  
* 项目名称：Freemark_case  
* @author xph  
* @version 1.0     
* 文件名称：Freemarker_Main1.java  
* 类说明：  
*/
public class Freemarker_Main1 {

	public static void main(String[] args) throws IOException, TemplateException {
		System.err.println(String.format("%.2f", 2.356));
		//创建配置对象
		Configuration configuration=new Configuration();
		//加载模板目录
		configuration.setDirectoryForTemplateLoading(new File("src/main/java/com/qf/fm/"));
		//准备数据
		Map<String,Object> map=new HashMap<>();
		map.put("name", "班长");
		ArrayList<Integer> ids=new ArrayList<>();
		for(int i=1;i<10;i++) {
			ids.add(i);
		}
		map.put("ids", ids);
		Map<String, String> stus=new HashMap<>();
		stus.put("name", "张立");
		stus.put("age", "18");
		stus.put("sex", "男人");
		stus.put("like", "美食家");
		
		
		map.put("students", stus);
		Map<String, String> map1=new HashMap<>();
		Map<String, String> map2=new HashMap<>();
		map1.put("a", "111");
		map1.put("b", "333");
		map1.put("c", "444");
		map2.put("b", "7777");
		map2.put("d", "5555");
		map.put("map1", map1);
		map.put("map2", map2);
		//获取指定的模板对象
		Template template=configuration.getTemplate("first.ftl");
		//将自定义数据按照模板进行输出：输出到控制台
		template.process(map, new OutputStreamWriter(System.out));
		//template.process(map, new FileWriter("test.doc"));
		
		
		
	}
}
