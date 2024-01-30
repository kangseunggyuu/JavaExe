package ch02.IncDecOperator11;

public class IncDecOperator {
	public static void main(String[] args) {
		int num = 0;
		// num++과 ++num은 모두 num의 값을 1 증가시킨다.
		num++;	// num +=1, num = num + 1
		System.out.println(num);
		++num;
		System.out.println(num);
		
		// num의 값을 대입한 후 num이 1 증가
		int result = num++;
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		// num을 1증가한 후 result에 대입
		result = ++num;
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		
		System.out.println("num=" + num--);
		System.out.println("num=" + --num);
	}
}





