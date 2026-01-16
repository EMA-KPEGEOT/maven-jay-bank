
import com.imt.mines.bank.BankAccount;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount;

    @Test
    public void testWithdrawNormal() {
        bankAccount = new BankAccount();
        bankAccount.depositMoney(1000);
        bankAccount.setWithdrawLimit(1000);

        Boolean result = bankAccount.withdrawMoney(800);
        assertEquals(true, result);
        assertEquals(200, bankAccount.getBalance(), 0); // 1000 - 800
    }

    @Test
    public void testWithdrawAboveLimit() {
        bankAccount = new BankAccount();
        bankAccount.setWithdrawLimit(500);
        bankAccount.depositMoney(1000);

        Boolean result = bankAccount.withdrawMoney(800);
        assertEquals(false, result);
        assertEquals(1000, bankAccount.getBalance(), 0); // no withdraw
    }

    @Test
    public void testWithDrawNegativeNumber() {
        bankAccount = new BankAccount();
        bankAccount.depositMoney(1000);
        bankAccount.setWithdrawLimit(1000);

        Boolean result = bankAccount.withdrawMoney(-800);
        assertEquals(false, result);
        assertEquals(1000, bankAccount.getBalance(), 0); // no withdraw
    }

    @Test
    public void testWithdrawAboveBalance() {
        bankAccount = new BankAccount();
        bankAccount.setWithdrawLimit(1000);
        bankAccount.depositMoney(1000);

        Boolean result = bankAccount.withdrawMoney(1200);
        assertEquals(false, result);
        assertEquals(1000, bankAccount.getBalance(), 0); // no withdraw
    }

    @Test
    public void testWithdrawExceedLimit() {
        bankAccount = new BankAccount();
        bankAccount.setWithdrawLimit(1000);
        bankAccount.depositMoney(1000);

        Boolean result = bankAccount.withdrawMoney(800);
        assertEquals(true, result);
        assertEquals(200, bankAccount.getBalance(), 0); // 1000 - 200

        bankAccount.depositMoney(300); // new balance : 200 + 300 = 500
        result = bankAccount.withdrawMoney(400); // 400.+ 800 is above the withdrawn limit
        assertEquals(false, result); //
        assertEquals(500, bankAccount.getBalance(), 0);
    }


    @Test
    public void testDepositMethod() {
        bankAccount = new BankAccount();
        bankAccount.depositMoney(1000);

        assertEquals(1000, bankAccount.getBalance(), 0);
    }

    @Test
    public void testDepositNegativeMethod() {
        bankAccount = new BankAccount();
        bankAccount.depositMoney(-500);

        assertEquals(0, bankAccount.getBalance(), 0); // balance should have not been increased
    }


}
