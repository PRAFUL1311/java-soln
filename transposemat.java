public class transposemat {
    public static void main(String []a){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
       for(int k=0;k<arr.length;k++){
    for(int t=k+1;t<arr[0].length;t++){
       int temp=arr[k][t];
       arr[k][t]=arr[t][k];
       arr[t][k]=temp;
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
