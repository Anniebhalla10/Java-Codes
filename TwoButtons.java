/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;
 import java.awt.*;
import java.awt.event.*;

class TwoButtons extends Frame implements ActionListener
{
    String msg="";
    Button Red,Blue;

    public TwoButtons()
    {
        setLayout(new FlowLayout());
        Red = new Button("Red");
        Blue = new Button("Blue");

        add(Red);
        add(Blue);

        Red.addActionListener(this);
        Blue.addActionListener(this);

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
        g.drawString("", 50, 50);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("Red"))
        {
            setBackground(Color.red);
        }
        if(str.equals("Blue"))
        {
            setBackground(Color.blue);
        }
        repaint();
    }

    public static void main(String[] args)
    {
        TwoButtons appwin=new TwoButtons();
        appwin.setSize(new Dimension(350,350));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
    }
}