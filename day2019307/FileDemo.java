package day2019307;

import java.io.File;

/**
 * 
 * @author 40272
 *File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ
 *���:����������ļ�����Ŀ¼һ������
 *
 *���췽��:
 *         File(String pathname):ͨ��һ��·��������File����
 *         File(String parent,String child): ͨ����·������·��������File����
 *         File(File parent,STring child):ͨ����·��File�������·��������File����
 */
public class FileDemo {
	public static void main(String[] args) {
	//��������
	//File(String pathname):ͨ��һ��·��������File����
	File file = new File("D:\\demo\\a.txt");
	
	//File(String parent,String child):ͨ����·������·��������File����
	File file2 = new File("D:\\demo","a.txt");
	
	//File(File parent,String child):ͨ����·��File�������·��������File����
	File file3 = new File("D:\\demo");
	File file4 = new File(file3,"a.txt");
	}
	

}
