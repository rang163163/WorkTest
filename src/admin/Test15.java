package admin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Test15 {
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
