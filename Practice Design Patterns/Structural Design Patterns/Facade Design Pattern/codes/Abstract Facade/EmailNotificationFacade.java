public class EmailNotificationFacade implements NotificationFacade{
  private EmailService emailService;

  public EmailNotificationFacade() {
    this.emailService = new EmailService();
  }

  public void send(String message) {
    emailService.sendEmail((message));
  }
}
