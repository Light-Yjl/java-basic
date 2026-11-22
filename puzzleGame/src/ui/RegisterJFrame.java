package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class RegisterJFrame extends LoginJFrame {
    JPasswordField newPasswordField = new JPasswordField();

    public RegisterJFrame() {
        super(false);
        initJFrame();
        initInput();
        putCapt();
        mouseControl();
        initBackGround();
        this.setVisible(true);
    }
    /**初始化界面*/
    @Override
    public void initJFrame() {
        this.setSize(500,465);
        this.setTitle("拼图注册界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
    }
    /**初始化背景*/
    @Override
    public void initBackGround(){
        //添加背景图片
        JLabel bg = new JLabel(new ImageIcon("puzzleGame/image/login/background.png"));
        bg.setBounds(0,0,488,430);

        JLabel user = new JLabel(new ImageIcon("puzzleGame/image/login/username.png"));
        user.setBounds(90,140,47,17);

        JLabel password = new JLabel(new ImageIcon("puzzleGame/image/login/password.png"));
        password.setBounds(90,195,47,17);

        JLabel password2 = new JLabel(new ImageIcon("puzzleGame/image/login/new_password.png"));
        password2.setBounds(90,250,47,17);

        JLabel captcha = new JLabel(new ImageIcon("puzzleGame/image/login/captcha.png"));
        captcha.setBounds(90,310,47,17);

        //添加图片
        this.getContentPane().add(user);
        this.getContentPane().add(password);
        this.getContentPane().add(password2);
        this.getContentPane().add(captcha);
        this.getContentPane().add(bg);
    }
    /**添加输入框*/
    @Override
    public void initInput(){
        Font inputFont = new Font("微软雅黑", Font.PLAIN, 18);
        userName.setFont(inputFont);
        passwordField.setFont(inputFont);
        newPasswordField.setFont(inputFont);
        captchaFiled.setFont(inputFont);

        //用户名输入框
        userName.setBounds(160,135,230,30);
        this.getContentPane().add(userName);

        //密码输入框
        passwordField.setBounds(160,190,230,30);
        this.getContentPane().add(passwordField);

        //新密码输入框
        newPasswordField.setBounds(160,245,230,30);
        this.getContentPane().add(newPasswordField);

        //验证码输入框
        captchaFiled.setBounds(160,305,115,30);
        this.getContentPane().add(captchaFiled);
    }
    /**鼠标事件*/
    @Override
    public void mouseControl(){
        register.setBounds(180,350,128,47);
        this.getContentPane().add(register);
        //绑定鼠标事件
        register.addMouseListener(this);
    }
    /**重写鼠标事件*/
    @Override
    public void mouseEntered(MouseEvent e) {
        Object o = e.getSource();
        if (o == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/register_pressed.png"));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object o = e.getSource();
        if (o == register) {
            register.setIcon(new ImageIcon("puzzleGame/image/login/register.png"));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (o == register) {
            if(existUser()){
                errorUserName();
            }else{
                if(matchPassword()){
                    if(rightCapt()){
                        User newUser = new User(userName.getText(),new String(passwordField.getPassword()));
                        list.add(newUser);
                        this.setVisible(false);
                        new LoginJFrame();
                    }else{
                        errorCapt();
                    }
                }else{
                    errorPassword();
                }
            }
        }

    }
    /**放置验证码*/
    @Override
    public void putCapt(){
        capt.setBounds(290,305,100,30);
        capt.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        this.getContentPane().add(capt);
        capt.addActionListener(this);
    }
    /**判断新密码与密码是否相同*/
    public boolean matchPassword(){
        return new String(newPasswordField.getPassword()).equals
                (new String(passwordField.getPassword())
                );
    }

    /**弹出用户名存在窗口*/
    @Override
    public void errorUserName(){
        JDialog jDialog = new JDialog();
        JLabel jLabel = new JLabel(new String("  用户名已存在"));
        jLabel.setBounds(0,0,150,55);
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(155,60);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }
    /**弹出密码错误窗口*/
    @Override
    public void errorPassword(){
        JDialog jDialog = new JDialog();
        JLabel jLabel = new JLabel(new String(" 密码不一致"));
        jLabel.setBounds(0,0,150,55);
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(155,60);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }

}
