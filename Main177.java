public class Main177{
    public static void main(String[] args){
        int[] numbers = {3, 4, 9};
        System.out.println("1ketanosuuziwo nyuuryoku sitekudasai");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int n : numbers){
            if(n == input){
                System.out.println("atari!");
            }
        }
    }
}