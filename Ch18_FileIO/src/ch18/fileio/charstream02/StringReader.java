package ch18.fileio.charstream02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {
	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("손흥민.txt");
		BufferedReader in = new BufferedReader(rd);
		String str;
		while(true) {
			str = in.readLine();	// 한줄씩(즉, 개행문자 만날때까지)
			if(str==null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}
