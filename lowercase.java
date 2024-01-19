public class lowercase {
    public static void main(String[] args) {
        String str="Hello";
        char []ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(c>='A' && c<='Z'){

                char f= (char)(c - 'A' + 'a');
                ch[i]=f;
            }
        }
        for(char c:ch){
            System.err.print(c);
        }
    }
}
