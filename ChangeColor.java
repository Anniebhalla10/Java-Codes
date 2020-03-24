package eventhandling;
import java.awt.*;
import java.awt.event.*;

class ChangeColor extends Frame
{
    int X=50,Y=50;
    public ChangeColor()
    {
        Font f=new Font("SansSerif",Font.PLAIN,18);
        setFont(f);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        FontMetrics fm=g.getFontMetrics();

        nextLine("Hi how are you",g);
    }

    void nextLine(String s, Graphics g)
    {
        FontMetrics fm=g.getFontMetrics();
        Y+=fm.getHeight();
        X=50;
        g.drawString(s,X,Y);
        X+=fm.stringWidth(s);
    }

    public static void main(String[] args)
    {
        ChangeColor appwin = new ChangeColor();
        appwin.setSize(new Dimension(700,700));
        appwin.setTitle("Pink Color");
        appwin.setBackground(Color.pink);
        appwin.setForeground(Color.BLACK);
        appwin.setVisible(true);
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}