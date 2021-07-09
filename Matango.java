public class Matango{
    int hp = 50;
    char suffix;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    public void attack(Hero h){
        System.out.println("kinoko" + this.suffix + "no kougeki");
        System.out.println("10nodamage");
        h.hp -= 10;
    }
}