public class Main1376{
    public static void main(String[] args){
        System.out.print("数当てゲーム");
        int ans = new java.util.Random().nextInt(10);
        for(int i = 0; i < 5; i++){
            System.out.print("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.print("アタリ!");
                break;
            }else{
                System.out.print("違います");
            }
        }
        System.out.print("ゲームを終了します");
    }
}