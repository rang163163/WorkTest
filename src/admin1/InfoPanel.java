package admin1;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;

public class InfoPanel extends JPanel {
	public InfoPanel()
	{
		infoPanel();
		setVisible(true);
	}
	
	
	public void infoPanel(){
		setLayout(null);
		JScrollPane js=new JScrollPane();
		js.setBounds(0, 0, 200, 500);
		js.setLayout(null);;
		js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	 DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("�ʺ�ҩ��");

     // ���������ڵ�
     DefaultMutableTreeNode Node1 = new DefaultMutableTreeNode("������ҩƷ");
     DefaultMutableTreeNode Node2 = new DefaultMutableTreeNode("Ƥ����ҩƷ");
     DefaultMutableTreeNode Node3 = new DefaultMutableTreeNode("����ϵͳҩƷ");
     DefaultMutableTreeNode Node4 = new DefaultMutableTreeNode("����ϵͳҩƷ");

     // �Ѷ����ڵ���Ϊ�ӽڵ���ӵ����ڵ�
     rootNode.add(Node1);
     rootNode.add(Node2);
     rootNode.add(Node3);
     rootNode.add(Node3);
     rootNode.add(Node4);

     // ���������ڵ�
     DefaultMutableTreeNode Node11 = new DefaultMutableTreeNode("��ù��");
     DefaultMutableTreeNode Node12 = new DefaultMutableTreeNode("��Ī����");
     DefaultMutableTreeNode Node13 = new DefaultMutableTreeNode("��ù��");
     DefaultMutableTreeNode Node14 = new DefaultMutableTreeNode("ͷ�߾���");

     DefaultMutableTreeNode Node21 = new DefaultMutableTreeNode("�����涡");
     DefaultMutableTreeNode Node22 = new DefaultMutableTreeNode("��Ī�涡");
     DefaultMutableTreeNode Node23 = new DefaultMutableTreeNode("��ϩ�Ʒ�");
     DefaultMutableTreeNode Node24 = new DefaultMutableTreeNode("��������");

     DefaultMutableTreeNode Node31 = new DefaultMutableTreeNode("��������");
     DefaultMutableTreeNode Node32 = new DefaultMutableTreeNode("������ͪ");
     DefaultMutableTreeNode Node33 = new DefaultMutableTreeNode("�ױ�����");
     DefaultMutableTreeNode Node34 = new DefaultMutableTreeNode("��̼��þƬ");

     
     DefaultMutableTreeNode Node41 = new DefaultMutableTreeNode("�����ʲ�Ƭ");
     DefaultMutableTreeNode Node42 = new DefaultMutableTreeNode("���ܵ���ø");
     DefaultMutableTreeNode Node43 = new DefaultMutableTreeNode("��˹��");
     DefaultMutableTreeNode Node44 = new DefaultMutableTreeNode("������");
     // �������ڵ���Ϊ�ӽڵ���ӵ���Ӧ�Ķ����ڵ�
     Node1.add(Node11);
     Node1.add(Node12);
     Node1.add(Node13);
     Node1.add(Node14);

     Node2.add(Node21);
     Node2.add(Node22);
     Node2.add(Node23);
     Node2.add(Node24);

     Node3.add(Node31);
     Node3.add(Node32);
     Node3.add(Node33);
     Node3.add(Node34);
     
     Node4.add(Node41);
     
     Node4.add(Node42);
     Node4.add(Node43);
     Node4.add(Node44);
     
    

     // ʹ�ø��ڵ㴴�������
     JTree tree = new JTree(rootNode);
     tree.setBounds(0, 0, 200, 500);

     // ��������ʾ���ڵ���
     tree.setShowsRootHandles(true);

     // �������ڵ�ɱ༭
     tree.setEditable(true);
     js.add(tree);
     add(js);
	}
}
