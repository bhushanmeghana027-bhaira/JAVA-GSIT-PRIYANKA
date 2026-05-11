package FilePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileProgram {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\megha\\Downloads\\simple things.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String st="";
		while((st=br.readLine())!=null) {
			System.out.println(st);
		}
		br.close();
	}

}
