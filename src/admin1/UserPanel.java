package admin1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UserPanel extends JPanel {

	private JLabel lt1 = null;
	private JLabel lt2 = null;
	private JButton j1 = null;
	private JButton j2 = null;
	private JTextField text2 = null;
	private JTextField text1 = null;
	private JLabel lab2 = null;
	private JLabel lab1 = null;
	private ImageIcon image1 = null;
	private ImageIcon image2 = null;
	public JLabel jtime=null;

	public UserPanel() {
		userPanel();
		setVisible(true);
	}

	public void userPanel() {
		this.setLayout(null);
		lt1 = new JLabel("手机号：");
		lt2 = new JLabel(" 密 码  ：");
		text1 = new JTextField(10);
		image1 = new ImageIcon("./src/4.png");
		image2 = new ImageIcon("./src/1.gif");
         jtime=new JLabel();
		j1 = new JButton(image1);
		j2 = new JButton("注册");

		lab1 = new JLabel(image2);

		text2 = new JTextField(10);
		lab2 = new JLabel("关爱我们的健康！");

		lab1.setBounds(30, 30, 150, 150);
		lab2.setBounds(20, 250, 150, 80);
		jtime.setBounds(400, 250, 150, 100);

		text1.setBounds(250, 65, 150, 20);
		text2.setBounds(250, 120, 150, 20);
		lt1.setBounds(200, 50, 60, 50);
		lt2.setBounds(200, 100, 60, 50);
		j1.setBounds(230, 200, 70, 40);

		j1.setRolloverIcon(image1);
		j2.setBounds(350, 200, 70, 40);
             j1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel jp=new JPanel();
				ImageIcon mage=new ImageIcon("./src/4.png");
			mage.setImage(mage.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
			int a=new Test2().t();
			/*	JTabbedPane p=new Test1().getJtable();
				p.addTab("登录中", mage, new LoginUtil());
				p.setSelectedIndex(4);*/
				
				//tt();
				
				
			}
		});
		add(j1);
		add(lt1);
		add(lt2);
		add(jtime);

		add(j2);
		add(lab1);
		add(lab2);
		add(text1);
		add(text2);
	}

}
