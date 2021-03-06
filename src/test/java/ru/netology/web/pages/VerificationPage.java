package ru.netology.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Подтверждение входа")
public class VerificationPage extends AkitaPage {
  @FindBy(css = "[data-test-id=code] input")
  @Name("Код")
  private SelenideElement codeField;

  @FindBy(css = "[data-test-id=action-verify]")
  @Name("Продолжить")
  private SelenideElement verifyButton;

  @Optional
  @FindBy(css = "[data-test-id=error-notification] [class=notification__content]")
  @Name("неверно указан код")
  public SelenideElement error;
}
