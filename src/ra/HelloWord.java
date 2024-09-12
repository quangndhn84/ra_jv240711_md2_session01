package ra;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word!!!");
        //primitive
        float number = 5.7F;
        int totalNumber = addTwoNumbers(5,7);
        //reference
        int[] arrInt = {3,5,7};

    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        //Ctrl + Alt + L
        int sumNumbers = firstNumber + secondNumber;
        return sumNumbers;
    }
}
