package ui;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;
    int count = 0;
    int[][] data = new int[4][4];
    String pass = "puzzleGame/image/frog/frog1/";
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //创建条目
    JMenuItem egg = new JMenuItem("奶蛋");
    JMenuItem frog = new JMenuItem("奶娃");
    JMenuItem zodiacSign = new JMenuItem("星座");

    JMenu image = new JMenu("更换图片");
    JMenuItem replay = new JMenuItem("重新游戏");
    JMenuItem reLogin = new JMenuItem("重新登录");
    JMenuItem closeGame = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("联系方式");
    JMenuItem explanation = new JMenuItem("操作指南");


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

        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
        }

        return data;

    }

    /**初始化图片*/
    private void initImage(int[][] arr) {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        //胜利显示图片
        if(victory()){
            JLabel win = new JLabel(new ImageIcon("puzzleGame/image/game/win.png"));
            win.setBounds(105,230,380,200);
            this.getContentPane().add(win);
        }

        JLabel step = new JLabel("步数：" + count);
        step.setBounds(20,10,100,30);
        this.getContentPane().add(step);

        for (int i = 0; i < 16; i++) {
            int index = arr[i / 4][i % 4];
            // 空白块占据数组中的位置，但不添加图片
            if (index == 0) {
                continue;
            }
            ImageIcon icon = new ImageIcon(pass+ index +".png");
            JLabel jLabel = new JLabel(icon);
            //指定图片位置
            jLabel.setBounds((i % 4) * 105 + 84,(i / 4) * 105 + 134,105,105);
            //给图片加边框
            //0：凸起来
            //1：凹下去
            jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
            this.getContentPane().add(jLabel);
        }
        //添加背景图片
        JLabel bg = new JLabel(new ImageIcon("puzzleGame/image/game/background.png"));
        bg.setBounds(0,0,580,620);
        this.getContentPane().add(bg);
        //刷新界面
        this.getContentPane().repaint();
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
        //添加键盘监听事件
        this.addKeyListener(this);
    }

    /**初始化菜单*/
    public JMenuBar createJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项
        JMenu function = new JMenu("功能");
        JMenu about = new JMenu("说明");

        //将条目添加到选项中
        image.add(egg);
        image.add(frog);
        image.add(zodiacSign);

        function.add(image);
        function.add(replay);
        function.add(reLogin);
        function.add(closeGame);
        about.add(accountItem);
        about.add(explanation);

        //给条目绑定事件
        egg.addActionListener(this);
        frog.addActionListener(this);
        zodiacSign.addActionListener(this);
        replay.addActionListener(this);
        reLogin.addActionListener(this);
        closeGame.addActionListener(this);
        accountItem.addActionListener(this);
        explanation.addActionListener(this);

        //将功能添加到菜单中
        jMenuBar.add(function);
        jMenuBar.add(about);
        return jMenuBar;
    }

    /**重写Key方法*/
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_A){
            this.getContentPane().removeAll();
            //加载第一张完整图片
            JLabel all = new JLabel(new ImageIcon(pass + "origin.png"));
            all.setBounds(84,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel bg = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
            bg.setBounds(0,0,580,620);
            this.getContentPane().add(bg);
            //刷新界面
            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
    //对上下左右进行判断
        //左：37 上：38 右：39 下：40
        int code = e.getKeyCode();
        if(code == 37){
            if(y == data.length - 1){
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            count++;
            initImage(data);

        } else if (code == KeyEvent.VK_UP) {
            if(x == data.length - 1){
                return;
            }
            // 把空白块下方的图片向上移动，空白块向下移动
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            count++;
            // 根据移动后的数组重新显示图片
            initImage(data);
        } else if (code == 39) {
            if( y == 0){
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            count++;

            initImage(data);
        } else if (code == KeyEvent.VK_DOWN) {
            if(x == 0){
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            count++;

            initImage(data);
        } else if (code == KeyEvent.VK_A) {
            initImage(data);
        }else if(code == KeyEvent.VK_W){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage(data);
        }
    }

    public boolean victory (){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]){
                    //只要有一个数据不一样，返回false
                    return false;
                }
            }
        }
        return true;
    }

    /**重写ActionListener方法*/
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        Random r = new Random();
        if(obj == egg){
            int index = r.nextInt(15) + 1;
            pass = "puzzleGame/image/egg/egg" + index + "/";
            initData();
            count = 0;
            initImage(data);
        } else if (obj == frog) {
            int index = r.nextInt(20) + 1;
            pass = "puzzleGame/image/frog/frog" + index + "/";
            initData();
            count = 0;
            initImage(data);
        } else if (obj == zodiacSign) {
            int index = r.nextInt(12) + 1;
            pass = "puzzleGame/image/ZodiacSign/ZodiacSign" + index + "/";
            initData();
            count = 0;
            initImage(data);
        } else if(obj == replay){
            initData();
            count = 0;
            initImage(data);
        } else if (obj == reLogin) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeGame) {
            System.exit(0);
        } else if (obj == accountItem) {
            //弹框对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzleGame/image/game/about.png"));
            //设置图片的位置和宽高
            jLabel.setBounds(0,0,300,300);
            //弹框添加照片
            jDialog.getContentPane().add(jLabel);
            //弹框大小
            jDialog.setSize(344,344);
            //置顶
            jDialog.setAlwaysOnTop(true);
            //居中
            jDialog.setLocationRelativeTo(null);
            //弹框未关闭无法操作
            jDialog.setModal(true);
            //弹框可见
            jDialog.setVisible(true);
        } else if (obj == explanation) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzleGame/image/game/explain.png"));
            jLabel.setBounds(0,0,300,300);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
        }
    }
}
