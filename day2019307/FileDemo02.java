package day2019307;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能:
 * A:创建文件,如果文件不存在，就创建。存在，就不创建。
 *           public boolean createNewFile() throws IOException
 * B:创建文件夹，如果文件夹不存在，就创建。存在，就不创建。
 *           public boolean mkdir()单级文件夹
 *        public boolean mkdirs()多级文件夹
 * 创建文件夹还是文件，取决于使用的方法。
 * java文件有内容的话是不能直接删除的
 * JAVA删除文件不经历回收站 直接删除
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\a.txt");
		
		//System.out.println("createNewFile:"+file.createNewFile());
		
		File file2 = new File("d:\\lalala");
		System.out.println("mkdir:"+file2.mkdir());
		
		File file3 = new File("d:\\aaa\\bbb\\ccc.txt");
		//System.out.println("mkdir:"+file3.mkdir());创建没有产生结果
		System.out.println("delete:"+file2.delete());
		System.out.println("delete:"+file.delete());
	}

}
