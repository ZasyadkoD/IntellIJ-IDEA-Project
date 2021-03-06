package bank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Пополняем депозит на 100 долларов
 */

public class DepositPage {
     private static final SelenideElement DEPOSIT_BUTTON = $x("//*[@ng-click='deposit()']");
     private static final SelenideElement AMOUNT_DEPOSIT = $x("//*[text()='Amount to be Deposited :']/following-sibling::input");
     private static final SelenideElement CLICK_ON_DEPOSIT_BUTTON = $x("//*[text()='Deposit']");

     public static void depositButton() {
        DEPOSIT_BUTTON.click();
    }
    public static void clickOnamountDeposit(String first){
                AMOUNT_DEPOSIT.setValue(first);}
    public static void ClickOndepositButton(){
        CLICK_ON_DEPOSIT_BUTTON.click();
    }


}




