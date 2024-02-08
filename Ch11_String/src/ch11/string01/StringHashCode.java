package ch11.string01;

public class StringHashCode {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");

		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		
		/* String의 hashCode()는 이반 객체의 hashCode와 다르다
		 * 일반객체는 주소를 hash화 하여 제공하지만
		 * String은 문자열의 내용을 정수로 변환해서 제공한다.
		 * 그러므로 객체 공가닝 다른 여부과 관계없이
		 * 문자열 내용이 같으면 동일한 hashCode()를 리턴한다*/
		System.out.println(str0.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
