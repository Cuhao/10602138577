import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  s0014 extends JFrame{
    JButton jButton01=new JButton("←");
    JButton jButton02=new JButton("→");
    JTextField jTextField =new JTextField();
    JLabel jLabel01=new JLabel(">  <");
    Container cp;
    private int y;
    private int x=100;
    public  s0014(){init();}

    private void init() {
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setBounds(10,10,600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.add(jButton01);
        cp.add(jButton02);
        cp.add(jLabel01);
        cp.add(jTextField);
        jButton01.setBounds(10,10,50,50);
        jButton02.setBounds(120,10,50,50);
        jLabel01.setBounds(x,240,80,80);
        jTextField.setBounds(360,10,50,50);

        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=Integer.valueOf(jTextField.getText());
                jLabel01.setLocation(x,240);
                if (x%50==0){
                    jLabel01.setText(">  <");
                }
                if (x%20==0){
                    jLabel01.setText("> _ <");
                }
                if (x%30==0){
                    jLabel01.setText("> * <");
                }
                if (x%40==0){
                    jLabel01.setText(">||||<");
                }
            }
        });
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 x+=Integer.valueOf(jTextField.getText());
                jLabel01.setLocation(x,240);
                if (x%50==0){
                    jLabel01.setText(">  <");
                }
                if (x%20==0){
                    jLabel01.setText("> _ <");
                }
                if (x%30==0){
                    jLabel01.setText("> * <");
                }
                if (x%40==0){
                    jLabel01.setText(">||||<");
                }
              /*  switch (x){
                    case (x/2)==0:
                        jLabel01.setText(">  <");
                        break;
                    case 4:
                        jLabel01.setText("> _ <");
                        break;
                    case 6:
                        jLabel01.setText("> * <");
                    case 8:
                        jLabel01.setText(">||||<");
                }*/
            }
        });


    }
}