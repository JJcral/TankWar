import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: xuwenjin
 * @Date: 2020/4/8 12:33
 * @Description:
 */
public class TankClient extends Frame {


    private void createFrame(){
        this.setLocation(400,300);
        this.setSize(800,600);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        this.setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args) {
        TankClient tankClient = new TankClient();
        tankClient.createFrame();
    }
}
