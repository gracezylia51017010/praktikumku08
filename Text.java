/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;
import java.awt.*;
/**
 *
 * @author User
 */
public class Text extends Panel{
    Font f;
    String text = "Halo Kharisma";
    Text(){
       setBackground(Color.GRAY); //KONSTANTA DALAM CLASSS COLOR
    }
    public void paint(Graphics g){
        f = new Font ("Helvetica", Font.BOLD,48);
        //kotak hijau
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 335, 105);
        //warna hitam pinggiran
        g.setColor(Color.BLACK);
        g.drawRect(8, 8, 335, 105);
        g.setColor(Color.pink);
        g.fillOval(10, 10, 330, 100);
        //diberi pinggiran warna merah tebal (3x)
        g.setColor(Color.red);
        g.drawOval(10, 10, 330, 100);
        g.drawOval(9, 9, 332, 102);
        g.drawOval(8, 8, 334, 104);
        //tulisan warna hitam dengan font helvetica
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Text gp = new Text();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
   
}
