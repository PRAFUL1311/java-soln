public class factorial {
    public static void main(String[] args) {
        int a=5;
        
       System.out.println( printfact(a));
    }
    public static int printfact(int a){
        if(a==0){
            return 1;
        }
        
        
      int f=  printfact(a-1);
      return f*a;

        
        
    }

}
