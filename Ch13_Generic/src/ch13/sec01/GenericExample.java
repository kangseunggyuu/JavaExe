package ch13.sec01;

/* Box<String> box1 = new Box<>();
 * Box<Integer> box2 = new Box<Integer>();
 * 
 * int는 Integer
 * char는 Charcater
 * 
 * class Box_String{
 * public String content;
 * }
 * class Box_Integer{
 * public Integer content;
 * }
 * */

public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;		//Boxing: Hip -> Stack
		System.out.println(value);		//UnBoxing: Stack -> Hip
	}
}

//<T>에서 T를 String, Integer로 정했다.
