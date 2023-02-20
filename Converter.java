import static javax.swing.text.html.HTML.Tag.I;

public class Converter {
    static  String[] romArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XII", "XCIII", "XCIV", "XCV", "XCVI", "XVII", "XCVIII", "ХХIХ", "C"};
    public static boolean roman(String input){
        for (int i = 0; i < romArray.length; i++){
            if (input.equals(romArray[i])){
                return true;
            }
        }
        return false;
    }
    public static int convArabian(String roman){
        for (int i = 0; i < romArray.length; i++){
            if (roman.equals(romArray[i])){
                return i;
            }
        }
        return -1;
    }
    public static String convRoman(int arab){
        return romArray[arab];
    }

}



