package day2019308;

import java.io.File;

public class DeleteFolderDemo {
	public static void main(String[] args) {
		//��װָ��Ŀ¼
		File srcFolder = new File("d:\\demo");
		deleteFolder(srcFolder);
		
	}
	public static void deleteFolder(File srcFolder) {
		//��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();
		//ɾ����ϵͳ���������
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
