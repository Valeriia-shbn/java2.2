//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int topUp = 1100;
        int bonusTriggerValue = 1000;
        int bonusPercent = 1;
        if (topUp > bonusTriggerValue) {
            int bonus = topUp * bonusPercent / 100;
            accountBalance = accountBalance + topUp + bonus;

            System.out.println("Итоговая сумма: " + accountBalance);
            System.out.println("Бонусов начислено: " + bonus);
        } else {
            accountBalance = accountBalance + topUp;

            System.out.println("Итоговая сумма: " + accountBalance);
            System.out.println("Бонусов начислено: 0");
        }
    }
}