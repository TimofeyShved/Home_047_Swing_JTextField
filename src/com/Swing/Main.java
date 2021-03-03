package com.Swing;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JFrame jFrame = getFrame(); // наша форма
    static JPanel jPanel = new JPanel(); // наша панель

    public static void main(String[] args) {
	    jFrame.add(jPanel); // добавляем панель на форму
	    jPanel.add(new JLabel("new Лейбл")); // добавляем лейбл на панель
	    jPanel.add(new JTextField("new текстовое поле",20)); // а так же текстовое поле

        //----------------------------------------------- JTextField ------------------------
        // создаем текстовое поле
        JTextField jTextField = new JTextField("созданное поле текста");
        System.out.println(jTextField.getText());

        //----------------------------------------------- JPasswordField ------------------------
	    jPanel.add(new JPasswordField(40));// добавляем зашифрованное текстовое поле

        //----------------------------------------------- JTextArea ------------------------
        // добавляем большое текстовое поле, для ввода нескольких строк
        JTextArea jTextArea = new JTextArea(15, 40);
	    jTextArea.setLineWrap(true); // переносить строчку?
	    // jPanel.add(jTextArea); // можно добавить через add
        JScrollPane jScrollPane = new JScrollPane(jTextArea); // прокрутка
	    //jScrollPane.add(jTextArea); // можно добавить через add
	    jPanel.add(jScrollPane); // добавляем на панель
	    jPanel.revalidate();
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(); // создается форма
        jFrame.setVisible(true); // влючаем видимость
        jFrame.setBounds(750,250,500,500); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход
        return jFrame;
    }
}
