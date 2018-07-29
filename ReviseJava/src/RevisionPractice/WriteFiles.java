//package RevisionPractice;
import java.io.*;
public class WriteFiles {

	public static void main(String[] args) {
		
		
			try {
				File f = new File ("File creation.txt");
				if (!f.exists()) {
				f.createNewFile();
				}
				PrintWriter p = new PrintWriter (f);
				p.println("Hi, these are testing lines!");
				p.close();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
}