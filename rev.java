import java.util.Scanner;

public class rev {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        char []c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            char s=c[i];
            if(s>='A' && s<='Z'){
                char f=(char)(s - 'A' +'a');
                c[i]=f;
            }
        }

        for(char t:c){
            System.out.print(t);
        }

    }
}