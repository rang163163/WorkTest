package admin;

import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowTimeApp extends JFrame {
// ʱ���ʽ
private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

private LabelPanel lp = null;

public ShowTimeApp() {

// ������ʾ���ڵĲ���
setDefaultCloseOperation(EXIT_ON_CLOSE);
// ������ʾ
setLocationRelativeTo(null);
// ���ڴ�С
setSize(200, 150);
// ���ڲ��ɸı��С
setResizable(false);
// ���ʱ���JPanel
// getContentPane().add(new TimePanel());
lp = new LabelPanel();
getContentPane().add(new TimePanel());

// ��ʾ
setVisible(true);

// ����ʱ��仯������
Timer timer = new Timer();
timer.schedule(new ShowTime(), new Date(), 1000);

}

public class ShowTime extends TimerTask {
public void run() {
// ˢ��
lp.label.setText(sdf.format(new Date()));
repaint();
}
}

class TimePanel extends JPanel {
public void paint(Graphics g) {
super.paint(g);
// ��ʾʱ��
g.drawString(sdf.format(new Date()), 10, 10);
}
}

class LabelPanel extends JPanel {
JLabel label = new JLabel();

public LabelPanel() {
add(label);
}
}

public static void main(String[] args) {
new ShowTimeApp();
}

}
