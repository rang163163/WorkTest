package admin1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class LoginUtil extends JPanel {
	private JProgressBar progressBar = null;
	private JLabel  jd=null;
	 static int a=0;
	
	public LoginUtil(){
		loginUtil();
		setVisible(true);

	}
	public void loginUtil(){
		this.setLayout(null);
	   jd=new JLabel("���ڵ�¼....");
		progressBar=new JProgressBar();
		 progressBar=new JProgressBar();
		  // ���ý��ȵ� ��Сֵ �� ���ֵ
	     progressBar.setMinimum(0);
	     progressBar.setMaximum(100);
	     progressBar.setBounds(150,100 , 300,40);
	     jd.setBounds(220, 120, 120, 100);
	    progressBar.setBackground(Color.cyan);
	    progressBar.setFont(new Font("����",Font.ITALIC,30));
	    progressBar.setStringPainted(true);
	    progressBar.setValue(0);
	 // ���õ�ǰ����ֵ
	    TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
	  ActionListener ac=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int b=a++;
			if(b%2==0 && b<101){
			jd.setText("���ڵ�¼..");
			}else if(b%2!=0 && b<101)
			{
				jd.setText("���ڵ�¼....");
			}
			else if(b>300){
			
				
			Test1 jf=new SwingUtil().getMainframe();
			jf.setVisible(false);
			
				
			}else if(b==300){
				new admin1.Bosslogin();
			}
			else
			{
				jd.setText("��¼�ɹ������Ժ�");
			}
				
			progressBar.setValue(b);
			
		}
	};
	Timer tt=new Timer(10, ac);
	tt.start();
	
	
	   
	    
	    add(progressBar);
	    add(jd);
	}
}
