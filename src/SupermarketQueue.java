public class SupermarketQueue {
    public static void main(String[] args) {
        int[] customers = { 2, 2, 7, 3, 3, 10, 4, 4, 2, 5, 8, 4, 3, 5};
        int n = 4;
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
