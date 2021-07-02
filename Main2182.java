public class Main2182{
    public static void email(String title, String address, String text){
        System.out.println(address);
        System.out.println(title);
        System.out.println(text);
    }
    public static void email(String address, String text){
        System.out.println(address);
        System.out.println("mudai");
        System.out.println(text);
    }
    public static void main(String[] args){
        String title =  "a";
        String address = "b";
        String text = "c";
        email(title, address, text);
        email(address, text);
    }
}