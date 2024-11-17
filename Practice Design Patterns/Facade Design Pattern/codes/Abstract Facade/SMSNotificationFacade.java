public class SMSNotificationFacade implements NotificationFacade{
  private SMSService smsService;

  public SMSNotificationFacade() {
    this.smsService = new SMSService();
  }

  public void send(String message) {
    smsService.sendSMS(message);
  }
}
