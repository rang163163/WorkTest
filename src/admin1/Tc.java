package admin1;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tc extends JPanel{
	private JLabel jj=null;
	public Tc(){
		Tc();
		setVisible(true);
	}
	public void Tc(){
		jj=new JLabel("�ܸ�������������");
		 jj.setBounds(150, 100, 200, 200);
		 jj.setFont(new Font("����",Font.BOLD,20));
		 add(jj);
	}
}
