package admin1;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

//绘制验证码，同时测试输入是否正确
public class Test2 extends JFrame{
	static int count=0;
	public  int t() {
		final Frame frame = new Frame("登陆窗口");//创建Frame对象
		final MyPanel panel = new MyPanel();//创建Canvas对象
		frame.setLayout(new BorderLayout());
		final TextField tf=new TextField();
		tf.setSize(200,20);
		frame.add(tf,BorderLayout.SOUTH);	
		
		frame.add(panel,BorderLayout.CENTER);
		Button but1 = new Button("点击验证");
		but1.setSize(50, 50);
		frame.add(but1,BorderLayout.EAST);                             
		but1.addActionListener(new ActionListener() { 
			//注意大小写敏感                         
			public void actionPerformed(ActionEvent e) {				
				if(tf.getText().toLowerCase().equals(new String(panel.result).toLowerCase())){
					System.out.println("输入与验证码一致");
					JFrame t1=new SwingUtil().getMainframe();
					
					JTabbedPane j1 =new Test1().getJtable();
					j1.addTab("登录中！", new LoginUtil());
	                j1.setSelectedIndex(4);
					
					t1.setVisible(false);
					frame.setVisible(false);
				}else{
					if(count>=3){
						System.exit(0);
					}
					count++;
					System.out.println(123);
					//JOptionPane.showMessageDialog(null, "验证码输入错误！");
					tf.setText("");
					
				}	                    
			}
		});
		frame.setSize(250, 150);
		// 将Frame窗口居中
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		// 为窗口组件注册监听器
		frame.addWindowListener(new MyWindowListener2());
		return count;
	}		
}
class MyPanel extends Panel {
	char [] result=new char[4];
	public void paint(Graphics g) {
		int width = 160; // 定义验证码图片的宽度
		int height = 80; // 定义验证码图片的高度
		g.setColor(Color.GREEN); //设置上下文颜色
		g.fillRect(0, 0, width, height);//填充验证码背景
		g.setColor(Color.BLACK);//设置上下文颜色
		g.drawRect(0, 0, width - 1, height - 1);//绘制边框
		//绘制干扰点
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			int x1 = r.nextInt(width) - 10;
			int y1 = r.nextInt(height) - 10;
			g.drawOval(x1, y1, 4*r.nextInt(4), 4*r.nextInt(4));
			int x2 = r.nextInt(width) - 10;
			int y2 = r.nextInt(height) - 10;
			g.drawLine(x1, y1, x2, y2);
		}
		g.setFont(new Font("黑体", Font.BOLD, 30)); // 设置验证码字体
		g.setColor(Color.RED);                        // 设置验证码颜色
		//产生随机验证码
		char[] chars = ("0123456789abcdef"
				).toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int pos = r.nextInt(chars.length);
			char c = chars[pos];
			result[i]=chars[pos];
			sb.append(c + " ");
		}
		
		
		g.drawString(sb.toString(), 20, 30);// 写入验证码
	}
} 
//继承WindowAdapter类，重写windowClosing()方法
class MyWindowListener2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}