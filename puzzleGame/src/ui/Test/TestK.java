package ui.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestK {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(488,500);
        jFrame.setTitle("拼图注册界面");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jButton = new JButton("请点击");
        jButton.setBounds(0,0,100,100);
        //动作监听：鼠标左键、空格
        //匿名内部类
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我啊");
            }
        });
        //把按钮添加到界面当中
        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);
    }
}
