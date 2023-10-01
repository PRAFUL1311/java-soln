import java.util.Scanner;

public class Input {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elemets");
        int n=sc.nextInt();
        int temp;
        int arr[]=new int[20];
          System.out.println("enter the array elemets");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           for(int i=0;i<n;i++){
             for(int j=0;j<n-1;j++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

                
            }
           }
             System.out.println("sorted array");
           for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }

        }

    }


