package LoginShow;
import test.*;
import util.*;
import mainpanel.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.*;
public class LoginPanel1 extends JPanel {
	private JLabel j1 = null;
	private JLabel j2 = null;
	private JLabel j3 = null;
	private JLabel j4 = null;
	private JLabel j5 = null;
	private JTextField jt1 = null;
	private JTextField jt2 = null;
	private JTextField jt3 = null;
	private JTextField jt4 = null;
	private JTextField jt5 = null;
	private JComboBox<String> comboBox = null;
	private DefaultTableModel dt;

	private JButton jb = null;
	private JButton jb11 = null;
	private JButton jb12 = null;
	private JButton jb13 = null;
	private JTable table = null;
	public  JLabel jtime=null;

	public LoginPanel1() {

		login1();

		setVisible(true);
	}

	public void login1() {
		setLayout(null);
		JPanel pp = new JPanel();
		JPanel pp1 = new JPanel();
		JPanel pp2 = new JPanel();
		pp.setLayout(null);
		pp1.setLayout(null);
        jtime=new JLabel();
		pp.setBounds(0, 0, 400, 200);
		pp1.setBounds(80, 200, 300, 200);
		
		j1 = new JLabel("姓名   ：");
		j2 = new JLabel("手机号：");
		j3 = new JLabel("地址   ：");
		j4 = new JLabel("性别   ：");
		j5 = new JLabel("密码   ：");
		jt1 = new JTextField(10);
		jt2 = new JTextField(10);
		jt3 = new JTextField(10);
		jt4 = new JTextField(10);
		jt5 = new JTextField(10);
		jb = new JButton("开始");
		jb13 = new JButton("开始");
		jb11 = new JButton("删除");
		jb12 = new JButton("查询");
		j1.setBounds(0, 45, 50, 30);
		jt1.setBounds(60, 50, 100, 20);
		jt2.setBounds(240, 50, 100, 20);
		jt3.setBounds(140, 100, 100, 20);
		jt4.setBounds(140, 130, 100, 20);
		jt5.setBounds(140, 160, 100, 20);
		j2.setBounds(180, 10, 100, 100);
		j3.setBounds(90, 60, 100, 100);
		j4.setBounds(90, 90, 100, 100);
		j5.setBounds(90, 120, 100, 100);
		jb.setBounds(300, 150, 62, 30);
		jb11.setBounds(250, 70, 62, 30);
		jb12.setBounds(100, 70, 62, 30);
		jb13.setBounds(300, 150, 62, 30);
		j1.setVisible(false);
		j2.setVisible(false);
		j3.setVisible(false);
		j4.setVisible(false);
		j5.setVisible(false);
		jt1.setVisible(false);
		jt2.setVisible(false);
		jt3.setVisible(false);
		jt4.setVisible(false);
		jt5.setVisible(false);
		jb.setVisible(false);
		jb11.setVisible(false);
		jb12.setVisible(false);
		jb13.setVisible(false);

		String[] listData = new String[] { "查找信息", "删除信息", "修改信息", "添加信息" };

		comboBox = new JComboBox<String>(listData);

		comboBox.setBounds(150, 0, 100, 30);
		// 添加条目选中状态改变的监听器
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				if (e.getStateChange() == ItemEvent.SELECTED) {

					System.out.println("选中: " + comboBox.getSelectedIndex()
							+ " = " + comboBox.getSelectedItem());
					if (comboBox.getSelectedIndex() == 0) {
						j1.setVisible(true);
						j2.setVisible(true);
						j3.setVisible(false);
						j4.setVisible(false);
						j5.setVisible(false);
						jt1.setVisible(true);
						jt2.setVisible(true);
						jt3.setVisible(false);
						jt4.setVisible(false);
						jt5.setVisible(false);
						jb.setVisible(false);
						jb11.setVisible(false);
						jb12.setVisible(true);

					} else if (comboBox.getSelectedIndex() == 1) {
						j1.setVisible(true);
						j2.setVisible(true);
						j3.setVisible(false);
						j4.setVisible(false);
						j5.setVisible(false);
						jt1.setVisible(true);
						jt2.setVisible(true);
						jt3.setVisible(false);
						jt4.setVisible(false);
						jt5.setVisible(false);
						// jb.setVisible(true);
						jb11.setVisible(true);
						jb12.setVisible(true);

						jb11.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								String s = JOptionPane.showInputDialog(null,
										"请输入密码");
								if (s.equals("234"))
								// 获得内容中间容器
								{
									// 获得内容中间容器
									if (jt1.getText().equals("")
											&& jt1.getText().equals("")) {
										table.addMouseListener(new MouseAdapter() {

											@Override
											public void mouseClicked(
													MouseEvent e) {
												// TODO Auto-generated method
												// stub
												int row = table.rowAtPoint(e
														.getPoint());
												int col = table.columnAtPoint(e
														.getPoint());
												System.out.println(row + "  "
														+ col);
												String s1 = (String) table
														.getValueAt(row, 0);
												String s2 = (String) table
														.getValueAt(row, 1);
												User u=new User();
												u.setName(s1);
												u.setPhone(s2);
												mainpanel.Method m=new mainpanel.Method();
												try {

													m.delUser(u);

												} catch (Exception e1) {
													// TODO Auto-generated catch
													// block

												}
											}

										});
									} else {
										System.out.println("asd");
										System.out.println(jt1.getText());
										String user = jt1.getText();
										String phone = jt2.getText();
										String sex=jt3.getText();
										String address=jt4.getText();
										String password=jt5.getText();
										User u = new User();
										System.out.println(user);
										u.setName(jt1.getText());
										u.setPhone(jt2.getText());
										u.setSex(jt3.getText());
										u.setAddress(jt4.getText());
										u.setPassword(jt5.getText());
										
										mainpanel.Method m=new mainpanel.Method();
										try {

											m.delUser(u);

										} catch (Exception e1) {
											// TODO Auto-generated catch block

										}
									}

								} else {
									comboBox.setSelectedIndex(2);
								}
							}

						});

					} else if (comboBox.getSelectedIndex() == 2) {
						j1.setVisible(true);
						j2.setVisible(true);
						j3.setVisible(true);
						j4.setVisible(true);
						j5.setVisible(true);
						jt1.setVisible(true);
						jt2.setVisible(true);
						jt3.setVisible(true);
						jt4.setVisible(true);
						jt5.setVisible(true);
						jb.setVisible(true);
						jb11.setVisible(false);
						jb12.setVisible(false);
					}
					else if (comboBox.getSelectedIndex() == 3) {
						j1.setVisible(true);
						j2.setVisible(true);
						j3.setVisible(true);
						j4.setVisible(true);
						j5.setVisible(true);
						jt1.setVisible(true);
						jt2.setVisible(true);
						jt3.setVisible(true);
						jt4.setVisible(true);
						jt5.setVisible(true);
						jb.setVisible(false);
						jb11.setVisible(false);
						jb12.setVisible(false);
						jb12.setVisible(false);
						jb13.setVisible(true);
					}
				}
			}
		});
		jb12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 获得内容中间容器

				// 获得内容中间容器

				String name = jt1.getText();
				String phone = jt2.getText();
				String sex=jt3.getText();
				String address=jt4.getText();
				String password=jt5.getText();
				

				System.out.println(name);

				String[] colName1 = { "姓名", "手机号" ,"性别","地址","密码"};
				DefaultTableModel dt = new DefaultTableModel(colName1, 0);
				List<User> list = getList(name, phone,sex,address,password);
				for (User u : list) {
					JRadioButton r = new JRadioButton();
					dt.addRow(new String[] { (String) u.getName(),
							(String) u.getPhone(),(String) u.getSex(),(String)u.getAddress(),(String)u.getPassword() });

				}

				// DefaultTableModel dt1 = new
				// DefaultTableModel(1, 1);

				table = new JTable(dt);
				System.out.println(table.getSelectedRow());
				table.setRowHeight(30);
				table.setForeground(Color.blue);

				JScrollPane p1 = new JScrollPane(table);
				p1.setBounds(20, 0, 200, 200);

				JRadioButton r = new JRadioButton();
				r.setSize(20, 20);
				// table.add(r);
				// p1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
				p1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				// p1.setViewportView(jpCenter);
				// 移除所有组件
				pp1.removeAll();

				TableModel tableModel = table.getModel();

				table.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						int row = table.rowAtPoint(e.getPoint());
						int col = table.columnAtPoint(e.getPoint());
						System.out.println(row + "  " + col);
					}

				});

				// jpCenter.add(table);
				pp1.add(p1);

				pp1.repaint();
				// t1.setVisible(true);

				// 重新校验 控件是否有效
				revalidate();
				// 重新绘制 CenterPanel

			}
		});
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String name = jt1.getText();
				String phone = jt2.getText();
				String sex=jt3.getText();
				String address=jt4.getText();
				String password=jt5.getText();
				User u = new User();
				System.out.println(name);
				u.setName(jt1.getText());
				u.setPhone(jt2.getText());
				u.setAddress(jt4.getText());
				u.setSex(jt3.getText());
				u.setPassword(jt5.getText());

				mainpanel.Method m=new mainpanel.Method();
				m.updateUser(u);
			}
		});
		jb13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String name = jt1.getText();
				String phone = jt2.getText();
				String sex=jt3.getText();
				String address=jt4.getText();
				String password=jt5.getText();
				User u = new User();
				System.out.println(name);
				u.setName(jt1.getText());
				u.setPhone(jt2.getText());
				u.setAddress(jt4.getText());
				u.setSex(jt3.getText());
				u.setPassword(jt5.getText());

				mainpanel.Method m=new mainpanel.Method();
				m.addUser(u);
			}
		});

		// j1.setVisible(false);

		// j1.setVisible(false);

		// 设置默认选中的条目
		comboBox.setSelectedIndex(2);
		// JPanel pp=new JPanel();
		// pp.setLayout(null);
		// 添加到内容面板

		pp.add(j1);
		pp.add(j2);
		pp.add(j3);
		pp.add(j4);
		pp.add(j5);
		pp.add(jt1);
		pp.add(jt2);
		pp.add(jt3);
		pp.add(jt4);
		pp.add(jt5);
		pp.add(jb);
		pp.add(comboBox);
		pp.add(jb11);
		pp.add(jb12);
		pp.add(jb13);
		add(pp);
		add(pp1);
		jtime.setBounds(0,400, 150, 100);
		add(jtime);
	}
	public static ArrayList<User> getList(String name, String phone,String sex,String address,String password) {
		ArrayList<User> list = new ArrayList<User>();
		System.out.println(name);
		User u = null;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;

		try {
			conn = ConnUtil.getConnection();
			stm = conn.createStatement();
			String sql = "select * from userinfo where 1=1";

			if (!(name == null || "".equals(name))) {
				sql += " and name like '%" + name + "%' ";
			}
			if (!(sex == null || "".equals(sex))) {
				sql += " and sex like '%" + sex + "%' ";
			}
			if (!(phone == null || "".equals(phone))) {
				sql += " and phone like '%" + phone + "%' ";
			}
			if (!(address == null || "".equals(address))) {
				sql += " and address like '%" + address + "%' ";
			}
			
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u = new User();
				u.setSex(rs.getString("sex"));
				u.setName(rs.getString("name"));
				u.setPhone(rs.getString("phone"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));

				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnUtil.close(conn, stm, rs);
		}
		return list;
	}
}
