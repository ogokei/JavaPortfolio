package test;

public class Character {

   private String name;      //キャラクター名
   private Integer hp;       //ヒットポイント
   private Integer offense;  //攻撃力
   private Integer defense;  //防御力

   public Character() {

   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public Integer getHp() {
       return hp;
   }

   public void setHp(Integer hp) {
       this.hp = hp;
   }

   public Integer getOffense() {
       return offense;
   }

   public void setOffense(Integer offense) {
       this.offense = offense;
   }

   public Integer getDefense() {
       return defense;
   }

   public void setDefense(Integer defense) {
       this.defense = defense;
   }

   public Character(String name, Integer hp, Integer offense, Integer defense) {
       this.name = name;
       this.hp = hp;
       this.offense = offense;
       this.defense = defense;
   }

   public void attack(Character opponent) {

       Integer damage = this.offense - opponent.defense;

       if(damage > 0) {
           // ダメージ量がプラスならダメージを与える
           opponent.hp = opponent.hp - damage;
           System.out.println(this.name + " は " + opponent.name + " に " + damage + " のダメージを与えた！");
       } else {
           // ダメージ量が0以下ならミスにする
           System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
       }
   }
}
