public class reverse {
    public static void main(String[] args) {
        String str="Hello Praful";
        char []c =str.toCharArray();
        for(int i=0;i<c.length;i++){
            char ch=c[i];

            if(ch>='A' && ch<='Z'){
                
                char a=(char)(ch-'A'+'a');
                c[i]=a;

            }
        }
        for(char a:c){
           System.out.print(a);
        }
    }
}
