import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BankTest {

    Bank abn;

    @Before
    public void setUp() {
        this.abn = new Bank();
        this.abn.createAccounts();
    }

    @Test
    public void transferCheck() {
        //given

        Account a = abn.fetchAccountNumber(1);
        Account b = abn.fetchAccountNumber(2);

        //when
        abn.transfer(1, 2, 5);

        //then
        assertTrue(a.balance >= 0);
        assertTrue(b.balance >= 0);
    }

    @Test
    public void withdrawCheck() {
        //given

        Account a = abn.fetchAccountNumber(1);

        //when
        abn.withdraw(1, 100);

        //then
        assertTrue(a.balance >= 0);
    }

    @Test
    public void totalBalanceCheck() {
        //given


        //when
        abn.totalBalance();

        //then
        assertTrue(abn.totalBalance >= 0);
    }

}
