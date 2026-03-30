package WeekendClasses;

public class Swap {

    public static void main(String[] args) {

        int a1 = 5, b1 = 2;

        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;

        System.out.println(a1); 
        System.out.println(b1); 
    }
}