package ui.Test;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    //创建两个按钮对象
    JButton jbt1 = new JButton("点我啊");
    JButton jbt2 = new JButton("再点我啊");

    public MyJFrame(){
        initJFrame();
        //初始化菜单
        JMenuBar jMenuBar = createJMenuBar();
        //界面设置菜单
        this.setJMenuBar(jMenuBar);
        //给按钮设置宽高
        jbt1.setBounds(0,0,100,100);
        jbt2.setBounds(100,0,120,100);
        //给按钮添加事件
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        //把按钮添加到界面
        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);

        //显示界面:写在最后
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == jbt1){
            jbt1.setSize(200,200);
        } else if (source == jbt2) {
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
    /**初始化界面*/
    public void initJFrame() {
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
    }

    /**初始化菜单*/
    public JMenuBar createJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项
        JMenu function = new JMenu("功能");
        JMenu about = new JMenu("关于我们");

        //创建条目
        JMenuItem replay = new JMenuItem("重新游戏");
        JMenuItem reLogin = new JMenuItem("重新登录");
        JMenuItem closeGame = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("联系方式");

        //将条目添加到选项中
        function.add(replay);
        function.add(reLogin);
        function.add(closeGame);
        about.add(accountItem);

        //将功能添加到菜单中
        jMenuBar.add(function);
        jMenuBar.add(about);
        return jMenuBar;
    }


}
