package les6_kadai;

public class BaseBallTeam {

    private String name;
    private int    win;
    private int    lose;
    private int    drow;

    public BaseBallTeam() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDrow() {
        return drow;
    }
    public void setDrow(int drow) {
        this.drow = drow;
    }

    public double getRate() {

        double rate = getWin() / ((double)getWin() + (double)getLose());
        return rate;
    }

    public void report() {

        System.out.println(name+"の2019年の成績は"+win+"勝"+lose+"敗"+drow+"分、勝率は "+getRate()+"です。");
    }
}
