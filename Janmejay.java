import java.awt.*;
import java.awt.event.*;

class Janmejay extends Frame implements ActionListener {

Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
TextField t2, t3, t4, t5, t6, t7, t9, t10;
Choice c8;
Button b;

Janmejay() {


addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent w) {
System.exit(0);}
});

setSize(1500,800);
setLayout(null);
setTitle("Assignment1 (Form_Creation)");
l1=new Label("AKGEC");
l1.setBounds(550,45,400,45);
add(l1);

l2=new Label("Name : ");
l2.setBounds(500,100,50,25);
add(l2);
t2=new TextField();
t2.setBounds(600,100,200,25);
add(t2);

l3=new Label("Roll No. : ");
l3.setBounds(500,135,50,25);
add(l3);
t3=new TextField();
t3.setBounds(600,135,200,25);
add(t3);

l4=new Label("Course : ");
l4.setBounds(500,170,50,25);
add(l4);
t4=new TextField();
t4.setBounds(600,170,200,25);
add(t4);

l5=new Label("Branch : ");
l5.setBounds(500,205,50,25);
add(l5);
t5=new TextField();
t5.setBounds(600,205,200,25);
add(t5);

l6=new Label("Contact : ");
l6.setBounds(500,240,50,25);
add(l6);
t6=new TextField();
t6.setBounds(600,240,200,25);
add(t6);

l7=new Label("E-mail : ");
l7.setBounds(500,275,50,25);
add(l7);
t7=new TextField();
t7.setBounds(600,275,200,25);
add(t7);

l8=new Label("City : ");
l8.setBounds(500,310,50,25);
add(l8);
c8=new Choice();
c8.setBounds(600,310,200,25);
add(c8);
c8.add("--Not Selected--");
c8.add("Agra");c8.add("Ahmedabad");
c8.add("Amritsar");c8.add("Banglore");
c8.add("Bareilly");c8.add("Bhuvaneshwar");
c8.add("Chandigarh");c8.add("Chennai");
c8.add("Cochin");c8.add("Dehradun");
c8.add("Ghaziabad");c8.add("Gorakhpur");
c8.add("Gwalior");c8.add("Hyderabad");
c8.add("Indore");c8.add("Jaipur");
c8.add("Kolkata");c8.add("Lucknow");
c8.add("Mangalore");c8.add("Mathura");
c8.add("Meerut");c8.add("Mumbai");
c8.add("New Delhi");c8.add("Patna");
c8.add("Pune");c8.add("Raibareli");
c8.add("Surat");

l9=new Label("Username : ");
l9.setBounds(500,345,65,25);
add(l9);
t9=new TextField();
t9.setBounds(600,345,200,25);
add(t9);

l10=new Label("Password : ");
l10.setBounds(500,380,60,25);
add(l10);
t10=new TextField();
t10.setBounds(600,380,200,25);
t10.setEchoChar('*');
add(t10);

b=new Button("Submit");
b.setBounds(630,425,100,50);
add(b);

setVisible(true);
b.addActionListener(this);
}


public void actionPerformed(ActionEvent e) {

NJS f=new NJS();
f.actionPerformed(e);

}


public static void main(String args[]) {
new Janmejay();
}
}

class NJS extends Frame implements ActionListener {
TextField t;
NJS() {

addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent w) {
System.exit(0);}
});

setSize(800,500);
setTitle("Window 2");
setLayout(new FlowLayout());
t=new TextField();
add(t);
setVisible(true);

}

public void actionPerformed(ActionEvent e) {

NJS f=new NJS();
f.t.setText("Successfully submitted");

}
}