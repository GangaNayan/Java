import java.awt.*;  // It supports all available packages in awt
import java.awt.event.WindowAdapter; //awt.event is separate package
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {

    public MyWindow(String title){
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                //super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Font sansSerifLarge=new Font("sansSerif",Font.BOLD,18);
        Font sansSerifSmall=new Font("sansSerif",Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete java development",60,60);
        g.setFont(sansSerifSmall);
        g.drawString("by tim buchalka",60,100);
    }

}
