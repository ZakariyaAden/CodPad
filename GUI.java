import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class GUI extends JFrame{
    GUI(){
        ImageIcon logo = new ImageIcon("flex.png");
        Border border = BorderFactory.createLineBorder(Color.black,5);
        JLabel label = new JLabel("I am the best coder in the group!!!");
        Random randColor = new Random();
        label.setForeground(new Color(0,0,0));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIcon(logo);
        label.setIconTextGap(15);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);        
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(border);
        this.setTitle("GUI");
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(logo.getImage());
        this.add(label);
        int r1 = randColor.nextInt(255);
        int r2 = randColor.nextInt(255);
        int r3 = randColor.nextInt(255);
        this.getContentPane().setBackground(new Color(r1,r2,r3));
        this.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }
}