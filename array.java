import java.util.*;

public class array {
    public static void main(String []a){
       int arr[] []=new int[9][7];
       System.out.println(arr.length);
       //row count
        System.out.println(arr[0].length);
        //column  count
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println("enter a number at index ="+i+"and"+j);
            arr[i][j]=sc.nextInt();
        }
        
       }


       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           System.out.println(arr[i][j]);
        }
        
       }
      


    }
}
