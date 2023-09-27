import java.awt.event.*;
// import java.awt.*;
import javax.swing.*;

public class exam_suggestion extends JFrame implements ActionListener {
    JLabel L1, L2;
    JTextField T1, T2;
    ButtonGroup Bg;
    JRadioButton R1, R2, R3;

    exam_suggestion() {
        setSize(500, 500);
        setTitle("Test2");
        setLocation(100, 100);
        setLayout(null);

        L1 = new JLabel("Name :");
        L1.setBounds(10, 10, 100, 30);
        add(L1);
        T1 = new JTextField();
        T1.setBounds(120, 10, 200, 30);
        add(T1);
        L2 = new JLabel("Intrest ");
        L2.setBounds(10, 50, 80, 30);
        add(L2);
        Bg = new ButtonGroup();
        R1 = new JRadioButton("Engg");
        R1.setBounds(100, 50, 80, 30);
        R2 = new JRadioButton("Medical");
        R2.setBounds(200, 50, 80, 30);
        R3 = new JRadioButton("Compititive Exam ");
        R3.setBounds(300, 50, 140, 30);
        T2 = new JTextField();
        T2.setBounds(120, 100, 200, 30);

        add(T2);

        add(R1);
        R1.addActionListener(this);
        R2.addActionListener(this);
        R3.addActionListener(this);
        add(R2);
        add(R3);
        Bg.add(R1);
        Bg.add(R2);
        Bg.add(R3);

        show();
    }

    public void actionPerformed(ActionEvent AE) {
        if (AE.getSource() == R1) {
            T2.setText("1.MHT CET 2.WBJEE 3.JEE");
        } else if (AE.getSource() == R2) {
            T2.setText("1.NEET 2.NEET PG 3.FMGE");
        } else {
            T2.setText("1.UPSC 2.MPSC 3.NDA");
        }

    }

    public static void main(String args[]) {
        exam_suggestion T2 = new exam_suggestion();
    }
}