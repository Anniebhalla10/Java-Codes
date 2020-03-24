/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;
 import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
  

    String msg="";
    int mouseX=0,mouseY=0;
    static Boolean val=true;

    public MouseEventsDemo()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void mouseClicked(MouseEvent me)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse Clicked!";
        repaint();
    }

    public void mouseEntered(MouseEvent me)
    {
        this.setVisible(true);
        mouseX=0;
        mouseY=10;
        msg="Mouse entered!";
        repaint();
    }

    public void mouseExited(MouseEvent me)
    {
        mouseX=0;
        mouseY=10;
        msg="Mouse exited!";
        repaint();
        this.setVisible(false);
    }

    public void mousePressed(MouseEvent me)
    {
    }

    public void mouseReleased(MouseEvent me)
    {
    }

    public void mouseDragged(MouseEvent me)
    {
    }

    public void mouseMoved(MouseEvent me)
    {
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args)
    {
        MouseEventsDemo appwin=new MouseEventsDemo();
        appwin.setSize(new Dimension(400,500));
        appwin.setTitle("MouseEventsDemo");
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
    

