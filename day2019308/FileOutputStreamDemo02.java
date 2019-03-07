package day2019308;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
	public static void main(String[] args) {
		method();
	}
	public static void method() {
		//定义在外,可以让finally里面看到
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("hello".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	

}
