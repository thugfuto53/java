public class Main1376{
    public static void main(String[] args){
        System.out.print("kazuate game");
        int ans = new java.util.Random().nextInt(10);
        for(int i = 0; i < 5; i++){
            System.out.print("0~9no suuzi wo nyuuryoku sitekudasai");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.print("atari!");
                break;
            }else{
                System.out.print("tigaimasu");
            }
        }
        System.out.print("game wo syuuryou simasu");
    }
}