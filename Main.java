import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        String exp = scanner.nextLine();
        System.out.println(calc(exp));
    }
    public static String calc(String input) throws Exception{
        int exp1, exp2;
        boolean roman;
        String oper;
        String res;
        String [] operands = input.split("[+\\-*/]");
        oper = detect(input);
        if (operands.length != 2){
            throw new Exception("Должно быть два числа!");
        }else if (oper == null){
            throw new Exception("Нет такого знака!");
        }
        if (Converter.roman(operands[0]) && Converter.roman(operands[1])){
            exp1 = Converter.convArabian (operands[0]);
            exp2 = Converter.convArabian (operands[1]);
            roman=true;
        }
        else if (!Converter.roman(operands[0]) && !Converter.roman(operands[1])){
            exp1 = Integer.parseInt (operands[0]);
            exp2 = Integer.parseInt (operands[1]);
            roman=false;
        }
        else {
            throw new Exception("Числа должны быть одного формата!");
        }
        if (exp1 > 10 || exp2 > 10){
            throw new Exception("Введите число от 1 до 10 !");
        }
        int arabian = opcalc(exp1, exp2, oper);
        if (roman){
            if(arabian <= 0){
                throw new Exception("Число должно быть больше 0");
            }
            res = Converter.convRoman(arabian);
        }else {
            res = String.valueOf(arabian);
        }
        return res;
    }
    static String detect (String input){
        if(input.contains("+")) return "+";
        else if(input.contains("-")) return "-";
        else if(input.contains("*")) return "*";
        else if(input.contains("/")) return "/";
        else return null;
    }
    static int opcalc(int a, int b, String oper){
        if(oper.equals("+")) return a+b;
        else if(oper.equals("-")) return a-b;
        else if(oper.equals("*")) return a*b;
        else return a/b;
    }
}