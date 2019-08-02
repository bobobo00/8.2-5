package day10;

/**
 * @ClassName OneChar
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/2 15:24]
 * @Version 1.0
 **/

public class OneChar {
    public char one(String s) {
        int i = 0;
        int j = 0;
        int m = 0;
        char[] c = new char[s.length()];
        while (j < s.length()) {
            char result = s.charAt(j);
            i=0;
            while (i < s.length()) {
                if(i==j){
                    i++; }
             char temp=s.charAt(i);
             if((temp^result)==0){
                 break;
             }
                i++;
                if(i==s.length()){
                 return result;
                }
            }
           j++;
        }
     return  '0';
    }
    public static void main(String[] args) {
        String s="affecbace";
        OneChar c=new OneChar();
        System.out.println(c.one(s));
    }
}
