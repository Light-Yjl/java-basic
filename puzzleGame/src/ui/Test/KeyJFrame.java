package ui.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyJFrame extends JFrame implements KeyListener {
    public KeyJFrame(){
        //设置宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式3
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        setLayout(null);
        //添加键盘监听
        //调用者this:本类对象，表示要给整个界面添加监听
        //参数this：表示执行本类的代码
        this.addKeyListener(this);



        //显示界面:写在最后
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");

        int code = e.getKeyCode();
        System.out.println(code);
    }
}
