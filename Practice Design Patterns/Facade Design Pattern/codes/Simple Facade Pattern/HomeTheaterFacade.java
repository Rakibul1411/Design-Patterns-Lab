public class HomeTheaterFacade {
  
  private TV tv;
  private DVDPlayer dvdPlayer;
  private SoundSystem soundSystem;

  public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
    this.tv = tv;
    this.dvdPlayer = dvdPlayer;
    this.soundSystem = soundSystem;
  }

  public void watchMovie () {
    System.out.println("Get ready to watch a movie...");
    tv.on();
    soundSystem.setVolume(20);
    dvdPlayer.play();
  }

  public void endMovie () {
    System.out.println("Shutting down movie theater...");
    dvdPlayer.stop();
    tv.off();
  }
}
