package estudo_1.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaActionListener {
    public static void main(String[] args) {

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá mundo");
            }
        });

        JButton jButton1 = new JButton();
        jButton1.addActionListener(b -> System.out.println("Olá mundo"));

        // Nesse caso como actionPerformed recebe um parametro devemos passar a chamada lambda. (b -> System.out.println("Olá mundo"))

        // SAM - Single abstract method
        // Qualquer interface que tenha alguma função abstrata

    }
}
