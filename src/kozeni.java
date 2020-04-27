

public class kozeni {

    public static void main(String[] args) {

        int[]  num = {1,0,2,2,8,3
                };

    int money  = num[0];
        money += num[1] * 5;
        money += num[2] * 10;
        money += num[3] * 50;
        money += num[4] * 100;
        money += num[5] * 500;

        System.out.println("小銭は" + money + "円あります。");
    }

}
