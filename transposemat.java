public class transposemat {
    public static void main(String []a){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
       for(int k=0;k<arr.length;k++){
    for(int t=0;t<k;t++){
       int temp=arr[k][t];
       arr[k][t]=arr[t][k];
       arr[t][k]=temp;
    }
   }
   for(int i=0;i<arr.length;i++)
   {
    int start=0;
    int end=arr.length-1;
    while(end>start){
        int temp=arr[i][start];
        arr[i][start]=arr[i][end];
        arr[i][end]=temp;
        start++;
        end--;
    }
   }
   for(int k=0;k<arr.length;k++){
    for(int t=0;t<arr[0].length;t++){
        System.out.print(arr[k][t]);
    }
    System.out.println();
   }
    }
}