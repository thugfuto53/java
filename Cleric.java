import java.util.*;

public class Cleric {
    String name = "kurelic";
    int hp = 50;
    final int maxhp = 50;
    int mp = 10;
    final int maxmp = 10;
    public void selfAid(){
        System.out.println(this.name + "ha seruhueidowo tonaeta!");
        this.hp = this.maxhp;
        this.mp -= 5;
        System.out.println("HPgasaidaimadekaihukusita");
    }
    public int pray(int sec){
        System.out.println(this.name + "ha" + sec + "byoukann ten niinotta!");
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.maxhp - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MPga" + recoverActual + "kaihukusita");
        return recoverActual;
    }
}