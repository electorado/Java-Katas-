public class ThirdAngle {
    public static void main(String[] args) {
        int result = otherAngle(50,70);
        System.out.println(result);

    }

    public static int otherAngle(int angle1, int angle2) {
        int thirdAngle = 180 - angle1 -angle2;
        return thirdAngle;
    }
}
