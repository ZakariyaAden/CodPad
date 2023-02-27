import java.awt.*;
import javax.swing.*;

public class ColorblindnessTest extends JFrame{
    ColorblindnessTest(){
        ImageIcon img = new ImageIcon("thumbsUp.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle("Colorblindness Test");
        this.setVisible(true);
        this.setResizable(false);
        this.setIconImage(img.getImage());        
        this.setLayout(null);

        JPanel redPanel = new JPanel();
        JLabel labelForRedPanel = new JLabel("This is Red");
        labelForRedPanel.setIcon(img);
        labelForRedPanel.setHorizontalTextPosition(JLabel.CENTER);
        redPanel.add(labelForRedPanel);
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,400,400);

        JPanel bluePanel = new JPanel();
        JLabel labelForBluePanel = new JLabel("This is Blue");
        labelForBluePanel.setIcon(img);
        labelForBluePanel.setHorizontalTextPosition(JLabel.CENTER);
        bluePanel.add(labelForBluePanel);
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(400,0,400,400);

        JPanel greenPanel = new JPanel();
        JLabel labelForGreenPanel = new JLabel("This is Green");
        labelForGreenPanel.setIcon(img);
        labelForGreenPanel.setHorizontalTextPosition(JLabel.CENTER);
        greenPanel.add(labelForGreenPanel);
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,400,400,400);

        JPanel grayPanel = new JPanel();
        JLabel labelForGrayPanel = new JLabel("This is Gray");
        labelForGrayPanel.setIcon(img);
        labelForGrayPanel.setHorizontalTextPosition(JLabel.CENTER);
        grayPanel.add(labelForGrayPanel);
        grayPanel.setBackground(Color.gray);
        grayPanel.setBounds(400,400,400,400);

        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        this.add(grayPanel);
    }
    public static void main(String[] args){
        new ColorblindnessTest();
    }
}