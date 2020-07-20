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
			String sql1="select * from user where name='"+u.getName()+"'";
			
			rs=stm.executeQuery(sql1);
			if(rs.next()){
				JOptionPane.showMessageDialog(null, "信息存在！");
				ConnUtil.close(conn, stm, null);
			}
			else
			{
				String sql = "insert into user(name,pw) values('"+u.getName()+"','"+u.getPw()+"')";
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
			String sql="update user set name='"+u.getName()+"' where pw='"+u.getPw()+"'";
			
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
						String sql = "delete from user where name='"+u.getName()+"' and pw='"+u.getPw()+"'";
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
	public static User getUserById(int id) {
		User user = null;
		
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			conn = ConnUtil.getConnection();
			stm = conn.createStatement();
			String sql = "select * from user where id="+id;
			rs = stm.executeQuery(sql);
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPw(rs.getString("pw"));
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			ConnUtil.close(conn, stm, rs);
		}
			
		return user;
	}
}
