package Week9_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFilePRogra {
	public static void main(String[] args) {
		 BufferedReader br = null;
		 int lineCount=0;
		 
	        int wordCount = 0;
	        int charCount = 0;
	        String longestWord = "";
		try {
		File file = new File("C:\\Users\\megha\\Downloads\\data.txt");
		FileReader fr = new FileReader(file);
		 br = new BufferedReader(fr);
		 String st="";
			while((st=br.readLine())!=null) {
				System.out.println(st);
				lineCount++;
				charCount = charCount + st.length();
				String words[] = st.split(" ");
				wordCount = wordCount + words.length;
				for(int i = 0; i < words.length; i++) {

                    if(words[i].length() > longestWord.length()) {

                        longestWord = words[i];
                    }
		}
		}
			System.out.println("Total Lines: " + lineCount);

            System.out.println("Total Words: " + wordCount);

            System.out.println("Total Characters: " + charCount);

            System.out.println("Longest Word: " + longestWord);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
