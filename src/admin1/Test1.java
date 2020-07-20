package admin1;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import admin.ShowTimeApp.ShowTime;

public class Test1 extends JFrame{
public static void main(String[] args) {
	new Test1();
	//new Test2().t();
	
}
   private  BossPanel bosspanel=null; 
   private  UserPanel userpanel=null; 
   private   Tc tc=null;
   private   InfoPanel info=null;
   //private  ManPanel manpanel=null; 
   private ImageIcon mage=null;
   private ImageIcon mage1=null;
   private JTabbedPane tabbedPane = null;
   private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   public Test1(){
	   setSize(600, 350);
	   bossPanel();
	   Userpanel();
	   Tc();
	   infoPanel();
	// manPanel();
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      SwingUtil.setMainframe(this);
       setLocationRelativeTo(null);
      setUndecorated(true);
	   mage=new ImageIcon("./src/4.png");
	   mage1=new ImageIcon("./src/tc.gif");
	   mage.setImage(mage.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
	   mage1.setImage(mage1.getImage().getScaledInstance(26, 26, Image.SCALE_AREA_AVERAGING));
	   tabbedPane = new JTabbedPane();
	  tabbedPane.addTab("我是店主",mage,bosspanel);
	   tabbedPane.addTab("我是顾客",mage,userpanel);
	   tabbedPane.addTab("药物信息浏览！",mage,info);
	   tabbedPane.addTab("退出系统！",mage1,tc);
	   
	  // tabbedPane.addTab("我是员工",mage,manpanel);
	   add(tabbedPane);
	   setVisible(true);
	   Timer timer = new Timer();
	   timer.schedule(new ShowTime(), new Date(), 1000);
	   tabbedPane.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) {
         	      
                   
         	  if(tabbedPane.getSelectedIndex()==3){
         		  Thread t1=new Thread();
         		
         		  int result = JOptionPane.showConfirmDialog(null,"退出？","提示",
         				  JOptionPane.YES_NO_CANCEL_OPTION
         				                  );
         		  int i=100;
         		 
         		  if(result==0){
         			 {
         				
         				
         				  try {
             				  
             				  
     							t1.sleep(3000);
     							System.exit(0);;
     							
     							
     						} catch (InterruptedException e1) {
     							// TODO Auto-generated catch block
     							e1.printStackTrace();
     						
               		  }
         			  }
         			  
         		  }
         		  
         		
         	  }
               
           }
       });
   }
   public JTabbedPane getJtable(){
	   
	return this.tabbedPane;
	   
   }
   public  JFrame jrame(){
	   this.dispose();
	   return this;
   }
   
   public void bossPanel(){
	   bosspanel=new BossPanel();
	   
   }
   public void infoPanel(){
	   info=new InfoPanel();
	   
   }
   public void Tc(){
	   tc=new Tc();
	   
   }
   public void Userpanel(){
	   userpanel=new UserPanel();
	   
   }
 /*public void manPanel(){
	manpanel=new ManPanel();
	   
}*/
 class ShowTime extends TimerTask {
	 public void run() {
	 // 刷新
	 bosspanel.jtime.setText(sdf.format(new Date()));
	 userpanel.jtime.setText(sdf.format(new Date()));
	// manpanel.jtime.setText(sdf.format(new Date()));
	 repaint();
	 }
	 }
}