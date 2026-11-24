package exercises.encapsulation;

import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.encapsulation.EncapsulationDemo
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. Thermostat");
        Thermostat thermostat = new Thermostat(20);
        Demo.expect("getTargetTemperature()", 20, thermostat::getTargetTemperature);
        Demo.expectThrows("setTargetTemperature(99) (սխալ արժեք)", IllegalArgumentException.class,
                () -> thermostat.setTargetTemperature(99));
        Demo.expect("getTargetTemperature() սխալից հետո", 20, thermostat::getTargetTemperature);
        // thermostat.targetTemperature = 99;     // <- կոմպիլյացիայի սխալ. դաշտը private է

        Demo.title("2. Վարժություն 1. BankAccount (ENC-1, ENC-2)");
        Demo.expect("deposit(250) -> մնացորդ", 1250L, () -> {
            BankAccount account = new BankAccount("Ani", 1000);
            account.deposit(250);
            return account.getBalanceCents();
        });
        Demo.expect("withdraw(300) -> մնացորդ", 700L, () -> {
            BankAccount account = new BankAccount("Ani", 1000);
            account.withdraw(300);
            return account.getBalanceCents();
        });
        Demo.expectThrows("deposit(-5) (սխալ գումար)", IllegalArgumentException.class,
                () -> new BankAccount("Ani", 1000).deposit(-5));
        Demo.expectThrows("withdraw(1001) (չափից շատ)", IllegalStateException.class,
                () -> new BankAccount("Ani", 1000).withdraw(1001));

        Demo.title("3. Վարժություն 2. transfer (ENC-3)");
        Demo.expect("transfer(a=1000 -> b=50, 400): a + \"/\" + b", "600/450", () -> {
            BankAccount a = new BankAccount("A", 1000);
            BankAccount b = new BankAccount("B", 50);
            AccountTools.transfer(a, b, 400);
            return a.getBalanceCents() + "/" + b.getBalanceCents();
        });

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ են դաշտերը private։ Ի՞նչ կարող էր պատահել, եթե balanceCents-ը public լիներ։");
        Demo.line("  2. Ինչու՞ են գումարները long լումաներով, ոչ թե double (օրինակ՝ 0.1 + 0.2 ըստ double-ի)։");
        Demo.line("  3. Ինչու՞ է անվավեր գործողության դեպքում լավ է վիճակը չփոխել և բացառություն նետել, ոչ թե լռել։");
    }
}
