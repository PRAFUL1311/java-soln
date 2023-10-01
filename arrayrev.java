
public class arrayrev {
    public static void main(String []a){

  
    int arr[]={1,2,3,4,5};

    int i=0,temp;
    int j= arr.length-1;
    while(i<j){
        // arr[i]=arr[j];
        // arr[j]=arr[i];
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;

     i++;
     j--;
    }

    for(int e=0;e<arr.length;e++){
        System.out.println(arr[e]);
    }
    }
}
