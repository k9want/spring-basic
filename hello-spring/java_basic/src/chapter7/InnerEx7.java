package chapter7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent 발생함");
            }
        });
    }
}


