package day2019307;

import java.io.File;

/**
 * 
 * @author 40272
 * public String getAbsolutePath():��ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ�ļ���С
 * public long lastModefied():��ȡ���һ���޸�ʱ��ĺ���ֵ
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
