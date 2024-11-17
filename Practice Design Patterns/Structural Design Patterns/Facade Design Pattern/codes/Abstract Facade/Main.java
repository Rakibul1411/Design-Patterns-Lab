public class Main {

  public static void main(String[] args) {
    NotificationFacade emailFacade = new EmailNotificationFacade();
        NotificationFacade smsFacade = new SMSNotificationFacade();

        emailFacade.send("Your order has been shipped!");
        smsFacade.send("Your OTP is 123456.");
  }

}
