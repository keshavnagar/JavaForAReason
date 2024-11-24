package HashCodeMethod;

public class HashCode {

    public static void main(String[] args) {
        HashCode h1 = new HashCode();
        HashCode h2 = new HashCode();
        System.out.println(h1.hashCode());// output is some integer values 
        System.out.println(h2.hashCode());// output is some integer values 
        System.out.println(((Object) h1.hashCode()).getClass().getSimpleName());//output is integer
     
    }
    
}
