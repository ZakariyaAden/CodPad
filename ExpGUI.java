import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class ExpGUI implements ActionListener{
    private int numOfClicks = 0;
    private JPanel panel;
    private JFrame frame;
    private JLabel label;
    public void GUI(){
        panel = new JPanel();
        frame = new JFrame();
        JButton button = new JButton("Click ME");
        button.addEventListener(this);
        label = new JLabel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }
    public void actionPerformed(ActionEvent e){
        numOfClicks++;
        label.setText("Number of clicks: " + numOfClicks);
    }
}
>>>>>>> 6a2b5800fd692ff860cc9581c5fd43701351d5fc