package day2019308;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author 40272
 * 字节输入流读取数据步骤
 * A:创建字节输入流对象
 * B:调用方法，读取数据
 * C:释放资源
 * 
 * 字节输入流读取数据有两种方式:
 * A:一次读取一个字节
 * B:一次读取一个字节数组
 * 
 * 一次读取一个字节:public int read()
 */
public class FileInoutStreamDemo {
	//创建字节输入流对象
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("OperatorDemo03.java");
	    int by = 0;
	    while((by = fis.read())!= -1){
	    	System.out.print((char)by);
	    }
	    fis.close();
		
	}

}
