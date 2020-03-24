/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// To demonstrate mouseevent handlers
package eventhandling;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/* <applet code="MouseEvents.class" width=300 height=100> </applet>
*/

/**
 *
 * @author Admin
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
{
    String msg=" ";
    // coordinates of mouse
    int mouseX=0, mouseY=0;
    
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        
    }
    
    // handle mouse clicked
    public void mouseClicked(MouseEvent me){
        //save coordinates
        mouseX=0;
        mouseY=10;
        msg= " MOUse clicked";
        repaint();
        
    }
    
    // handle mouse entered
    public void mouseEntered(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg= " MOuse entered ";
        repaint();
    }
    
    // handle mouse exited
    public void mouseExited(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg= " MOuse exited ";
        repaint();
    }
    
    // handle button pressed
    public void mousePressed(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg= " Down ";
        repaint();
    }
    
    // handle button released
    public void mouseReleased(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg= " UP ";
        repaint();
    }
    // handle mouse dragged
    public void mouseDragged(MouseEvent me)
    {
        mouseX=me.getX();
        mouseY=me.getY();
        msg= " * ";
        showStatus("Dragging mouse at "+ mouseX +","+mouseY);
        repaint();
    }
    //handle mouse moved
    public void mouseMoved(MouseEvent me){
        //show status
        showStatus("MOving mouse at "+me.getX()+" , "+me.getY());
        
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg, mouseX, mouseY);
    }
    
}
