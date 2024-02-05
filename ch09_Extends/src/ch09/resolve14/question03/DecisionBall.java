package ch09.resolve14.question03;

//스트라이크, 볼을 판단하는 역할
public class DecisionBall {
	public static boolean decisionBall(int[] comArr, int[] userArr) {
		boolean isGameRun = true;
		String result = "";
		
		int strike = 0, ball = 0;
		for(int i=0;i<comArr.length;i++) {
			for(int j=0;j<userArr.length;j++) {
				// 숫자가 일치하는 것이 나왔다
				if(comArr[i] == userArr[j]) {
					if(i==j)  // 자릿수까지 일치하면
						strike++;
					else 
						ball++;
				}
			}
		}
		
		if(strike==3)
			isGameRun = false; 
		
		result = "strike=" + strike + ", ball=" + ball;
		System.out.println(result);
		
		return isGameRun;
	}
}
