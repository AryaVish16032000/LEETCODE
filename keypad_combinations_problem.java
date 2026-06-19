import java.util.*;
public class keypad_combinations_problem {

    public static String[] print_keypad_combination(String s, int start, int right)
    {
        Map<String,String> keyMap = new HashMap<>();
        keyMap.put("2","abc");
        keyMap.put("3","def");
        keyMap.put("4","ghi");
        keyMap.put("5","jkl");
        keyMap.put("6","mno");
        keyMap.put("7","pqrs");
        keyMap.put("8","tuv");
        keyMap.put("9","wxyz");

        if (start == right)
        {
            String sindex= s.charAt(start)+"";
            String sindexK =keyMap.get(sindex);
            String ans[] = new String[sindexK.length()];
            for (int i =0 ; i<sindexK.length();i++)
            {
              ans[i]=sindexK.charAt(i)+"";
                
            }

            return ans;
        }
        String[] recussionAnswer = print_keypad_combination(s,start+1,s.length()-1);
        int lengthrecussionAnswer = recussionAnswer.length;
        String cindex= s.charAt(start)+"";
        String currentKeys= keyMap.get(cindex);
        int lengthcurrentKeys = currentKeys.length();
        String answeString[] = new String[lengthcurrentKeys*lengthrecussionAnswer];
        int ansindex = 0;
        for (int i =0 ; i<lengthrecussionAnswer;i++)
        {
            
            for (int j =0 ; j<lengthcurrentKeys;j++)
            {
                answeString[ansindex]=currentKeys.charAt(j)+""+recussionAnswer[i];
                ansindex++;

            }
            
        }
        return answeString;




    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String ansS=sc.nextLine();
        String[] keycombination = print_keypad_combination(ansS,0,ansS.length()-1);

        int lkc= keycombination.length;

        for (int i =0 ; i <lkc; i++)
        {
            System.out.println(keycombination[i]);
        }

    }
}
