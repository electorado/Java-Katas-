import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int c = 6388;
        int k = 10336;
        int[] resultado = solution(c, k);
        System.out.println("Para first=" + c + " y second=" + k);
        System.out.println("El resultado es: " + Arrays.toString(resultado));
    }

    public static int[] solution(int first, int second) {
        int last = 0;
        while (second - first <= first) {
            last = second - first;
            second = first;
            first = last;
            }
        return new int[] {first, second};
        }
    }


