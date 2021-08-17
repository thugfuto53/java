import java.util.*;

public class Cleric {
    String name = "クレリック";
    int hp = 50;
    final int maxhp = 50;
    int mp = 10;
    final int maxmp = 10;
    public void selfAid(){
        System.out.println(this.name + "はセルフエイドをとなえた！");
        this.hp = this.maxhp;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した");
    }
    public int pray(int sec){
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.maxhp - this.mp, recover);
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }
}
