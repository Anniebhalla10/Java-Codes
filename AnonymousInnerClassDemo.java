/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/* <applet code="AnonymousInnerClassDemo" height=700 width=700></applet>*/
/**
 *
 * @author Admin
 */
public class AnonymousInnerClassDemo extends Applet{
    public void init()
    {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me)
            {
                showStatus("MOUSE PRESSED");
            }
        });
    }
}
