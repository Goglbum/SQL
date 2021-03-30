package ru.netology.web.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.util.Random;

public class DataHelper {
  private DataHelper() {

  }

  @AllArgsConstructor
  @Value
  @Getter
  public static class AuthInfo {
    private String login;
    private String password;
    private String card1;
    private String card2;

    public AuthInfo(String login, String password) {
      this.login = login;
      this.password = password;
      this.card1 = "5559 0000 0000 0001";
      this.card2 = "5559 0000 0000 0002";
    }
  }

//  @Value
//  public static class DataHelperRepository {
//    private String startingBalanceCard1;
//    private String startingBalanceCard2;
//    private String resultBalanceCard1;
//    private String resultBalanceCard2;
//    private String transferAmount;
//
//  }
//
//  public static DataHelperRepository getRepository(){
//    return new  DataHelperRepository(null, null, null, null, null);
//  }
//
//  public static DataHelperRepository setStartingBalance(AuthInfo authInfo, String balanceCard1, String balanceCard2) {
//    return new DataHelperRepository(balanceCard1, balanceCard2,
//            null, null, authInfo.getAmount());
//  }
//
//  public static DataHelperRepository setResultBalance(DataHelperRepository repository, String balanceCard1, String balanceCard2) {
//    return new DataHelperRepository(repository.getStartingBalanceCard1(), repository.getStartingBalanceCard2(),
//            balanceCard1, balanceCard2, repository.getTransferAmount());
//  }

  @Value
  public static class VerificationCode {
    private String code;
  }

  public static VerificationCode getVerificationCodeFor() {
    return new VerificationCode("12345");
  }

}
