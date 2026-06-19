import java.util.*;;
public class print_number {

    //Print number from 1 to 10

    public static void helperprint(int n)
    {
        if (n==11)
        {
            return ;
        }
        System.err.println(n);
        helperprint(n+1);
    }
    public static void main(String[] args)
    {
        System.out.println("Printing the number from 1 to 10");
        helperprint(1);
        
    }
    
}
