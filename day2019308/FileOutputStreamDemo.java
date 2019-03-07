package day2019308;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author 40272
 * IO流分类:
 *           A:数据流向
 *                   输入流  读数据
 *                   输出流  写数据
 *           B:数据累心
 *                   字节流
 *                   字符流
 *           默认情况下，IO流分类说的是按照数据类型分。
 * 
 * IO流的四个基类:
 *           字节流
 *                   字节输入流  InputStream
 *                   字节输出流  OutputStream
 *                   
 *           字符流   
 *                   字符输入流  Reader
 *                   字符输出流  Writer
 *
 * 
 *                
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("a.txt");
		//fos.write("helloworld".getBytes());
		fos.write(22);
		fos.close();
	}

}
