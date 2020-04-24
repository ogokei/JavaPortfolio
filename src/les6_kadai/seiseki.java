package les6_kadai;

public class seiseki {

    public static void main(String[] args) {

        BaseBallTeam yomiuri = new BaseBallTeam();
        yomiuri.setName("読売ジャイアンツ");
        yomiuri.setWin(77);
        yomiuri.setLose(64);
        yomiuri.setDrow(2);
        yomiuri.report();

        BaseBallTeam dena = new BaseBallTeam();
        dena.setName("横浜DeNAベイスターズ");
        dena.setWin(71);
        dena.setLose(69);
        dena.setDrow(3);
        dena.report();

        BaseBallTeam hashin = new BaseBallTeam();
        hashin.setName("阪神タイガース");
        hashin.setWin(69);
        hashin.setLose(68);
        hashin.setDrow(6);
        hashin.report();

        BaseBallTeam carp = new BaseBallTeam();
        carp.setName("広島東洋カープ");
        carp.setWin(70);
        carp.setLose(70);
        carp.setDrow(3);
        carp.report();

        BaseBallTeam tuniti = new BaseBallTeam();
        tuniti.setName("中日ドラゴンズ");
        tuniti.setWin(68);
        tuniti.setLose(73);
        tuniti.setDrow(2);
        tuniti.report();

        BaseBallTeam yakuruto = new BaseBallTeam();
        yakuruto.setName("ヤクルトスワローズ");
        yakuruto.setWin(68);
        yakuruto.setLose(73);
        yakuruto.setDrow(2);
        yakuruto.report();

    }

}
