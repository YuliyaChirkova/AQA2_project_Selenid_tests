package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {
    public SelenideElement textMessage = $(byText("THANK YOU FOR YOUR ORDER"));


}
