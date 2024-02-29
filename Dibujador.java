/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figschachipistachis;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ruben
 */
public class Dibujador{
    JPanel panel;
    Graphics g;
    Dibujador(JPanel panel){
        this.panel = panel;
       g = panel.getGraphics();
    }
    public void drawCirculo(){
            g.drawOval(100, 100, 50, 50);
    }
    public void drawCuadrado(){
            g.drawRect(200, 100, 50, 50);
    }
    public void drawCilindro(){
            g.drawOval(300, 100, 50, 20);
            g.drawRect(300, 100, 50, 100);
            g.drawOval(300, 180, 50, 20);
    }
    public void fillSolid(){
        //Color chooser
    }
    public void fillDegradao(){
        
    }
    
}
