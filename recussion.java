import java.util.*;
public class recussion {

    // sum of all the elements of a array

    public static int sumRecurrsion(int[] arr)
    {
        if (arr.length == 1)
        {
            return arr[0];
        }
        int[] smallarr = new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            smallarr[i-1]=arr[i];
        }
        return arr[0] + sumRecurrsion(smallarr);
    }

    public static int sumRecussionIndex(int[] arr,int start,int end)
    {   
        
        if (end-start == 1)
        {
            return arr[start];
        }
        return arr[start] + sumRecussionIndex(arr,start+1,arr.length);
    }
    
    public static void  main(String[] args)
    {
        int sumRecurrsion=0;
        int[] array = {1,2,4,2,2,1,32,11};
        sumRecurrsion = sumRecurrsion(array);
        int sumloop = 0;
        for (int i =0; i<array.length;i++)
        {
            sumloop=sumloop+array[i];
        }
        System.out.println("Sum from the loop");
        System.out.println(sumloop);
        System.out.println("\"Sum from recussion");
        System.out.println(sumRecurrsion);

        int sumRecussionIndex=0;
        sumRecussionIndex = sumRecussionIndex(array,0,array.length);
        System.out.println("Sum from Recussion Index");
        System.out.println(sumRecussionIndex);
    }
}
