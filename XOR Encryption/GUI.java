
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class GUI extends JPanel{

 public GUI(){
             JFrame frame = new JFrame("TOP SECRET");
             JTextField field = new JTextField();
             JTextField field1 = new JTextField();
             JTextField field2 = new JTextField();
             JTextField field3 = new JTextField();
             field1.setPreferredSize(new Dimension(150,30));
             field2.setPreferredSize(new Dimension(150,30));
             field3.setPreferredSize(new Dimension(150,30));
             field.setPreferredSize(new Dimension(150,30));
             JLabel label = new JLabel("Enter Message (alphabetical!)");
             JLabel label1 = new JLabel("Enter Key");
             
             JLabel label2 = new JLabel("Enter Encrypted Message");
             JLabel label3 = new JLabel("Enter Key (CAPS!)");
             
             frame.setVisible(true);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
             frame.setSize(193, 330);
             
             JPanel panel = new JPanel();
             panel.setLayout(new FlowLayout());
             panel.setSize(300,300);
             frame.add(panel);
             
             JButton button = new JButton("ENCRYPT");
             JButton button1 = new JButton("DECRYPT");
            
             JTextArea area = new JTextArea();
             area.setSize(100,30);
             
             panel.add(label);
             panel.add(field);
             panel.add(label1);
             panel.add(field1);
             panel.add(button);
             panel.add(area);
             
             panel.add(label2);
             panel.add(field2);
             panel.add(label3);
             panel.add(field3);
             panel.add(button1);
        
             button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button){
                    String key = field1.getText();
                    String message = field.getText();
                    String d = crypt.Encrypt(key, message);
                    
                    JTextArea textarea= new JTextArea("Encrypted Message: "+d);
                    textarea.setEditable(true);
                    JOptionPane.showMessageDialog(null, textarea, "TOP SECRET", JOptionPane.DEFAULT_OPTION);
                    
                    }
                 
                }
                
             
             
             });
             
             button1.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     if(e.getSource()==button1){
                     String key = field3.getText();
                     String message = field2.getText();
                     String d = crypt.Decrypt(key, message);
                    
                     JTextArea textarea= new JTextArea("Decrypted Message: "+d);
                     textarea.setEditable(true);
                     JOptionPane.showMessageDialog(null, textarea, "TOP SECRET", JOptionPane.DEFAULT_OPTION);
                     }
                  
                 }
                 
              
              
              });
             
             
             
             
 }
}               
                 
             
             
 

