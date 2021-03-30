package ru.netology.web.step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.BaseMethods;
import ru.netology.web.data.DataHelper;
import ru.netology.web.pages.DashboardPage;
import ru.netology.web.pages.LoginPage;
import ru.netology.web.pages.VerificationPage;

import java.sql.DriverManager;
import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ru.alfabank.tests.core.helpers.PropertyLoader.loadProperty;
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

//  @Пусть("^пользователь залогинен с именем \"([^\"]*)\" и паролем \"([^\"]*)\"$")
//  public void loginWithNameAndPassword(String login, String password) {
//    val loginUrl = loadProperty("loginUrl");
//    open(loginUrl);
//
//    scenario.setCurrentPage(Selenide.page(LoginPage.class));
//    val loginPage = (LoginPage) scenario.getCurrentPage().appeared();
//    val authInfo = new DataHelper.AuthInfo(login, password);
//    scenario.setCurrentPage(loginPage.validLogin(authInfo));
//
//    val verificationPage = (VerificationPage) scenario.getCurrentPage().appeared();
//    val verificationCode = DataHelper.getVerificationCodeFor();
//    scenario.setCurrentPage(verificationPage.validVerify(verificationCode));
//  }
}


