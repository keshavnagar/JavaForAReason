package Practical;
public class Final3 {

    public static void main(String[] args) {
        final String name = "rough";
        System.out.println(name);
        // name = "git"; 
        System.out.println(name);
    }
    
}

/*PS D:\java> javac Practical/Final3.java
Practical\Final3.java:7: error: cannot assign a value to final variable name
        name = "git";
        ^
1 error
PS D:\java> ^C
PS D:\java> */
