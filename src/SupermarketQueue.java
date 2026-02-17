public class SupermarketQueue {
    public static void main(String[] args) {
        int[] customers = { 2, 2, 3, 3, 4, 4 };
        int n = 2;
        System.out.println("Total time required for all the customers to check out is: " + solveSuperMarketQueue(customers, n));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] tills = new int[n];

        for (int customerTime : customers) {
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (tills[i] < tills[minIndex]) {
                    minIndex = i;
                }
            }
            tills[minIndex] += customerTime;
        }

        int totalTime = 0;
        for (int time : tills) {
            if (time > totalTime) {
                totalTime = time;
            }
        }

        return totalTime;
    }
}
