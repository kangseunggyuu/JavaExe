package ch11.string02.sec05;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderExample {
public class MyStringBuilder{
        private List<Character> chList = new ArrayList();

        public MyStringBuilder append(String str) {
            char[] chArr = str.toCharArray();
            for(char ch : chArr)
                chList.add(ch);

            return this;
        }
        public MyStringBuilder insert(int idex, String str) {
            char[] chArr = str.toCharArray();
            for(int i=idex;i<idex+str.length();i++)
            	/* Boxing
            	 * 기본타입/지역변수 ch는 스태겡 존재
            	 * ch.List.add(ch); 이 구문이 처리될 때
            	 * char -> Charactor클래스로 변환된다.
            	 * Charactor클래스 내부에는 char로 보관하고 있다.
            	 * ch값은 결국 객체로 변환되어 힙으로 이동한다.
            	 * 
            	 * 성능의 저하 현상
            	 * */
            chList.add(i, chArr[i]);	// char -> Charactor클래스로 변환돼서 저장

            return this;
        }
        @Override
        public String toString() {
            String str = "";
            /* UnBoxing 현상 발생
             * chList 내부에서 Charator 클래스 객체로 힙 공간에 보관하다가
             * 지역변수 char ch에 대입할 때 다시 스택에 존재하는 ch로 값을 전환한다.
             * */
            for(char ch : chList)
                str += ch;
            return str;
        }
    }
        public static void main(String[] args) {
        /* StringBuilder는 내부에 char[] 로 문자열을 저장한다. */
        String data = new StringBuilder()
                .append("DEF")
                .insert(0,  "ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
    }
}