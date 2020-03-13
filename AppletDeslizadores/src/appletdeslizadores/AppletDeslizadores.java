/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdeslizadores;

import java.awt.*;
import java.awt.event.*;


public class AppletDeslizadores extends Frame implements AdjustmentListener {

Frame f1; 
TextField t1,t2,t3;
Scrollbar s1,s2,s3;
Label l9;
  
    public AppletDeslizadores (){
        
    f1 = new Frame ("Cambio de Color");    
    t1 = new TextField("");
    t2 = new TextField("");
    t3 = new TextField("");
    s1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
    s2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
    s3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
    l9 = new Label();
           
    f1.add(s1);
    f1.add(s2);
    f1.add(s3);
    f1.add(t1);
    f1.add(t2);
    f1.add(t3);
    f1.add(l9);
         
    t1.setEditable(false);
    t2.setEditable(false);
    t3.setEditable(false);
    
    s1.addAdjustmentListener(this);
    s2.addAdjustmentListener(this);
    s3.addAdjustmentListener(this);
    
    s1.setBounds(10,30,80,20);
    s1.setBackground(Color.red);
    s2.setBounds(100,30,80,20);
    s2.setBackground(Color.green);
    s3.setBounds(190,30,80,20);
    s3.setBackground(Color.blue);
     
    t1.setBounds(50,100,150,20);
    t1.setBackground(Color.red);
    t2.setBounds(50,160,150,20);
    t2.setBackground(Color.green);
    t3.setBounds(50,220,150,20);
    t3.setBackground(Color.blue);
    
    f1.setBackground(new Color(0,0,0));
    f1.setVisible(true);
    f1.setSize(300,300); 
    f1.setLayout(null);
    }
        
    public void adjustmentValueChanged(AdjustmentEvent ae) {
                
      f1.setBackground(new Color(s1.getValue(),s2.getValue(), s3.getValue()));
                      
        t1.setText("deslizador 1 = " +s1.getValue());
        t2.setText("deslizador 2 = " +s2.getValue());
        t3.setText("deslizador 3 = " +s3.getValue());
    }
    

    
    public static void main(String[] args) {
        
      new AppletDeslizadores(); 
          
    }
    
}
