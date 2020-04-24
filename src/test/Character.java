package test;

public class Character {

   public String name;
   public Integer hp;
   public Integer offense;
   public Integer defense;

   public Character() {

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
