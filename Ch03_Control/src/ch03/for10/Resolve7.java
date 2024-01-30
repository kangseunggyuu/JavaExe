package ch03.for10;

public class Resolve7 {

	public static void main(String[] args) {
		// do~while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
		
		int i=1;
		do {
			if(i%2==0)
				System.out.println(i);
			i++;
		}while(i<=10);

	}

}
