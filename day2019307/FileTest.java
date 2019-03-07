package day2019307;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 * @author 40272
 * 把D盘目录下所有的.jpg结尾的文件名称给输出数来
 * A:封装目录
 * B:获取该目录下所有的文件或者文件夹的File数组
 * C:遍历该File数组，得到每一个File对象
 * D:判断File对象
 *          先判断是否是文件
 *                   是:
 *                      继续判断是否以.jpg结尾
 *                           是:输出名称
 */
public class FileTest {
	public static void main(String[] args) {
		//封装目录
		File folder = new File("d:\\");
		
//		//获取该目录下的所有的文件或者文件夹的File数组
//		File[] fileArray = folder.listFiles();
//		
//		//遍历该数组，得到每一个File对象
//		for(File file:fileArray){
//			//先判断是否是文件
//			if (file.isFile()) {
//				//判断是否以.jpg结尾
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
