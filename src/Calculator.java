
public class Calculator {
    public void arabNumbers() throws Exception {

        String[] arRim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arTask = BuffNumbers.buffer().split(" ");

        try {
            boolean standart = true;
            for (int i = 0; i < 10; i++) {
                if (arRim[i].equals(arTask[0]) || arRim[i].equals(arTask[2]))
                    standart = false;
            }
            int a, b;
            String s = arTask[1];
            if (standart) {
                a = Integer.parseInt(arTask[0]);
                b = Integer.parseInt(arTask[2]);
                if (a > 0 && a < 11 && b > 0 && b < 11) {
                    int result = UslovieZnacheniya.uslovie(a, b, s);
                    System.out.println(result);
                } else {
                    throw new NumberFormatException("Числа вне диапазона: от 1 до 10");
                }

            } else {
                a = RimNumbers.rimInArab(arTask[0]);
                b = RimNumbers.rimInArab(arTask[2]);
                if (a > 0 && a < 11 && b > 0 && b < 11) {
                    int result = UslovieZnacheniya.uslovie(a, b, s);
                    RomanOut.outRome(result);
                } else {
                    throw new NumberFormatException("Числа вне диапазона: от 1 до 10");
                }
            }

        } catch (RuntimeException e) {
            System.out.println("Введены некорректные данные: " + e);
        }
    }

}
