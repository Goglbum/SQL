package ru.netology.web.step;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Когда;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.BaseMethods;

import java.sql.SQLException;

import static ru.netology.web.SQL.SQLQuery.getCode;


public class TemplateStepsTest {
  private final AkitaScenario scenario = AkitaScenario.getInstance();

  @Когда("^пользователь \"([^\"]*)\" вводит код верификации$")
  public void setVerificationCode(String user) throws SQLException {
    BaseMethods baseMethods = new BaseMethods();
    String code = baseMethods.getPropertyOrStringVariableOrValue(getCode(user));
    SelenideElement valueInput = scenario.getCurrentPage().getElement("Код");
    baseMethods.cleanField("Код");
    valueInput.setValue(code);
  }
}


