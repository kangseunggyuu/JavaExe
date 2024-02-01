package ch09.resolve07;

//4. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
//static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int len = s1.length + s2.length;
		int[] intArr = new int[len];
		
		int cnt = 0;
		for(int i=0;i<s1.length;i++) {
			intArr[i] = s1[i];
			cnt++;
		}
		for(int i=0;i<s2.length;i++) {
			intArr[cnt] = s2[i];
			cnt++;
		}
		
		return intArr;
		
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		// 일단 s1과 s2간의 겹치는 데이터가 없다고 가정하고 최대 s1의 길이만큼 배열을 할당
		int[]intArr = new int[s1.length];
		boolean isExist = false;
		int idx = 0;		// s1의 i위치 값이 s2에 존재하지 않을 때 intArr에 저장할 위치
        					// intArr에 중복되지 않아서 저장한 배열의 길이
		
		// s1의 값을 1개씩 s2있는지 확인하기 위해서
		for(int i=0;i<s2.length;i++) {
			for(int j=0;j<s2.length;j++) {
				// s1의 i위치값이 s2전체 중에 존재하는 지 판단
				if(s1[i] == s2[j]) {
					// 존재한다면 for(int j ~ )를 탈출
					isExist = true;
					break;
				}
			}
			
			// 찾지 못했으면 isExist는 false이므로 새로운 intArr의 idx위치에 저장
			if(isExist==false) {
				intArr[idx] = s1[i];
				idx++;
			}
			isExist = false;
		}
		
		int[] dest = new int[idx];
		for(int i=0;i<idx;i++) {
			dest[i] = intArr[i];
		}
		
		return dest;
		
	}
}
