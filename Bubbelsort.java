public class Bubbelsort {
    public static void main(String[] args) {
        int arr[]={4,45,6,7,4,33,32,2,};
        Bubbelsortq(arr);
    }
    public static void Bubbelsortq(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length -1 -i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    
}
