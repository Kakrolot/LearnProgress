package day2019307;

import java.io.File;
import java.io.IOException;

/*
 * ��������:
 * A:�����ļ�,����ļ������ڣ��ʹ��������ڣ��Ͳ�������
 *           public boolean createNewFile() throws IOException
 * B:�����ļ��У�����ļ��в����ڣ��ʹ��������ڣ��Ͳ�������
 *           public boolean mkdir()�����ļ���
 *        public boolean mkdirs()�༶�ļ���
 * �����ļ��л����ļ���ȡ����ʹ�õķ�����
 * java�ļ������ݵĻ��ǲ���ֱ��ɾ����
 * JAVAɾ���ļ�����������վ ֱ��ɾ��
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\a.txt");
		
		//System.out.println("createNewFile:"+file.createNewFile());
		
		File file2 = new File("d:\\lalala");
		System.out.println("mkdir:"+file2.mkdir());
		
		File file3 = new File("d:\\aaa\\bbb\\ccc.txt");
		//System.out.println("mkdir:"+file3.mkdir());����û�в������
		System.out.println("delete:"+file2.delete());
		System.out.println("delete:"+file.delete());
	}

}
