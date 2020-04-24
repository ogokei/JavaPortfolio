package test;

public class Enemy extends Character {
    private String type;        // 種別名

    // ゲッターとセッター
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 引数なしのコンストラクタ
    public Enemy() {
    }

    // 引数ありのコンストラクタ
    public Enemy(String name, Integer hp, Integer offense, Integer defense, String type) {
        super(name, hp, offense, defense);
        this.type = type;
    }
}