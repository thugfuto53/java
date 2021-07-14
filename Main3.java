public class Main3{
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
                for(int r = 0; r < i+1; r++){
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}