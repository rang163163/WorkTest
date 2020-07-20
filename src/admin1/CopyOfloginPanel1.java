package admin1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import admin.ConnUtil;

public class CopyOfloginPanel1 extends JPanel {
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

	public CopyOfloginPanel1() {

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
		
		j1 = new JLabel("����   ��");
		j2 = new JLabel("�ֻ��ţ�");
		j3 = new JLabel("��ַ   ��");
		j4 = new JLabel("�Ա�   ��");
		j5 = new JLabel("��ַ   ��");
		jt1 = new JTextField(10);
		jt2 = new JTextField(10);
		jt3 = new JTextField(10);
		jt4 = new JTextField(10);
		jt5 = new JTextField(10);
		jb = new JButton("��ʼ");
		jb13 = new JButton("��ʼ");
		jb11 = new JButton("ɾ��");
		jb12 = new JButton("��ѯ");
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

		String[] listData = new String[] { "������Ϣ", "ɾ����Ϣ", "�޸���Ϣ", "�����Ϣ" };

		comboBox = new JComboBox<String>(listData);

		comboBox.setBounds(150, 0, 100, 30);
		// �����Ŀѡ��״̬�ı�ļ�����
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				if (e.getStateChange() == ItemEvent.SELECTED) {

					System.out.println("ѡ��: " + comboBox.getSelectedIndex()
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
										"����������");
								if (s.equals("234"))
								// ��������м�����
								{
									// ��������м�����
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
												User u = new User();
												u.setName(s1);
												u.setPw(s2);
												Method m = new Method();
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
										String pw = jt2.getText();
										User u = new User();
										System.out.println(user);
										u.setName(jt1.getText());
										u.setPw(jt2.getText());

										Method m = new Method();
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

				// ��������м�����

				// ��������м�����

				String user = jt1.getText();
				String pw = jt2.getText();

				System.out.println(user);

				String[] colName1 = { "����", "����" };
				DefaultTableModel dt = new DefaultTableModel(colName1, 0);
				List<User> list = getList(user, pw);
				for (User u : list) {
					JRadioButton r = new JRadioButton();
					dt.addRow(new String[] { (String) u.getName(),
							(String) u.getPw() });

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
				// �Ƴ��������
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

				// ����У�� �ؼ��Ƿ���Ч
				revalidate();
				// ���»��� CenterPanel

			}
		});
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String user = jt1.getText();
				String pw = jt2.getText();
				User u = new User();
				System.out.println(user);
				u.setName(jt1.getText());
				u.setPw(jt2.getText());

				Method m = new Method();
				m.updateUser(u);
			}
		});
		jb13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String user = jt1.getText();
				String pw = jt2.getText();
				User u = new User();
				System.out.println(user);
				u.setName(jt1.getText());
				u.setPw(jt2.getText());

				Method m = new Method();
				m.addUser(u);
			}
		});

		// j1.setVisible(false);

		// j1.setVisible(false);

		// ����Ĭ��ѡ�е���Ŀ
		comboBox.setSelectedIndex(2);
		// JPanel pp=new JPanel();
		// pp.setLayout(null);
		// ��ӵ��������

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

	public static ArrayList<User> getList(String name, String password) {
		ArrayList<User> list = new ArrayList<User>();
		System.out.println(name);
		User u = null;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;

		try {
			conn = ConnUtil.getConnection();
			stm = conn.createStatement();
			String sql = "select * from user where 1=1";

			if (!(name == null || "".equals(name))) {
				sql += " and name like '%" + name + "%' ";
			}
			if (!(password == null || "".equals(password))) {
				sql += " and pw like '%" + password + "%' ";
			}

			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPw(rs.getString("pw"));

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
