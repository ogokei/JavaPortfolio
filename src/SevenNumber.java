// 練習問題
//SevenNumber という名前のクラス （SevenNumber.javaファイル）を作成してください。そのファイル内に、1から100までの数値を順番に出力するプログラムを作成してください。なお、以下のいずれかの条件を満たす場合は、数値ではなく clap! という文字列を出力します。
//7の倍数
//7が入っている数


public class SevenNumber {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {

            if (i % 7 == 0 || i % 10 == 7|| i / 10 == 7 )  {
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
        }

    }

}
