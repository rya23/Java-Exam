import java.awt.*;
import java.awt.event.*;

public class Fourteen {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);

        f.setSize(400, 300);
        Label l1 = new Label("Name");
        l1.setBounds(20, 30, 60, 20);
        TextField t1 = new TextField(20);
        t1.setBounds(80, 30, 100, 20);

        Label l2 = new Label("Address");
        l2.setBounds(20, 60, 60, 20);

        TextField t2 = new TextField(10);
        t2.setBounds(80, 60, 100, 20);

        Label l3 = new Label("Birthday");
        l3.setBounds(20, 90, 60, 20);

        TextField t3 = new TextField(10);
        t3.setBounds(80, 90, 100, 20);

        Label l4 = new Label("Gender");
        l4.setBounds(20, 120, 60, 20);

        Choice t4 = new Choice();
        t4.setBounds(80, 120, 100, 20);

        t4.add("Male");

        t4.add("Female");

        Label l5 = new Label("Job");
        l5.setBounds(20, 150, 60, 20);

        CheckboxGroup c1 = new CheckboxGroup();

        Checkbox c2 = new Checkbox("Student", c1, false);
        c2.setBounds(80, 150, 60, 20);

        Checkbox c3 = new Checkbox("Teacher", c1, false);
        c3.setBounds(160, 150, 60, 20);

        Button reg = new Button("Register");
        reg.setBounds(20, 180, 80, 20);

        Button exit = new Button("Exit");
        exit.setBounds(110, 180, 80, 20);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        // f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(reg);
        f.add(exit);

        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = t1.getText();
                String Address = t2.getText();
                String Bd = t3.getText();
                String Gender = t4.getSelectedItem();
                String Job = c1.getSelectedCheckbox() != null ? "Student" : "Teacher";
                System.out.println(Job);
                String Message = ("Name : " + Name +
                        "\nAddress : " + Address + "\nBirthday : " + Bd +
                        "\nGender : " + Gender + "\nJob : " + Job);
                System.out.println(Message);

            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
