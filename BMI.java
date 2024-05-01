import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BMI extends JFrame{
    private static JTextField weightfield, heightfield, resultfield;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI calculator");
        Dimension framesize = new Dimension(1080, 720);
        //panel1
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel textLabel = new JLabel("BMI calculator");
        JButton button = new JButton("start");
        JLabel text2 = new JLabel("this app calculates body mass index");
        textLabel.setBounds(400, 30, 100, 50);
        text2.setBounds(400, 80, 250, 50);
        button.setBounds(500, 30, 100, 50);
        panel1.add(button);
        panel1.add(textLabel);
        panel1.add(text2);
        //panel2
        JLabel text3 = new JLabel("enter height(cm)");
        JLabel text4 = new JLabel("enter weight(kg)");
        JTextField heightfield = new JTextField(16);
        JTextField weightfield = new JTextField(16);
        JButton calculate = new JButton("calculate");
        JButton back = new JButton("back");
        panel2.add(calculate);
        panel2.add(back);
        panel2.add(heightfield);
        panel2.add(weightfield);
        panel2.add(text3);
        panel2.add(text4);
        heightfield.setBounds(500, 30, 100, 30);
        weightfield.setBounds(500, 70, 100, 30);
        text3.setBounds(400, 30, 100, 30);
        text4.setBounds(400, 70, 100, 30);
        back.setBounds(500, 100, 100, 30);
        calculate.setBounds(400, 100, 100, 30);

        //panel3
        JLabel t5 = new JLabel("your BMI is:");
        JTextField resultfield = new JTextField(10);
        JButton back2 = new JButton("go back to the first page");
        resultfield.setEditable(false);
        panel3.add(t5);
        panel3.add(back2);
        panel3.add(resultfield);
        t5.setBounds(400, 30, 100, 30);
        resultfield.setBounds(600, 30, 100, 30);
        back2.setBounds(450,70,200,30);


        frame.setSize(framesize);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        frame.add(panel1);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                frame.add(panel2);
                frame.setVisible(true);
            }
        });
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                frame.add(panel1);
                frame.setVisible(true);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                frame.add(panel1);
                frame.setVisible(true);
            }
        });
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                frame.add(panel3);
                frame.setVisible(true);
                    try {
                        double weight = Double.parseDouble(weightfield.getText());
                        double height = Double.parseDouble(heightfield.getText());
                        double bmi = weight / ((height * height) / 10000);
                        resultfield.setText(String.format("%.2f" , bmi));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values for weight and height.");
                    }
                }
            });


        frame.setVisible(true);
    }

    }

    //برا تعیین bmi از سایت geeksforgeeks و oracle کمک گرفتم