import java.util.*;
public class string {

    public static void main(String[] args)
    {
        String s ="helLo wOreld  ";

        System.out.println("Length of string "+ s.length());
        System.out.println("Char AT "+ s.charAt(2));
        System.out.println("Substring "+ s.substring(5));
        System.out.println("Substring  range"+ s.substring(5,9));
        System.out.println("Contains Substring "+ s.contains("wor"));
        System.out.println("Startwith Substring false "+ s.startsWith("e"));
        System.out.println("Startwith Substring true "+ s.startsWith("he"));
        System.out.println("endwith Substring false "+ s.endsWith("sd"));
        System.out.println("Startwith Substring true "+ s.endsWith("d"));
        System.out.println("upper case " + s.toUpperCase());
        System.out.println("lower case " + s.toLowerCase());
        System.out.println("Trim function " + s.trim());
        System.out.println("Length " + s.trim().length());
        System.out.println("Replace " + s.replace("l", "SS"));
        System.out.println("Split along e "+ s.split("e")[2]);
        System.out.println("Index of "+ s.indexOf("i"));
        System.out.println("ends with "+ s.lastIndexOf("e"));



    }

}
