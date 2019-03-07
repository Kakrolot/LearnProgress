package day2019307;
/**
 * 
 * @author 40272
 *java 中处理异常
 *A:try...catch... finally
 *B:throws
 *
 *try...catch...finally格式
 *try{
 *        可能出现问题的代码
 * }catch(异常类名 变量){
 *        针对的问题
 * }finally{
 *        释放资源的代码
 * }
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");
		
		int a = 10;
		int b = 0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		
		System.out.println("world");
	}

}
