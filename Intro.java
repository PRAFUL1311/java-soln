public class Intro {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0;i<s.length();i++){
              char c=s.charAt(i);
              if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u'){
                continue;
              }
              System.out.print(c);
        }
    }
}
