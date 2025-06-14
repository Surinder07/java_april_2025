package june14.inter;

public class Computer implements Calculator, GamingDevice, InternetDevice, MediaPlayer{
    @Override
    public void calculate() {
        System.out.println("Computer is calculating...");
    }

    @Override
    public void playGames() {
        System.out.println(" Play Games");
    }

    @Override
    public void surfInternet() {
        System.out.println("Internet");
    }

    @Override
    public void video() {
        System.out.println("Video Player");
    }

    @Override
    public void audio() {
        System.out.println("Audio player");
    }
}
