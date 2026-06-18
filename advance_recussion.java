public class advance_recussion {

    public static  String removeString(String s, int index)
    {
        if (index == s.length()-1)
        {
            return "";
        }
        if (s.charAt(index) == 'x')
        {
            return removeString(s, index+1);
        }
        return s.charAt(index) + removeString(s , index+1);

    }

    public static void main(String[] args) {
        // Remove x from the string
        String s="abdkxmsndjxsxdsksx";
        String answer=removeString(s,0);
        System.out.println("String without x");
        System.out.println(answer);

    }
    
}
