package admin1;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

//������֤�룬ͬʱ���������Ƿ���ȷ
public class Test2 extends JFrame{
	static int count=0;
	public  int t() {
		final Frame frame = new Frame("��½����");//����Frame����
		final MyPanel panel = new MyPanel();//����Canvas����
		frame.setLayout(new BorderLayout());
		final TextField tf=new TextField();
		tf.setSize(200,20);
		frame.add(tf,BorderLayout.SOUTH);	
		
		frame.add(panel,BorderLayout.CENTER);
		Button but1 = new Button("�����֤");
		but1.setSize(50, 50);
		frame.add(but1,BorderLayout.EAST);                             
		but1.addActionListener(new ActionListener() { 
			//ע���Сд����                         
			public void actionPerformed(ActionEvent e) {				
				if(tf.getText().toLowerCase().equals(new String(panel.result).toLowerCase())){
					System.out.println("��������֤��һ��");
					JFrame t1=new SwingUtil().getMainframe();
					
					JTabbedPane j1 =new Test1().getJtable();
					j1.addTab("��¼�У�", new LoginUtil());
	                j1.setSelectedIndex(4);
					
					t1.setVisible(false);
					frame.setVisible(false);
				}else{
					if(count>=3){
						System.exit(0);
					}
					count++;
					System.out.println(123);
					//JOptionPane.showMessageDialog(null, "��֤���������");
					tf.setText("");
					
				}	                    
			}
		});
		frame.setSize(250, 150);
		// ��Frame���ھ���
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		// Ϊ�������ע�������
		frame.addWindowListener(new MyWindowListener2());
		return count;
	}		
}
class MyPanel extends Panel {
	char [] result=new char[4];
	public void paint(Graphics g) {
		int width = 160; // ������֤��ͼƬ�Ŀ��
		int height = 80; // ������֤��ͼƬ�ĸ߶�
		g.setColor(Color.GREEN); //������������ɫ
		g.fillRect(0, 0, width, height);//�����֤�뱳��
		g.setColor(Color.BLACK);//������������ɫ
		g.drawRect(0, 0, width - 1, height - 1);//���Ʊ߿�
		//���Ƹ��ŵ�
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			int x1 = r.nextInt(width) - 10;
			int y1 = r.nextInt(height) - 10;
			g.drawOval(x1, y1, 4*r.nextInt(4), 4*r.nextInt(4));
			int x2 = r.nextInt(width) - 10;
			int y2 = r.nextInt(height) - 10;
			g.drawLine(x1, y1, x2, y2);
		}
		g.setFont(new Font("����", Font.BOLD, 30)); // ������֤������
		g.setColor(Color.RED);                        // ������֤����ɫ
		//���������֤��
		char[] chars = ("0123456789abcdef"
				).toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int pos = r.nextInt(chars.length);
			char c = chars[pos];
			result[i]=chars[pos];
			sb.append(c + " ");
		}
		
		
		g.drawString(sb.toString(), 20, 30);// д����֤��
	}
} 
//�̳�WindowAdapter�࣬��дwindowClosing()����
class MyWindowListener2 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}