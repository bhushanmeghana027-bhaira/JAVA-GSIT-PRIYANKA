package FilePrograms;

import java.io.File;
import java.io.FileWriter;

public class FileWriteProgram {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
	File file = new File("C:\\Users\\megha\\Downloads\\simple things.txt");
	FileWriter fr = new FileWriter(file,true);
	fr.write("\n new third line \n new fourth line");
	fr.close();
	}
}
