package ui.Test;

import ui.GameJFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseJFrame extends JFrame implements MouseListener {

    JButton jdb1 = new JButton();
    public MouseJFrame(){
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

        jdb1.setBounds(0,0,100,100);
        //给按钮绑定鼠标事件
        jdb1.addMouseListener(this);

        this.getContentPane().add(jdb1);

        //显示界面:写在最后
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标滑入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标滑出");
    }
}
