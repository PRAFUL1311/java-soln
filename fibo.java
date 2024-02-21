public class fibo {
    public static void main(String[] args) {
        System.out.println(fibof(7));
    
    }
    static int fibof(int n){
        if(n<2){
            return n;
        }
        return fibof(n-1) + fibof(n-2);
    } 
}
