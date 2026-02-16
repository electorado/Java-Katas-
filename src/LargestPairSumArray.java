import java.util.Arrays;
public class LargestPairSumArray {
    public static void main(String[] args) {

        int[] misNumeros = {99, 2, 2, 23, 19};
        int result = Solution.largestPairSum(misNumeros);
        System.out.println("La suma de los dos mayores es: " + result);
    }

    public class Solution{
        public static int largestPairSum(int[] numbers){
            int last = numbers.length -1;
            Arrays.sort(numbers);
            int sum = (numbers[last])+(numbers[last - 1]);
            return sum;
        }
    }
}
