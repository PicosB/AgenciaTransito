/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class Fondo extends javax.swing.JPanel{
    public Fondo(){
        this.setSize(755,130);
    }
    
    public void paint(Graphics grafico){
        Dimension height=getSize();
        ImageIcon Img=new ImageIcon(getClass().getResource("/imgs/Fondo.png"));
        grafico.drawImage(Img.getImage(), 0, 0, height.width,height.height,null);
        
        setOpaque(false);
        super.paintComponent(grafico);
    }
}
