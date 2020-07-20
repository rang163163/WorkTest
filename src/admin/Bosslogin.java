package admin;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Bosslogin {
public static void ss() {

		try {
			new LoginUtil().login();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 JFrame jf = new JFrame("");
	        jf.setSize(500, 400);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        jf.setLocationRelativeTo(null);
	       jf.setUndecorated(true);
	       ImageIcon image=new ImageIcon("./src/1.gif");
	       image.setImage(image.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
	        JPanel p1=new JPanel();
	        JPanel p2=new JPanel();
	        JPanel p3=new JPanel();
	        JPanel p4=new JPanel();
	        p1.setLayout(null);
			 p2.setLayout(null);
			 p3.setLayout(null);
			 p4.setLayout(null);
			 JLabel j1=new JLabel("姓名   ：");
			 JLabel j2=new JLabel("手机号：");
			 JTextField jt1=new JTextField(10);
			 p1.setLayout(null);
			 j1.setBounds(15, 10,100,100);
			 jt1.setBounds(60, 50,100,20);
			 j2.setBounds(200, 20,100,100);
			 p1.add(j1);
			 p1.add(jt1);
			 
			 

			 
	       JTabbedPane tabbedPane = new  JTabbedPane(JTabbedPane.LEFT);
	      // JTabbedPane tabbedPane1 = new  JTabbedPane(JTabbedPane.LEFT);
	        tabbedPane.addTab("管理员工信息", image, p1);
	        tabbedPane.addTab("查询药物信息", image, p2);
	        tabbedPane.addTab("查询用户信息", image, p3);
	        tabbedPane.addTab("退 出 系 统 ！", image, p4);
	        tabbedPane.setBackground(Color.ORANGE);
	        
	        
	     
	        
	        
	        jf.setContentPane(tabbedPane);
	        jf.setVisible(true);
	        
		
	}
	

	
	
}
