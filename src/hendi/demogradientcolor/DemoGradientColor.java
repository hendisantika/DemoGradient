/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hendi.demogradientcolor;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Uchiha Itachi
 */
public class DemoGradientColor {
    public DemoGradientColor(){
		
		JFrame frame = new JFrame("Belajar Gradient"); //membuat JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(600,400); //menentukan ukuran
		frame.setVisible(true); //membuat komponen frame visible
		frame.setLocationRelativeTo(null); //membuat frame berada ditengah-tengah
		frame.getContentPane().add(new MyComponent()); //memasukan komponen graphics kedalam frame
	}
	
		public class MyComponent extends JComponent{ //mengextends dari class JComponent 
			public void paint(Graphics g){ //paint merupakan turunan dari class JComponent
				Graphics2D g2d = (Graphics2D)g;
				GradientPaint gradient = new GradientPaint(0,0,Color.black,getWidth(),getHeight(),Color.blue,true); //x,y,warnaAwal,lebar,panjang,warnaAkhir,membuat komponen true
				g2d.setPaint(gradient);
				g2d.fillRect(0, 0, getWidth(), getHeight()); //memberi isi warna frame (x,y,width/height)
			}
			
		}
		
		public static void main(String[] args) {
		new DemoGradientColor();
	}
}
