import java.util.Scanner;

public class cat {
    private String name;
    private String phoneNum;
    private int age;

    public cat(String name) {
        this.name = name;
    }

        public static void main(String[] args) {
        System.out.println("Хай!");
        cat Cat1 = new cat("Kitty");
        System.out.println(Cat1.name);
        String name = Cat1.getName();
        System.out.println(name);
        Cat1.consoleNameIn();
        System.out.println(Cat1.name);
        Cat1.InputNum();
        Cat1.consolePhoneOut();
        Cat1.inputAge();
        Cat1.checkAge();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void consoleNameIn() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        this.name = name;
    }

    public void consolePhoneOut() {
        System.out.println(this.phoneNum);
    }

    public void InputNum() {
        Scanner scanner = new Scanner(System.in);
        String phoneNum = scanner.nextLine();
        this.phoneNum = phoneNum;
    }

    public void inputAge() {
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        try {
            this.age = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            System.out.println();
        }
    }
    public void checkAge(){
        String state = "";
        if (this.age < 3)
            state = "Младовiй Кiт";
        if (this.age > 2 && this.age < 5)
            state = "Среднiй кiт";
        if (this.age > 4)
            state = "Старый кошара";
        System.out.println(state);
    }
}
