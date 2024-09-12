package ra;

public class CastingDemo {
    public static void main(String[] args) {
        int firstNumber = 10;
        //10: int --> float --> gán secondNumber --> implicit
        float secondNumber = 10;
        //7.5: double --> int --> gán thirthNumber --> explicit
        int thirthNumber = (int)7.5;
    }
}
