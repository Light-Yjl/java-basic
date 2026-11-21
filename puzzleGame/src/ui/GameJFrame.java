package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class GameJFrame extends JFrame{
    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        JMenuBar jMenuBar = createJMenuBar();
        //界面设置菜单
        this.setJMenuBar(jMenuBar);
        //初始化数据
        int[][] arr = initData();
        //初始化图片
        initImage(arr);
        //显示界面:写在最后
        this.setVisible(true);
    }
    /** 初始化数据*/
    private int[][] initData() {
        // 0 表示空白块，和其他图片一起打乱
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        int[][] data = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }
        return data;

    }

    /**初始化图片*/
    private void initImage(int[][] arr) {
        for (int i = 0; i < 16; i++) {
            int index = arr[i / 4][i % 4];
            // 空白块占据数组中的位置，但不添加图片
            if (index == 0) {
                continue;
            }
            ImageIcon icon = new ImageIcon("D:\\idea\\project\\JavaStudy\\puzzleGame\\image\\egg\\egg1\\"+ index +".png");
            JLabel jLabel = new JLabel(icon);
            //指定图片位置
            jLabel.setBounds((i % 4) * 105,(i / 4) * 105,105,105);
            this.getContentPane().add(jLabel);
        }
        JLabel bg = new JLabel(new ImageIcon("D:\\idea\\project\\JavaStudy\\puzzleGame\\image\\background.png"));
        bg.setBounds(0,0,580,620);
        this.getContentPane().add(bg);
    }

    /**初始化界面*/
    public void initJFrame() {
        //设置宽高
        this.setSize(593,678);
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
