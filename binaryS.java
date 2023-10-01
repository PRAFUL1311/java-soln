class binaryS{
    public static void main(String S[]){
        int pb[]={1,2,3,4,5,6,7,8,9};
        int first=0;
        int last=pb.length-1;
        int mid=(first+last)/2;
        int key=9;
        while(first<=last){
            if(pb[mid]<key){
                first=mid+1;
            }
            else if(pb[mid]==key){
                System.out.println("elemnet found at index ="+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;

            if(first>last){
                System.out.println("element not found in a array");
                   break;
            }
        }
    }
}