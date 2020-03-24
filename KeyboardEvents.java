/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="KeyboardEvents.class" width= 300 height=200 >
</applet>
*/


/**
 *
 * @author Admin
 */
public class KeyboardEvents extends Applet implements KeyListener {
    String msg="";
    // output coordinates 
    int x=10,y=20;
    
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.BLUE);
        addKeyListener(this);
    }
    
    public void keyPressed(KeyEvent ke)
    {
        showStatus("Key down ");
        int key= ke.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_F1:
                msg+= "<F1>";
                break;
            case KeyEvent.VK_BACK_SPACE:
                msg+= "<BACKSPACE>";
                break;
            case KeyEvent.VK_LEFT:
                msg+="<LEFT>";
                break;
                
        }
        repaint();
    }
    
    public void keyReleased(KeyEvent ke)
    {
        showStatus(" Key Up");
    }
    public void keyTyped(KeyEvent ke)
    {
        msg+= ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
}
