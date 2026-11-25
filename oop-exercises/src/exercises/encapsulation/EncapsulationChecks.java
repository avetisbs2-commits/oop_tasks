package exercises.encapsulation;

import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.encapsulation.EncapsulationChecks
 */
public class EncapsulationChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("encapsulation");

        r.example("Thermostat accepts the range and rejects the rest without changing state", () -> {
            Thermostat t = new Thermostat(20);
            t.setTargetTemperature(10);
            t.setTargetTemperature(30);
            Verify.throwsException(IllegalArgumentException.class, () -> t.setTargetTemperature(31), "31");
            Verify.throwsException(IllegalArgumentException.class, () -> t.setTargetTemperature(9), "9");
            Verify.equal(30, t.getTargetTemperature(), "state kept after rejected values");
        });

        r.acceptance("ENC-1", "deposit adds to the balance", () -> {
            BankAccount a = new BankAccount("Ani", 1000);
            a.deposit(250);
            a.deposit(1);
            Verify.equal(1251L, a.getBalanceCents(), "balance");
        });
        r.acceptance("ENC-1", "deposit rejects zero and negative amounts, balance unchanged", () -> {
            BankAccount a = new BankAccount("Ani", 1000);
            Verify.throwsException(IllegalArgumentException.class, () -> a.deposit(0), "0");
            Verify.throwsException(IllegalArgumentException.class, () -> a.deposit(-5), "-5");
            Verify.equal(1000L, a.getBalanceCents(), "balance unchanged");
        });
        r.acceptance("ENC-2", "withdraw subtracts and allows the full balance", () -> {
            BankAccount a = new BankAccount("Ani", 1000);
            a.withdraw(300);
            Verify.equal(700L, a.getBalanceCents(), "after 300");
            a.withdraw(700);
            Verify.equal(0L, a.getBalanceCents(), "after the rest");
        });
        r.acceptance("ENC-2", "withdraw rejects bad amounts, balance unchanged", () -> {
            BankAccount a = new BankAccount("Ani", 1000);
            Verify.throwsException(IllegalArgumentException.class, () -> a.withdraw(0), "0");
            Verify.throwsException(IllegalArgumentException.class, () -> a.withdraw(-1), "-1");
            Verify.throwsException(IllegalStateException.class, () -> a.withdraw(1001), "more than balance");
            Verify.equal(1000L, a.getBalanceCents(), "balance unchanged");
        });
        r.acceptance("ENC-3", "transfer moves money between accounts", () -> {
            BankAccount from = new BankAccount("A", 1000);
            BankAccount to = new BankAccount("B", 50);
            AccountTools.transfer(from, to, 400);
            Verify.equal(600L, from.getBalanceCents(), "from");
            Verify.equal(450L, to.getBalanceCents(), "to");
        });
        r.acceptance("ENC-3", "a failed transfer changes nothing", () -> {
            BankAccount from = new BankAccount("A", 100);
            BankAccount to = new BankAccount("B", 50);
            Verify.throwsException(IllegalStateException.class, () -> AccountTools.transfer(from, to, 101), "not enough");
            Verify.equal(100L, from.getBalanceCents(), "from unchanged");
            Verify.equal(50L, to.getBalanceCents(), "to unchanged");
        });

        return r.summary();
    }
}
