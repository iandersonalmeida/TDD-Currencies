package team.dedica.currencies;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    //
    @Test
    void depositInVEF_ShouldBeConvertedToUSD(){
        BankAccount bankAccount = new BankAccount();
        double amount = 1000;
        bankAccount.deposit(amount, Currency.forSymbol("VEF"));
        double expectedAmount = amount * 0.007698;
        assertThat(bankAccount.getAccountBalance()).isEqualByComparingTo(expectedAmount);
    }
}
