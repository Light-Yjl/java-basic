package ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame{
    public RegisterJFrame(){
        initJFrame();
        this.setVisible(true);
    }
    /**初始化界面*/
    public void initJFrame() {
        this.setSize(488,500);
        this.setTitle("拼图注册界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
    }
}
