import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        ;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z'){
                System.out.print((char)('a' + ch - 'A'));
            }else{
                System.out.print((char)('A' + ch - 'a'));
            }
        }

        sc.close();
        
    }
}
