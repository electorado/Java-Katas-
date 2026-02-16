public class PerimeterSequense {

    public static void main(String[] args) {
        int result = perimeterSequence(5, 3);
        System.out.println("El resultado final es: " + result);
    }

    public static int perimeterSequence(int a, int n){
        int perimeter = 4*n*a;
        return perimeter;
    }
}

