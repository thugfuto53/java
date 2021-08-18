public class Main2182{
    public static void email(String title, String address, String text){
        System.out.println(address);
        System.out.println(title);
        System.out.println(text);
    }
    public static void email(String address, String text){
        System.out.println(address);
        System.out.println("無題");
        System.out.println(text);
    }
    public static void main(String[] args){
        String title =  "タイトル";
        String address = "アドレス";
        String text = "本文";
        email(title, address, text);
        email(address, text);
    }
}