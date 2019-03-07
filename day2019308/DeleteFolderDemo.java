package day2019308;

import java.io.File;

public class DeleteFolderDemo {
	public static void main(String[] args) {
		//封装指定目录
		File srcFolder = new File("d:\\demo");
		deleteFolder(srcFolder);
		
	}
	public static void deleteFolder(File srcFolder) {
		//获取指定目录下的所有文件或者文件夹的File数据
		File[] fileArray = srcFolder.listFiles();
		//删除了系统以外的内容
		if(fileArray!= null){
			for(File file:fileArray){
				if (file.isDirectory()) {
					deleteFolder(file);
				}else {
					System.out.println(file.getName()+"---"+file.delete());
				}
			}
			System.out.println(srcFolder.getName()+"---"+srcFolder.delete());
		}
	}

}
