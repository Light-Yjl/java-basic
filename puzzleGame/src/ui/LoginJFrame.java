package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;

public class LoginJFrame extends JFrame implements MouseListener, ActionListener {
    static ArrayList<User> list = new ArrayList<>();
    static {list.add(new User("zhangsan","123456"));
        list.add(new User("lisi","123456"));

    }


    JLabel login = new JLabel(new ImageIcon("puzzleGame/image/login/login.png"));
    JLabel register = new JLabel(new ImageIcon("puzzleGame/image/login/register.png"));
    JButton capt = new JButton(setCapt());

    JTextField userName = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JTextField captchaFiled = new JTextField();

    public LoginJFrame() {
        this(true);
    }

    protected LoginJFrame(boolean initialize) {
        if (initialize) {
            initJFrame();
            initInput();
            putCapt();
            mouseControl();
            initBackGround();
            this.setVisible(true);
        }
    }
    /**初始化界面*/
    public void initJFrame() {
        this.setSize(500,465);
        this.setTitle("拼图登录界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
    }

    /**初始化背景*/
    public void initBackGround(){
        //添加背景图片
        JLabel bg = new JLabel(new ImageIcon("puzzleGame/image/login/background.png"));
        bg.setBounds(0,0,488,430);

        JLabel user = new JLabel(new ImageIcon("puzzleGame/image/login/username.png"));
        user.setBounds(90,150,47,17);

        JLabel password = new JLabel(new ImageIcon("puzzleGame/image/login/password.png"));
        password.setBounds(90,210,47,17);

        JLabel captcha = new JLabel(new ImageIcon("puzzleGame/image/login/captcha.png"));
        captcha.setBounds(90,270,47,17);

        //添加图片
        this.getContentPane().add(user);
        this.getContentPane().add(password);
        this.getContentPane().add(captcha);
        this.getContentPane().add(bg);
    }

    /**添加输入框*/
    public void initInput(){
        Font inputFont = new Font("微软雅黑", Font.PLAIN, 18);
        userName.setFont(inputFont);
        passwordField.setFont(inputFont);
        captchaFiled.setFont(inputFont);

        //用户名输入框
        userName.setBounds(160,145,230,30);
        this.getContentPane().add(userName);

        //密码输入框
        passwordField.setBounds(160,205,230,30);
        this.getContentPane().add(passwordField);

        //验证码输入框
        captchaFiled.setBounds(160,265,115,30);
        this.getContentPane().add(captchaFiled);

    }
    /**鼠标事件*/
    public void mouseControl(){
        login.setBounds(100,350,128,47);
        register.setBounds(260,350,128,47);

        this.getContentPane().add(login);
        this.getContentPane().add(register);
        //绑定鼠标事件
        login.addMouseListener(this);
        register.addMouseListener(this);
    }

    /**重写MouseListener中的方法*/
    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (o == login) {
            if(existUser()){
                if(rightPassword()){
                    if(rightCapt()){
                        this.setVisible(false);
                        new GameJFrame();
                    }else{
                        capt.setText(setCapt());
                        errorCapt();
                    }
                }else{
                    errorPassword();
                }
            }else{
                errorUserName();
            }
        }
        if (o == register) {
            this.setVisible(false);
            new RegisterJFrame();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object o = e.getSource();
        if (o == login) {
            login.setIcon(new ImageIcon("puzzleGame/image/login/login_pressed.png"));
        }
        if (o == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/register_pressed.png"));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();
        if (o == login) {
            login.setIcon(new ImageIcon("puzzleGame/image/login/login.png"));
        }
        if (o == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/register.png"));
        }
    }

    /**生成验证码*/
    public String setCapt(){
        char[] number;
        number = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        char[] small = {'q','w','e','r','t','y','u','i','o','p',
                'a','s','d','f','g','h','j','k','l',
                'z','x','c','v','b','n','m'};
        char[] big = {'Q','W','E','R','T','Y','U','I','O','P',
                'A','S','D','F','G','H','J','K','L',
                'Z','X','C','V','B','N','M'};
        String res = "";
        char[] letter = new char[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int range = r.nextInt(3) ;
            if(range == 1){
                int index = r.nextInt(10);
                letter[i] = number[index];
            } else if (range == 2) {
                int index = r.nextInt(26) ;
                letter[i] = small[index];
            } else {
                int index = r.nextInt(26) ;
                letter[i] = big[index];
            }
        }
        for (int i = 0; i < letter.length; i++) {
            res += letter[i];
        }

        return res;

    }
    /**放置验证码*/
    public void putCapt(){
        capt.setBounds(290,265,100,30);
        capt.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        this.getContentPane().add(capt);
        capt.addActionListener(this);
    }
    /**判断是否存在用户*/
    public boolean existUser(){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            flag = user.getName().equals(userName.getText());
            if(flag){
                break;
            }
        }
        return flag;
    }
    /**判断是否存在用户且密码正确*/
    public boolean rightPassword(){
        boolean exist = false;
        boolean match = false;

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            exist = user.getName().equals(userName.getText());
            if(exist){
                match = user.getPassword().equals(
                        new String(passwordField.getPassword())
                );
                break;
            }
        }
        return match;
    }
    /**判断验证码是否正确*/
    public boolean rightCapt(){
        return capt.getText().equals(captchaFiled.getText());
    }
    /**弹出密码错误窗口*/
    public void errorPassword(){
        JDialog jDialog = new JDialog();
        JLabel jLabel = new JLabel(new String(" 用户名存在，密码错误"));
        jLabel.setBounds(0,0,150,55);
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(155,60);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }
    /**弹出用户名不存在窗口*/
    public void errorUserName(){
        JDialog jDialog = new JDialog();
        JLabel jLabel = new JLabel(new String("  用户名不存在或不正确,请重新登录或注册"));
        jLabel.setBounds(0,0,300,55);
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(344,60);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }
    /**弹出验证码错误窗口*/
    public void errorCapt(){
        JDialog jDialog = new JDialog();
        JLabel jLabel = new JLabel(new String("  验证码错误"));
        jLabel.setBounds(0,0,120,55);
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(130,60);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }
    /**实现切换验证码*/
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == capt){
            capt.setText(setCapt());
        }
    }
}
