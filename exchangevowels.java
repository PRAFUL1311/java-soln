import java.util.Scanner;

public class exchangevowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char []c=str.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            while(i<j && !isvowel(c[i])){
                i++;
            }
            while(i<j && !isvowel(c[j])){
                j++;
            }

            if(i<j){
                char temp= c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
        }

        for(char t:c){
            System.out.print(t);
        }

        }
        public static Boolean isvowel(char c){
            return "aeiouAEIOU".indexOf(c)!= -1;
            
        }
    }

