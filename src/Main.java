public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int depositAmount = 5500;
        int amountToGetOneRuble = 100;
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / amountToGetOneRuble + depositAmount + balance;
        } else {
            bonus = depositAmount + balance;
        }
        System.out.println("Баланс: " + bonus);
    }
}