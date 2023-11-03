import java.awt.*;
import java.awt.event.*;
public class Fifteen {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new GridLayout(0, 2));

        Label l1 = new Label("Name");
        TextField t1 = new TextField();

        Label l2 = new Label("Mail ID");
        TextField t2 = new TextField();

        Label l6 = new Label("Gender");
        CheckboxGroup c1 = new CheckboxGroup();
        Checkbox c2 = new Checkbox("Male", c1, false);
        Checkbox c3 = new Checkbox("Female", c1, false);

        Label l3 = new Label("Mobile Number");
        TextField t3 = new TextField();

        Label l4 = new Label("Password");
        TextField t4 = new TextField();
        t4.setEchoChar('*');
        Label l5 = new Label("Re Password");
        TextField t5 = new TextField();
        t4.setEchoChar('*');

        Label l7 = new Label("Cources");
        Choice c4 = new Choice();
        c4.add("BE");
        c4.add("ME");

        Label l8 = new Label("Branch");
        Choice c5 = new Choice();
        c5.add("AiDs");
        c5.add("Comps");

        Label l9 = new Label("Branch");
        Choice c6 = new Choice();
        c6.add("1");
        c6.add("2");

        Button exit = new Button("Exit");

        Button re = new Button("Register");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l6);
        f.add(c2);
        f.add(new Label());
        f.add(c3);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(l7);
        f.add(c4);
        f.add(l8);
        f.add(c5);
        f.add(l9);
        f.add(c6);

        f.add(exit);
        f.add(re);

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        re.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = t1.getText(); 
                String Gender = c1.getSelectedCheckbox() != null ? "Male" : "Female";
                String Message = ("name" + Name + "Gender " + Gender);
                Display(Message);
            }
        });

    }

    public static void Display(String Message) {
        Frame result = new Frame();
        TextArea text = new TextArea(Message);
        text.setBounds(20, 30, 400, 300);

        result.add(text);
        result.setSize(500, 400);
        result.setLayout(null);
        result.setVisible(true);

    }

}
