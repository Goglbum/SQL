package ru.netology.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;


@Name("Страница входа")
public class LoginPage extends AkitaPage {

  @Name("Логин")
  @FindBy(css = "[data-test-id=login] input")
  public SelenideElement loginField;

  @Name("Пароль")
  @FindBy(css = "[data-test-id=password] input")
  public SelenideElement passwordField;

  @Name("Продолжить")
  @FindBy(css = "[data-test-id=action-login]")
  public SelenideElement loginButton;

  @Optional
  @FindBy(css = "[data-test-id=error-notification]")
  @Name("неверный логин или пароль")
  public SelenideElement error;
}
