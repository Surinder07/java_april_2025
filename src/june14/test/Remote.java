package june14.test;

public class Remote {

    int x;
    public void click(){
        System.out.println("Remote");
    }

    public void show(){
        System.out.println("SHow method ");
    }
}

class TvRemote extends Remote{

    @Override
    public void click(){
        System.out.println(super.x);
        super.show();
        System.out.println("Remote");
    }

}
