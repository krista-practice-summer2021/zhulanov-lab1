import java.util.Scanner;

public class Calc {
    private String vir;
    public static void main(String[] args) {
        Calc calc = new Calc();
        int Num1, Num2, res = 0;
        String Sign;
        calc.inputV();
        String[] strList = calc.vir.split(" ");
        Sign = strList[1];
        Num1 = Integer.parseInt(strList[0]);
        Num2 = Integer.parseInt(strList[2]);
        switch(Sign){
            case "+":
                res = Num1 + Num2;
                break;
            case "-":
                res = Num1 - Num2;
                break;
            case "*":
                res = Num1*Num2;
                break;
        }
        System.out.println(res);
    }
    public void inputV(){
        Scanner scanner = new Scanner(System.in);
        String v = scanner.nextLine();
        this.vir = v;
    };
}
