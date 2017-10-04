import java.awt.*;

public class Hero extends PositionedImage {
    String Level;
    int MaxHP;
    int currentHP;
    int DP;
    int SP;



    public Hero() {
        super("assets/hero-down.png",0,0);
    }
}
