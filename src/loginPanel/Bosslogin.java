package loginPanel;
import LoginShow.*;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



import test.*;
public class Bosslogin extends JFrame{
private LoginPanel1 login1=null;
private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public Bosslogin(){
		setSize(600,500);
		setUndecorated(true);
		
		 setLocationRelativeTo(null);
		login1();
		System.out.println("123");
		ImageIcon image=new ImageIcon("./src/1.gif");
	     image.setImage(image.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
	     
	       JTabbedPane tabbedPane = new  JTabbedPane(JTabbedPane.LEFT);
	       setContentPane(tabbedPane);
	      // JTabbedPane tabbedPane1 = new  JTabbedPane(JTabbedPane.LEFT);
	        tabbedPane.addTab("管理员工信息", image, login1);
	        Timer timer = new Timer();
			   timer.schedule(new ShowTime(), new Date(), 1000);
	        setVisible(true);
	}

	public void login1()
	{
		login1=new LoginPanel1();
	}

	
	class ShowTime extends TimerTask {
		 public void run() {
		 // 刷新
		login1.jtime.setText(sdf.format(new Date()));
		
		// manpanel.jtime.setText(sdf.format(new Date()));
		 repaint();
		 }
		 }	
}
