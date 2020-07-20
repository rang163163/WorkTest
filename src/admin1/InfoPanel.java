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
	 DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("仁和药店");

     // 创建二级节点
     DefaultMutableTreeNode Node1 = new DefaultMutableTreeNode("抗生素药品");
     DefaultMutableTreeNode Node2 = new DefaultMutableTreeNode("皮肤科药品");
     DefaultMutableTreeNode Node3 = new DefaultMutableTreeNode("消化系统药品");
     DefaultMutableTreeNode Node4 = new DefaultMutableTreeNode("呼吸系统药品");

     // 把二级节点作为子节点添加到根节点
     rootNode.add(Node1);
     rootNode.add(Node2);
     rootNode.add(Node3);
     rootNode.add(Node3);
     rootNode.add(Node4);

     // 创建三级节点
     DefaultMutableTreeNode Node11 = new DefaultMutableTreeNode("青霉素");
     DefaultMutableTreeNode Node12 = new DefaultMutableTreeNode("阿莫西林");
     DefaultMutableTreeNode Node13 = new DefaultMutableTreeNode("红霉素");
     DefaultMutableTreeNode Node14 = new DefaultMutableTreeNode("头孢菌素");

     DefaultMutableTreeNode Node21 = new DefaultMutableTreeNode("雷尼替丁");
     DefaultMutableTreeNode Node22 = new DefaultMutableTreeNode("法莫替丁");
     DefaultMutableTreeNode Node23 = new DefaultMutableTreeNode("乙烯雌酚");
     DefaultMutableTreeNode Node24 = new DefaultMutableTreeNode("环磷酰胺");

     DefaultMutableTreeNode Node31 = new DefaultMutableTreeNode("奥美拉唑");
     DefaultMutableTreeNode Node32 = new DefaultMutableTreeNode("多潘立酮");
     DefaultMutableTreeNode Node33 = new DefaultMutableTreeNode("雷贝拉唑");
     DefaultMutableTreeNode Node34 = new DefaultMutableTreeNode("铝碳酸镁片");

     
     DefaultMutableTreeNode Node41 = new DefaultMutableTreeNode("复方甘草片");
     DefaultMutableTreeNode Node42 = new DefaultMutableTreeNode("菠萝蛋白酶");
     DefaultMutableTreeNode Node43 = new DefaultMutableTreeNode("阿斯美");
     DefaultMutableTreeNode Node44 = new DefaultMutableTreeNode("咳特灵");
     // 把三级节点作为子节点添加到相应的二级节点
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
     
    

     // 使用根节点创建树组件
     JTree tree = new JTree(rootNode);
     tree.setBounds(0, 0, 200, 500);

     // 设置树显示根节点句柄
     tree.setShowsRootHandles(true);

     // 设置树节点可编辑
     tree.setEditable(true);
     js.add(tree);
     add(js);
	}
}
