public class UslovieZnacheniya {
    static int uslovie(int a, int b, String s) {
        int result = 0;
        switch (s) {
            case ("+"): result = a + b;
                break;
            case ("-"): result = a - b;
                break;
            case ("*"): result = a * b;
                break;
            case ("/"): result = a / b;
                break;
            default:
                System.out.println("Некорректное действие");
        }
        return result;
    }
}
