package day2019307;

import java.io.File;

/**
 * 
 * @author 40272
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取文件大小
 * public long lastModefied():获取最后一次修改时间的毫秒值
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File file = new File("aaa\\bbb\\b.txt");
		
		System.out.println("getAbsolutPath:"+file.getAbsolutePath());
		System.out.println("getPath:"+file.getPath());
		System.out.println("getName:"+file.getName());
		System.out.println("length:"+file.length());
		System.out.println("lastModified:"+file.lastModified());
	}

}
