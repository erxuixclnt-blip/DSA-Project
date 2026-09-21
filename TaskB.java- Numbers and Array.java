public class TaskB {

    static int[] numbers = new int[5];

    public static void main(String[] args) {

        numbers[0] = 10;
        numbers[1] = 25;
        numbers[2] = 7;
        numbers[3] = 43;
        numbers[4] = 15;

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The total sum is: " + sum);
    }
}
