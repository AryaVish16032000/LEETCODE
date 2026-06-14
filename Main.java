import java.util.*;
// Find the first index of a number in an array. If the number is not present, then return -1. (We did it for the first index in the class today. Now, do it for the last index. Create some sample test cases and see if your code gives the correct answer or not.)
// Find the last index of a number in an array. If the number is not present, then return -1. (We did it for the first index in the class today. Now, do it for the last index. Create some sample test cases and see if your code gives the correct answer or not.)

public class Main
{
    public static int lastIndex(int[] arr,int target,int right)
    {
        if (right < 0)
        {
            return -1;
        }
        if (arr[right] == target)
        {
            return right;
        }
        return lastIndex(arr,target,right-1);
    }

    public static int firstIndex(int[] arr,int target,int left,int right)
    {   
        if (left>right)
        {
            return -1;
        }
        if (arr[left] == target)
            {
                return left;
            }
        return firstIndex(arr,target,left+1,arr.length-1);


    }
    public static void main(String[] args)
    {
        int[] arr ={1,2,4,2,3,4,3,4};
        System.out.println("Enter the target : ");
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        sc.close();
        int answerFirst=firstIndex(arr,target,0,arr.length-1);
        System.out.println("First Index of element is " + answerFirst);

        int answerlast = lastIndex(arr, target, arr.length -1);
        System.out.println("Last Index of element is " + answerlast);
    }
}