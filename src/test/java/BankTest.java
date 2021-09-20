import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {

    // code coverage kan beter, dus je test nu niet alles van de bank.

    @Test
    public void intBalanceGreater0() {
        //given
        Account a = new Account(1, 100, 1.04);
        Account b = new Account(2, 200, 1.04);

        //when
        Bank.transfer(a,b,100);

        //then
        assertEquals(true, a.balance>= 0); // IDEA: "'assertEquals()' can be simplified to 'assertTrue()' "
    }
}
