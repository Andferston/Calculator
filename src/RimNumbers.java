public class RimNumbers {

    static int rimInArab(String s) {
        int number = 0;
        if (s.equals("I")) {
            number = 1;
        } else if(s.equals("II")) {
            number = 2;
        } else if(s.equals("III")) {
            number = 3;
        } else if(s.equals("IV")) {
            number = 4;
        } else if(s.equals("V")) {
            number = 5;
        } else if(s.equals("VI")) {
            number = 6;
        } else if(s.equals("VII")) {
            number = 7;
        } else if(s.equals("VIII")) {
            number = 8;
        } else if(s.equals("IX")) {
            number = 9;
        } else if(s.equals("X")) {
            number = 10;
        }
        return number;
    }
}

