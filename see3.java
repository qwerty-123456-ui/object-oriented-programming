/*
    <applet code="see3" height="300" width = "330">
    </applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class see3 extends Applet implements KeyListener{
   String revNum="";
   
    Label numL;
    TextField numF;
    
    public void init()
    {   

        setLayout(null);


        numL = new Label("Enter a Number: ");
        numL.setBounds(20,50,120,20);
        add(numL);


        numF = new TextField(10);
        numF.setBounds(150,50,100,20);
        add(numF);

        numF.addKeyListener(this);
        
        
        setBackground(Color.LIGHT_GRAY);

    }
    

    public void keyPressed(KeyEvent k)
    {
        int dig,rev=0;
        if(k.getKeyChar() == 'r' || k.getKeyChar() == 'R')
        {   
            int a = Integer.parseInt(numF.getText());
            while(a != 0)
            {
                dig = a % 10;
                a /= 10;
                rev = rev*10+dig;

            }
            showStatus(Integer.toString(rev));
        }    
        // showStatus("pressed");

    }

    public void keyReleased(KeyEvent k)
    {
        // showStatus("released");
        
    }

    public void keyTyped(KeyEvent k)
    {
        // showStatus("typed");
    }
    
}
