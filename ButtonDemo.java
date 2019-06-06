import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends Frame implements ActionListener
{
 Button b1,b2,b3;
 ButtonDemo()
 {
 setLayout(new FlowLayout());
 b1=new Button("Red");
 b2=new Button("Blue");
 b3=new Button("Green");
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 add(b1);
 add(b2);
 add(b3);
 }
public void actionPerformed(ActionEvent ae)
{
 String s = ae.getActionCommand();
 if(s.equals("Red"))
    setBackground(Color.RED);
 if(s.equals("Green"))
    setBackground(Color.GREEN);
 if(s.equals("Blue"))
    setBackground(Color.BLUE);
}
public static void main(String a[])
{
 ButtonDemo bd = new ButtonDemo();
 bd.setVisible(true);
 bd.setSize(500,600);
 bd.setTitle("color window");
 }
}