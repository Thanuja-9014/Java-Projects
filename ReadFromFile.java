package balaji;
import java.io.*;

public class ReadFromFile {
	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\kurub\\OneDrive\\Desktop\\jav.txt");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
			reader.close();
		} catch(IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

}
