public class FindMean {
    public static void main(String[] args) {
        int[] misNumeros = {99, 2, 2, 23, 19};
        int result = findAverage(misNumeros);
        System.out.println("La media es: " + result);
    }

    public static int findAverage(int[] nums) {
        int add = 0;
        for (int i=0; i< nums.length; i++){
            add += nums[i];
        }
        int mean = add/nums.length;
        return mean;
    }
}
