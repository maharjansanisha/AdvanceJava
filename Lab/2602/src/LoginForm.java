import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class LoginForm extends JFrame implements EventListener {
    public static void main(String[] args) {  
        new LoginForm();
    }

    public LoginForm(){

        this.setSize(400,300);

        JLabel login_to_continue = new JLabel("Login to continue");

        Font f = new Font(Font.DIALOG,Font.BOLD,16);

        login_to_continue.setFont(f);

        login_to_continue.setBounds(110, 20, 400,20);

        this.add(login_to_continue);

        JLabel username_label = new JLabel("Username");
        JTextField username = new JTextField();

        username_label.setBounds(50,50, 200,30);

        username.setBounds(110,50,200,30);

        JLabel pwd_label = new JLabel("Password");
        JTextField pwd = new JTextField();


        pwd_label.setBounds(50,100, 200,30);

        pwd.setBounds(110,100,200,30);

        JButton login_btn  = new JButton("login");
        login_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = username.getText();
                String pass = pwd.getText();

                if (uname.equals("meow") && pass.equals("meoww")){
                    showDiaglog("Login Successful");
                }else{
                    showDiaglog("Login failed");
                }

            }
        });
        login_btn.setBounds(110,150,200,30);

        this.add(username_label);
        this.add(username);

        this.add(pwd_label);
        this.add(pwd);

        this.setLayout(null);

        this.add(login_btn);

        this.setVisible(true);
    }

    public void showDiaglog(String msg){
        JOptionPane.showMessageDialog(this,msg);
    }
}
