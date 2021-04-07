package ru.netology.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Дашбоард")
public class DashboardPage extends AkitaPage {
  @FindBy (css = "h2")
  public SelenideElement heading;
}
