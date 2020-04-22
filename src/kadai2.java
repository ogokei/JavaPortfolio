//課題：FizzBuzz問題
//1から100までの連続した整数を画面に表示していく。ただし、
//・もし、その整数が3で割り切れる数なら “Fizz” と表示する。
//・もし、その整数が5で割り切れる数なら “Buzz” と表示する。
//・上記2つの条件は同時に満たせる。
//つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら “FizzBuzz” と表示する。
//・それ以外の数は、その数をそのまま表示する。


public class kadai2 {

    public static void main(String[] args) {

        int i = 1;

        while (i != 101 ) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
            i ++;
        }
    }
}
