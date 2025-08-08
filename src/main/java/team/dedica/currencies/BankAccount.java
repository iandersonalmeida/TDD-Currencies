package team.dedica.currencies;
import team.dedica.currencies.Currency;

// This class represents a bank account.
public class BankAccount{

    private Currency currency;

    //Since the bank account is supposed to belong to an American bank,
    // the accountBalance variable always represents the balance in dollars.
    private double accountBalance;

    public void deposit(double amount, Currency currency){
        if(currency.getSymbol().equals("VEF")){
            double convertedValue = convertToUSD(amount);
            addToBalance(convertedValue);
        }
    }

    //In this method, the dollar exchange rate value was defined as a constant,
    // but this value could be constantly redefined, using, for example,
    // an API that provided the updated exchange rate value.
    private double convertToUSD(double amount){
        return amount * 0.007698;
    }
    // Adds the converted amount to the account balance.
    public void addToBalance(double convertedAmount){
        accountBalance = convertedAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}