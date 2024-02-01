package ch09.resolve07;

//3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		int len = source.length;
		double[] dest = new double[len];
		for(int i=0;i<len;i++) {
			dest[i] = (double)source[i];
		}
		
		return dest;
	}
	
	public static int[] doubleToInt(double[] source) {
		int len = source.length;
		int [] dest = new int[len];
		for(int i=0;i<len;i++) {
			dest[i] = (int)source[i];
		}
		
		return dest;
		
	}
}
