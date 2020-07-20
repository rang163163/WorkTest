package admin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.stream.events.StartDocument;




public class Select  {
	static int a=0;
	JPanel  p1=null;
	JPanel  p2=null;
	JPanel  p3=null;
	JPanel  p4=null;
	JPanel  p5=null;
	public Select() {
		 JFrame jf = new JFrame("");
		jf.setSize(600, 350);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
       jf.setUndecorated(true);
		
       p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
       p5=new JPanel();
      
       
        
        p1.setLayout(null);
		 p2.setLayout(null);
		 p3.setLayout(null);
		 p4.setLayout(null);
        final JTabbedPane tabbedPane = new JTabbedPane();
        
        ImageIcon image=new ImageIcon("./src/4.png");
        ImageIcon image1=new ImageIcon("./src/509930.gif");
        ImageIcon image2=new ImageIcon("./src/5.2.png");
        ImageIcon image3=new ImageIcon("./src/1.gif");
        ImageIcon imagetc=new ImageIcon("./src/tc.gif");
      
        image.setImage(image.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
        image1.setImage(image1.getImage().getScaledInstance(150, 150,Image.SCALE_FAST));
        image2.setImage(image2.getImage().getScaledInstance(150, 150,Image.SCALE_FAST));
        imagetc.setImage(imagetc.getImage().getScaledInstance(26, 26,Image.SCALE_FAST));
       //image3.setImage(image3.getImage().getScaledInstance(300,200,Image.SCALE_AREA_AVERAGING));
        JLabel lab1=new JLabel(image1);
        JLabel lt1=new JLabel("手机号：");
        JLabel lt2=new JLabel(" 密 码  ：");
 JTextField text1=new JTextField(10);
 java.util.Date date=new java.util.Date();
 DateFormat format1=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
 JButton j1=new JButton(image);
 JButton j2=new JButton("注册");
 
JLabel j3=new JLabel(format1.format(date));
     TimerTask task=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			java.util.Date date1=new java.util.Date();
			 DateFormat format2=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
			 j3.setText(format2.format(date1));
			 p1.repaint();
		}
	};
	new Timer().schedule(task, 1000);
 
        JTextField text2=new JTextField(10);
        JLabel lab3=new JLabel("关爱我们的健康！");
       
        lab1.setBounds(30, 30,150,150);
        lab3.setBounds(20, 250,150,80);
        j3.setBounds(200, 250,150,80);
        text1.setBounds(250, 65,150,20);
        text2.setBounds(250, 120,150,20);
        lt1.setBounds(200,50,60, 50);
        lt2.setBounds(200,100,60, 50); 
        j1.setBounds(230, 200,70, 40);
		
		 j1.setRolloverIcon(image);
		 j2.setBounds(350, 200,70,40);
		 j1.setBorderPainted(false);
		 j2.setBackground(Color.BLUE);;
        p1.add(j1);
		 p1.add(lt1);
		 p1.add(lt2);
		 p1.add(j3);
		 p1.add(j2);
		 p1.add(lab1);
		 p1.add(lab3);
		 p1.add(text1);
		 p1.add(text2);

		
		    JLabel lab11=new JLabel(image3);
	        JLabel lt11=new JLabel("手机号：");
	        JLabel lt21=new JLabel(" 密 码  ：");
	 JTextField text11=new JTextField(10);

	 JButton j11=new JButton(image);
	 JButton j21=new JButton("注册");
	        JTextField text21=new JTextField(10);
	        JLabel lab31=new JLabel("关爱我们的健康！");
	        lab11.setBounds(30, 30,150,150);
	        lab31.setBounds(20, 250,150,80);
	        text11.setBounds(250, 65,150,20);
	        text21.setBounds(250, 120,150,20);
	        lt11.setBounds(200,50,60, 50);
	        lt21.setBounds(200,100,60, 50); 
	        j11.setBounds(230, 200,70, 40);
	        j11.setBorderPainted(false);
			 j11.setRolloverIcon(image);
			 j21.setBounds(350, 200,70,40);
			 
			 j21.setBackground(Color.BLUE);;
	        p2.add(j11);
			 p2.add(lt11);
			 p2.add(lt21);
			 p2.add(j21);
			 p2.add(lab11);
			 p2.add(lab31);
			 p2.add(text11);
			 p2.add(text21);
  
        
       
			 JLabel lab111=new JLabel(image2);
		        JLabel lt111=new JLabel("手机号：");
		        JLabel lt211=new JLabel(" 密 码  ：");
		 JTextField text111=new JTextField(10);

		 JButton j111=new JButton(image);
		 JButton j211=new JButton("注册");
		        JTextField text211=new JTextField(10);
		        JLabel lab311=new JLabel("关爱我们的健康！");
		        lab111.setBounds(30, 30,150,150);
		        lab311.setBounds(20, 250,150,80);
		        text111.setBounds(250, 65,150,20);
		        text211.setBounds(250, 120,150,20);
		        lt111.setBounds(200,50,60, 50);
		        lt211.setBounds(200,100,60, 50); 
		        j111.setBounds(230, 200,70, 40);
				
				 j111.setBorderPainted(false);
				 j211.setBounds(350, 200,70,40);
				 
				 j211.setBackground(Color.BLUE);;
		        p3.add(j111);
				 p3.add(lt111);
				 p3.add(lt211);
				 p3.add(j211);
				 p3.add(lab111);
				 p3.add(lab311);
				 p3.add(text111);
				 p3.add(text211);
		 
		 
		 
				 JLabel jj=new JLabel("很高兴与你相遇！");
				 jj.setBounds(150, 100, 200, 200);
				 jj.setFont(new Font("宋体",Font.BOLD,20));
				 int i=0;
		    Thread tt=new Thread();
		    
		   
             tabbedPane.addTab("我是店主",image,p1);
             tabbedPane.addTab("我是管理员",image, p2);
              tabbedPane.addTab("我是顾客", image, p3);
              tabbedPane.addTab("退出系统！", imagetc,p4);
              p4.add(jj);
             JPanel jjj=new JPanel();
             jjj.setBounds(100, 100, 100,100);
            // p5.add(jj);
             JProgressBar progressBar = new JProgressBar();
		       
				
		        // 设置进度的 最小值 和 最大值
		        progressBar.setMinimum(0);
		        progressBar.setMaximum(100);
		        progressBar.setBounds(0,100 , 300,40);
		       progressBar.setBackground(Color.cyan);
		       progressBar.setFont(new Font("宋体",Font.ITALIC,30));
		       progressBar.setStringPainted(true);
		    // 设置当前进度值
		       p5.add(progressBar);
		       progressBar.setValue(45);
		        // 绘制百分比文本（进度条中间显示的百分数）
		        
		       
		        List t=new ArrayList(100);
			   JButton jt=new JButton();
			
             j1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					 tabbedPane.addTab("正在登录！", imagetc,p5);
					 tabbedPane.setSelectedIndex(4);
					 tabbedPane.setIconAt(3, image);
					
					 p1.add(progressBar);
					 //new Test15().tt();
					       
					 for(int s=0;s<=100;s++){
				    	   t.add(s);
				       }
				    int i1=0;
			    	  while(i1<99){
			    		  t.remove(1);
			    		  i1++;
			    		  System.out.println(t.get(1));
			    		   
			       Thread t1=new Thread();
			       try {
					t1.sleep(100);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			       
			       
			       progressBar.setValue((int) t.get(1));		  
			    }  
					      
					       				    						 										 												
						
													 
					 
					 
				}		 
				
			});
            
              tabbedPane.addChangeListener(new ChangeListener() {
                  @Override
                  public void stateChanged(ChangeEvent e) {
                	      
                          
                	  if(tabbedPane.getSelectedIndex()==3){
                		  Thread t1=new Thread();
                		
                		  int result = JOptionPane.showConfirmDialog(null,"删除？","提示",
                				  JOptionPane.YES_NO_CANCEL_OPTION
                				                  );
                		  int i=100;
                		 
                		  if(result==0){
                			 {
                				
                				 p4.add(jj);
                				  try {
                    				  
                    				  
            							t1.sleep(3000);
            							
            							 jf.dispose();
            						} catch (InterruptedException e1) {
            							// TODO Auto-generated catch block
            							e1.printStackTrace();
            						
                      		  }
                			  }
                			  
                		  }
                		  
                		
                	  }
                      
                  }
              });
     

       
        tabbedPane.setSelectedIndex(1);

        jf.setContentPane(tabbedPane);
        jf.setVisible(true);
      
	

}} 




