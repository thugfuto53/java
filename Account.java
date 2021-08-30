public class Account{
    String accountNumber; //口座番号
    int balance; //残額
    /* ⓵文字列表現のメソッド  */
    public String toString(){
        return "￥￥" + this.balance + "(口座番号 : " + this.accountNumber + ")";
    }
    /* ⓶等価判定のメソッド */
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Account){
            Account a = (Account)o;
            String anl = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if(anl.equals(an2)){
                return true;
            }
        }
        return false;
    }
}