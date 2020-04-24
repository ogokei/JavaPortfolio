package test;

public class Hero extends Character implements MagicAttack {
    private Integer weapon;     //武器

    public Integer getWeapon() {
        return weapon;
    }

    public void setWeapon(Integer weapon) {
        this.weapon = weapon;
    }

    public Hero() {
    }

    public Hero(String name, Integer hp, Integer offense, Integer defense, Integer weapon) {
        super(name,hp,offense,defense);
        this.weapon = weapon;
    }

    @Override
    public void attack(Character opponent) {
        Integer damage = this.getOffense() + this.getWeapon() - opponent.getDefense();

        if(damage > 0) {
            // ダメージ量がプラスならダメージを与える
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(this.getName() + " は " + opponent.getName() + " に " + damage + " のダメージを与えた！");
        } else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！ " + this.getName() + " は " + opponent.getName() + " にダメージを与えられない！");
        }
    }

    @Override
    public void magic_attack(Character opponent) {
        Integer damage = 5;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(this.getName() + " は魔法で " + opponent.getName() + " に " + damage + " のダメージを与えた！");
    }





}
