public class TaskA {

    static String[] relatives = new String[5];

    public static void main(String[] args) {

        relatives[0] = "Ren-ren";
        relatives[1] = "Cheska";
        relatives[2] = "Aviana";
        relatives[3] = "Yzabella";
        relatives[4] = "Nell";

        for (int i = 0; i < relatives.length; i++) {
            System.out.println("Index " + i + ": " + relatives[i]);
        }
    }
}
