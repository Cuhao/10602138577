import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temputur extends JFrame {
    private JLabel jLabel01 = new JLabel("華氏度為:");
    private JLabel jLabel02 = new JLabel("攝氏度為:");
    private JButton jButton01 = new JButton("=");
    private JButton jButton02 = new JButton("EXIT");
    JTextField jTextField = new JTextField();
    Container cp;

    public temputur() {
        init();
    }

    private void init() {
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.add(jButton01);
        cp.add(jButton02);
        cp.add(jLabel01);
        cp.add(jLabel02);
        cp.add(jTextField);
        this.setBounds(10,10,600,600);
        jButton01.setSize(100,40);
        jButton02.setSize(100,40);
        jLabel01.setSize(100,40);
        jLabel02.setSize(100,40);
        jTextField.setSize(100,40);

        jLabel01.setLocation(40,10);
        jTextField.setLocation(120,10);
        jButton01.setLocation(240,10);
        jLabel02.setLocation(360,10);
        jButton02.setLocation(80,120);
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel02.setText("攝氏度為:"+String.valueOf(((Integer.valueOf(jTextField.getText()))-32)*5/9));
            }
        });
       jButton02.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(EXIT_ON_CLOSE);
           }
       });

    }
}
