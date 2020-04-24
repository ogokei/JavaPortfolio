

public class kozeni {

    public static void main(String[] args) {

        int money = 0;
        int[]  num = {1,0,2,2,8,3
                };

        money = num[0];
        money = money + num[1] * 5;
        money = money + num[2] * 10;
        money = money + num[3] * 50;
        money = money + num[4] * 100;
        money = money + num[5] * 500;

        System.out.println("小銭は" + money + "円あります。");
    }

}
