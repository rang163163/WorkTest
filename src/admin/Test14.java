package admin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Test14 {
	private static final int MIN_PROGRESS = 0;
    private static final int MAX_PROGRESS = 100;

    private static int currentProgress = MIN_PROGRESS;

    public static void main(String[] args) throws InterruptedException {
    	JFrame jf = new JFrame("测试窗口");
        jf.setSize(300,140);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        JPanel panel = new JPanel();
       panel.setPreferredSize(new Dimension(0,300));
       

      
        panel.setLayout(null);
        ImageIcon image=new ImageIcon("./src/open.gif");
        image.setImage(image.getImage().getScaledInstance(300, 100, Image.SCALE_AREA_AVERAGING));
       
        JLabel jmage=new JLabel(image);
        JLabel jmage1=new JLabel("正在登陆..");
        jmage1.setBounds(40,90, 70, 50);

        jmage.setBounds(0, 0,300,100);
          panel.add(jmage);
          panel.add(jmage1);
          jf.setResizable(false);
          jf.setUndecorated(true);
        jf.add(panel,new BorderLayout().NORTH);
        jf.setVisible(true);
        // 创建一个进度条
        final JProgressBar progressBar = new JProgressBar();
       
		
        // 设置进度的 最小值 和 最大值
        progressBar.setMinimum(MIN_PROGRESS);
        progressBar.setMaximum(MAX_PROGRESS);
        progressBar.setBounds(0,100 , 300,40);
       progressBar.setBackground(Color.cyan);
       progressBar.setValue(0);
       progressBar.setFont(new Font("宋体",Font.ITALIC,30));
       panel.add(progressBar);
       progressBar.setStringPainted(true);
       
       List t=new ArrayList(100);
    for(int s=0;s<=100;s++){
    	   t.add(s);
       }
   System.out.println("adsa");
       System.out.println(t);
       
       TimerTask tt;
       int i=0;
    	  while(i<99){
    		  t.remove(1);
    		  i++;
    		  System.out.println(t.get(1));
    
       Thread t1=new Thread();
       t1.sleep(1000);
    		  progressBar.setValue((int) t.get(1));	  
    }
}
}