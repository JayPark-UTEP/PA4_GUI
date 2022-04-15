import javax.swing.*;

public class BankGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("AOOPBank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JButton option1 = new JButton("1. Customer");
        JButton option2 = new JButton("2. Manager");
        JButton option3 = new JButton("3. EXIT");

        frame.setLayout(null);
        option1.setBounds(150,50,150,40);
        option2.setBounds(150,100,150,40);
        option3.setBounds(150,150,150,40);

        frame.getContentPane().add(option1);
        frame.getContentPane().add(option2);
        frame.getContentPane().add(option3);

        frame.setVisible(true);
    }
}
