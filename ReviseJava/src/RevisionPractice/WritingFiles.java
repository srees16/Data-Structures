//package RevisionPractice;

import java.io.*;

public class WritingFiles {

	public static void main(String[] args) {
		File f = new File ("Recollects.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			PrintWriter p = new PrintWriter (f);
			p.println("An Exception can be anything which interrupts the normal flow of the program. When an exception occurs program processing gets terminated and doesn’t continue further. In such cases we get a system generated error message");
			p.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} System.out.println("File created: Content Added");
	}
}