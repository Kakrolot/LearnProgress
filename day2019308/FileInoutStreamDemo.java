package day2019308;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author 40272
 * �ֽ���������ȡ���ݲ���
 * A:�����ֽ�����������
 * B:���÷�������ȡ����
 * C:�ͷ���Դ
 * 
 * �ֽ���������ȡ���������ַ�ʽ:
 * A:һ�ζ�ȡһ���ֽ�
 * B:һ�ζ�ȡһ���ֽ�����
 * 
 * һ�ζ�ȡһ���ֽ�:public int read()
 */
public class FileInoutStreamDemo {
	//�����ֽ�����������
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("OperatorDemo03.java");
	    int by = 0;
	    while((by = fis.read())!= -1){
	    	System.out.print((char)by);
	    }
	    fis.close();
		
	}

}
