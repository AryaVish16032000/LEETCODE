import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("hello world");
        System.out.println(args[0]);
        Scanner sc = new Scanner(System.in);
        char n = sc.nextLine().charAt(0);
        sc.close();
        System.out.println(n);

        int a =10;
        int b =2;
        System.out.println(a>6 && b>1);
        String name ="Java";  // it is a class
        String name1 = new String("Java 1");
        System.out.println(name);
        System.out.println(name1);
    }
}