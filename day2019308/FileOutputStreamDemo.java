package day2019308;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author 40272
 * IO������:
 *           A:��������
 *                   ������  ������
 *                   �����  д����
 *           B:��������
 *                   �ֽ���
 *                   �ַ���
 *           Ĭ������£�IO������˵���ǰ����������ͷ֡�
 * 
 * IO�����ĸ�����:
 *           �ֽ���
 *                   �ֽ�������  InputStream
 *                   �ֽ������  OutputStream
 *                   
 *           �ַ���   
 *                   �ַ�������  Reader
 *                   �ַ������  Writer
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
