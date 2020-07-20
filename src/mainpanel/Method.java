package mainpanel;
import test.*;
import util.*;
import dao.*;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
public class Method {

	public int addUser(User u){
		int result = 0;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs=null;
		conn=ConnUtil.getConnection();
		try {
			stm=conn.createStatement();
			String sql1="select * from userinfo where name='"+u.getName()+"'";
			
			rs=stm.executeQuery(sql1);
			if(rs.next()){
				JOptionPane.showMessageDialog(null, "信息存在！");
				ConnUtil.close(conn, stm, null);
			}
			else
			{
				String sql = "insert into userinfo(name,phone,sex,password,address)"+" values('"+u.getName()+"','"+u.getPhone()+"','"+u.getSex()+"','"+u.getPassword()+"','"+u.getAddress()+"')";
				result = stm.executeUpdate(sql);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnUtil.close(conn, stm, null);
		}
		
		if(result>0){
			JOptionPane.showMessageDialog(null, "添加成功！");;
		}
		return result;
		
		
	}
	public int updateUser(User u){
		int result = 0;
		Connection conn = null;
		Statement stm = null;
		
		try{
			conn = ConnUtil.getConnection();
			stm = conn.createStatement();
			String sql="update userinfo set name='"+u.getName()+"' where phone='"+u.getPhone()+"'";
			
			result = stm.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			ConnUtil.close(conn, stm, null);
		}
		if(result>0){
			JOptionPane.showMessageDialog(null, "修改成功！");;
		}
		if(result<=0){
			JOptionPane.showMessageDialog(null, "信息不存在或信息不正确！");
		}
		return result;
	}
	public int delUser(User u){
		System.out.println(123);
		int result = 0;
		Connection conn = null;
		Statement stm = null;
		ResultSet rs=null;
		conn = ConnUtil.getConnection();

					try{
						
						stm = conn.createStatement();
						String sql = "delete from userinfo where name='"+u.getName()+"' and phone='"+u.getPhone()+"'";
						result = stm.executeUpdate(sql);
			           
					}catch(Exception ex){
						ex.printStackTrace();
					}finally{
						ConnUtil.close(conn, stm, rs);
					}
					if(result>0){
						JOptionPane.showMessageDialog(null, "删除成功！");;
					}
					if(result<=0){
						JOptionPane.showMessageDialog(null, "信息不存在或信息不正确！");;
					}
			
			
			
		return result;
	}
	public static User getUserById(String phone) {
		User user = null;
		
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			conn = ConnUtil.getConnection();
			stm = conn.createStatement();
			String sql = "select * from userinfo where phone="+phone;
			rs = stm.executeQuery(sql);
			if(rs.next()) {
				user = new User();
				user.setPhone(rs.getString("phone"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setAddress(rs.getString("address"));
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			ConnUtil.close(conn, stm, rs);
		}
			
		return user;
	}
}
