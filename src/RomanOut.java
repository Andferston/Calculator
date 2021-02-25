import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class RomanOut {
    public static void outRome(int resultInt) {

        String resultRoman = "";

        while (resultInt >= 100) {
            resultRoman += "C";
            resultInt -= 100;
        }
        while (resultInt >= 90) {
            resultRoman += "XC";
            resultInt -= 90;
        }
        while (resultInt >= 50) {
            resultRoman += "L";
            resultInt -= 50;
        }
        while (resultInt >= 40) {
            resultRoman += "XL";
            resultInt -= 40;
        }
        while (resultInt >= 10) {
            resultRoman += "X";
            resultInt -= 10;
        }
        while (resultInt >= 9) {
            resultRoman += "IX";
            resultInt -= 9;
        }
        while (resultInt >= 5) {
            resultRoman += "V";
            resultInt -= 5;
        }
        while (resultInt >= 4) {
            resultRoman += "IV";
            resultInt -= 4;
        }
        while (resultInt >= 1) {
            resultRoman += "I";
            resultInt -= 1;
        }

        System.out.println(resultRoman);
    }
}