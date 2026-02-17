import java.util.ArrayList;
import java.util.Arrays;

public class NoDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3, 3, 1, 4, 2, 4, 5, 6, 7, 7, 7};
        System.out.println("With duplicates: " + Arrays.toString(nums));
        System.out.println("Without duplicates: " + Arrays.toString(distinct(nums)));
    }

    public static int[] distinct(int[] array){
        int[] resultList = new int [array.length];
        int count = 0;

        for (int elmnt : array) {
            boolean duplicate = false;
            for(int i=0; i<count; i++)
                if (elmnt == resultList[i]){
                    duplicate = true;
                    break;
                }
            if (!duplicate){
                resultList[count] = elmnt;
                count++;
            }
        }

        int[] clean = new int[count];
        for (int i = 0; i < count; i++) {
            clean[i] = resultList[i];
        }
        return clean;
    }


}
