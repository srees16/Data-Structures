//package RevisionPractice;

import java.io.*;

public class ReadFiles {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader (new FileReader ("File creation.txt"));
			String s;
			try {
				while ((s = br.readLine()) !=null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}