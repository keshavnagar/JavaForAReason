package Practical;

public class JavaPrintVariable5 {
    public static void main(String[] args) {

        // to cmbine both text and variable , use the + character.

        String name = "keshav";
        System.out.println("hello" + " " + name);

        // we can also combine two variables like firstname and last name = full name ;

        String firstName = "Keshav";
        String LastName = "Nagar";

        String fullName = firstName + LastName;
        System.out.println(fullName);

        // For numeric values , the + operator works as a mathematical operator

        int x = 89;
        int y = 90;
        System.out.println(x + y);
    }

}
