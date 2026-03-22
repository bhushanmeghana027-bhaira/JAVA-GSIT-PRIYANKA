
public class Week2StudentMarksConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float studentMarks = 87.6f;
		double doubleMarks = studentMarks;
		int intMarks = (int) doubleMarks;
		char letter = (char) intMarks;
		
		System.out.println("Float value: " + studentMarks);
        System.out.println("Double value: " + doubleMarks);
        System.out.println("Integer value: " + intMarks);
        System.out.println("Character value: " + letter);

	}

}
