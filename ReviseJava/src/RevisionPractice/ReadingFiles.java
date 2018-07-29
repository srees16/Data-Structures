//package RevisionPractice;

import java.io.*;

public class ReadingFiles {

	public static void main(String[] args) {
		BufferedReader b = null;
		try {
			b = new BufferedReader (new FileReader ("Recollects.txt"));
			String s;
			try {
				while ((s = b.readLine())!=null) {
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
