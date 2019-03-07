package day2019304;
/**
 * 
 * @author 40272
 *System:System 类包含一些有用的类字段和方法。他不能被实例化
 *       public static void gc():运行垃圾回收器
 *       public static void exit(int status):终止当前正在运行的Java
 *       虚拟机。参数用作状态码；根据惯例，非0的状态吗表示异常终止。
 *       public static long currentTimeMills():返回以毫秒为单位的当前世家
 *       
 *       public static void arraycopy(Object src,int stcPos,Object destPos,int length)
 *       
 */
public class SystemDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时:"+(end-start)+"毫秒");
	}
}
