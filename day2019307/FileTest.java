package day2019307;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 * @author 40272
 * ��D��Ŀ¼�����е�.jpg��β���ļ����Ƹ��������
 * A:��װĿ¼
 * B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * C:������File���飬�õ�ÿһ��File����
 * D:�ж�File����
 *          ���ж��Ƿ����ļ�
 *                   ��:
 *                      �����ж��Ƿ���.jpg��β
 *                           ��:�������
 */
public class FileTest {
	public static void main(String[] args) {
		//��װĿ¼
		File folder = new File("d:\\");
		
//		//��ȡ��Ŀ¼�µ����е��ļ������ļ��е�File����
//		File[] fileArray = folder.listFiles();
//		
//		//���������飬�õ�ÿһ��File����
//		for(File file:fileArray){
//			//���ж��Ƿ����ļ�
//			if (file.isFile()) {
//				//�ж��Ƿ���.jpg��β
//				if (file.getName().endsWith(".jpg")) {
//					System.out.println(file.getName());
//				}
//			}
//		}
		File[] fileArray = folder.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".jpg");
			}
		});
		for(File file:fileArray)
		{
			System.out.println(file.getName());
		}
		}

}
