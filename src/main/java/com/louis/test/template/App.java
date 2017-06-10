package com.louis.test.template;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String curPath = new File("").getAbsolutePath();

		File file1 = new File(curPath + "/src/main/resources/");

		/*for (File file : file1.listFiles()) {

			try {
				System.out.println(file.getName());
				Yaml yaml = new Yaml();
				
				ArrayList result = (ArrayList) yaml.load(new FileInputStream(file));
				
				for(int i = 0; i < result.size();i++){
					
					JSONObject obj = JSONObject.fromObject(result.get(i));
					RestAPITemplate tmp = (RestAPITemplate)JSONObject.toBean(obj,RestAPITemplate.class);
					System.out.println(tmp.getId());
					System.out.println(tmp.getUrl());
					System.out.println(tmp.getEndpoint());
					System.out.println(tmp.getFilter());
					System.out.println(tmp.getMethod());
					System.out.println(tmp.getPath());
					System.out.println(tmp.getHeader());
				}


			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		Test test = new Test();
		test.print();
		
	}
}
