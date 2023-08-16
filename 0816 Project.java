import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.Flow;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

class GroupButtonListener implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
        String name = e.getItem().toString();
    }

}

public class Main extends JFrame {
    Main(){
        Container container = getContentPane();
        setVisible(true);
        container.setLayout(new FlowLayout());

        JRadioButton jrbtn1 = new JRadioButton("짜장면");
        JRadioButton jrbtn2 = new JRadioButton("탕수육");
        ButtonGroup btnGroup = new ButtonGroup();

        btnGroup.add(jrbtn1);
        btnGroup.add(jrbtn2);

        container.add(jrbtn1);
        container.add(jrbtn2);
    }
    
    // Main(){
    //     Container container = getContentPane();
    //     setVisible(true);
    //     container.setLayout(new FlowLayout());

    //     JLabel image = new JLabel(new ImageIcon("C://image.jpg"),SwingConstants.CENTER);
    //     container.add(image);
    // }

    // Main() {
    //     setVisible(true);
    //     Container container = getContentPane();
    //     Dimension dim = new Dimension(500, 500);
    //     setSize(dim);
    //     setLocation(200, 400);
    //     container.setBackground(Color.BLUE);
    //     container.setLayout(new GridLayout(6, 5));

    //     JButton jbtnOK = new JButton("OK");
    //     JButton jbtnCancel = new JButton("Cancel");
    //     JButton jbtnGet = new JButton("Get");

    //     JCheckBox[] jcbs = new JCheckBox[15];

    //     for (int i = 0; i < jcbs.length; i++) {
    //         jcbs[i] = new JCheckBox("체크" + (i + 1));
    //     }

    //     container.add(jbtnOK);
    //     container.add(jbtnCancel);
    //     container.add(jbtnGet);
        
    //     for(int i = 0; i < jcbs.length;i++){
    //         container.add(jcbs[i]);
    //     }
        

    //     jbtnOK.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             container.setBackground(Color.ORANGE);
    //         }
    //     });

    //     jbtnCancel.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             jbtnOK.setEnabled(false);
    //             jbtnCancel.setEnabled(false);
    //             jbtnGet.setEnabled(false);
    //         }
    //     });

    //     jbtnGet.addMouseMotionListener(new MouseMotionListener() {
    //         @Override
    //         public void mouseDragged(MouseEvent e) {
    //             System.out.println(e.getX() + " " + e.getY());
    //         }

    //         @Override
    //         public void mouseMoved(MouseEvent e) {

    //         }
    //     });
    //}

    public static void main(String[] args) throws Exception {
        new Main();
    }
}