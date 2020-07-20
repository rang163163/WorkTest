package admin1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;








import admin.Bosslogin;
import admin1.Test1.ShowTime;

public class BossPanel extends JPanel {
static int a=0;
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
	public JLabel jtime = null;
	public JLabel jtime1 = null;
		


	public BossPanel() {
		bossPanel();
		setVisible(true);
		
	}

	public void bossPanel() {
		this.setLayout(null);
		lt1 = new JLabel("手机号：");
		lt2 = new JLabel(" 密 码  ：");
		text1 = new JTextField(10);
		image1 = new ImageIcon("./src/4.png");
		image2 = new ImageIcon("./src/509930.gif");
	 jtime=new JLabel();
	 jtime1=new JLabel("欢迎使用本系统！");
	
		j1 = new JButton(image1);
		j2 = new JButton("注册");

		lab1 = new JLabel(image2);

		text2 = new JTextField(10);
		lab2 = new JLabel("关爱我们的健康！");

		lab1.setBounds(30, 30, 150, 150);
		lab2.setBounds(20, 250, 150, 80);
		jtime.setBounds(400, 250, 150, 100);
		//jtime1.setBounds(0,0, 100, 50);

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
				 
				int a=new Test2().t();
				
				//tt();
				
				
				//System.out.println("213");
				//jf.dispose();
				
			}
		});
		  ActionListener ac=new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(a<400&&a>=0){
						a=a+2;
						
					}
					else
					{
						a=400-a;
					}
					jtime1.setBounds(a, 0, 150, 60);
				}
			};
			
			
			new javax.swing.Timer(80, ac).start();;
		add(j1);
		add(lt1);
		add(lt2);
		add(jtime1);
		add(j2);
		add(lab1);
		add(jtime);
		//add(jtime1);
		add(lab2);
		add(text1);
		add(text2);
		
	}
	public static void tt(){
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(200, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon image=new ImageIcon("./src/1.png");
        image.setImage(image.getImage().getScaledInstance(300, 100, Image.SCALE_AREA_AVERAGING));
       
        JLabel jmage=new JLabel(image);
        JPanel panel = new JPanel();
        JPanel pane2 = new JPanel();
        jmage.setBounds(0, 0,300,100);
        panel.setLayout(null);
        pane2.setLayout(null);
        panel.setPreferredSize(new Dimension(100,200));
        pane2.setPreferredSize(new Dimension(0,100));
         JButton j1=new JButton();
         j1.setBounds(0, 50, 30,15);
         panel.add(j1);
         panel.add(jmage);
        // 创建一个滑块，最小值、最大值、初始值 分别为 0、20、10
        final JSlider slider = new JSlider(0, 20, 0);
        slider.setBounds(0, 100, 200,90);
        // 设置主刻度间隔
        slider.setMajorTickSpacing(5);
        
        // 设置次刻度间隔
        slider.setMinorTickSpacing(1);

        // 绘制 刻度 和 标签
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        long ctime= System.currentTimeMillis();
        System.out.println("当前值: " + slider.getValue());
        System.out.println(ctime);
        // 添加刻度改变监听器
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            	
                int x= slider.getValue();
                        j1.setBounds(9*x, 51, 25, 12);
                        
                        if(slider.getValue()==14){
                        	long etime=System.currentTimeMillis();
                        	System.out.println(etime);
                        	long t=etime-ctime;
                        	JOptionPane.showMessageDialog(null,"验证成功用时"+t/1000+"秒");
                        	jf.dispose();
                        }
                        
            }
        });

        // 添加滑块到内容面板
        panel.add(slider);
        //jf.add(pane2,new BorderLayout().SOUTH);
        jf.add(panel,new BorderLayout().NORTH);
       jf.setContentPane(panel);
        jf.setVisible(true);
       

    }
}
