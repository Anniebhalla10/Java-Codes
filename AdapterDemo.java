/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/* <applet code="AdapterDemo.class" width=500 height=500 > </applet>
*/


/**
 *
 * @author Admin
 */
public class AdapterDemo extends Applet{
    public void init()
    {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
    
}
class MyMouseAdapter extends MouseAdapter
{
    AdapterDemo object;
    public MyMouseAdapter( AdapterDemo adapterDemo)
    {
     object= adapterDemo;   
    }
    //handle mouse clicked
    public void mouseClicked(MouseEvent me){
        object.showStatus("Mouse Clicked");
        
    }
    
}

class MyMouseMotionAdapter extends MouseMotionAdapter
{
    AdapterDemo obj2;
    public MyMouseMotionAdapter(AdapterDemo ad)
    {
        obj2=ad;
    }
    //handle mouse dragged
    public void mouseDragged(MouseEvent me)
    {
        obj2.showStatus("Mouse dragged");
    }
}