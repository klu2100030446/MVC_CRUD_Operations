package MVCModel;
import java.sql.*;
import java.util.*;
public class MVCLogic 
{
	String dburl = "jdbc:mysql://localhost:3306/project";
	String dbun = "root";
	String dbpw = "Charan@2004";
	Connection con =null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public boolean MVCValidate (MVCData md) throws Exception
	{
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("select count(*) from login where username = ? and password = ?");
		ps.setString(1, md.getUsername());
		ps.setString(2, md.getPassword());
		rs = ps.executeQuery();
		if(rs.next())
		{
			if(rs.getInt(1) == 1)
			{
				return true;
			}
			else
			{	
				return false;
			}
		}
		return false;
	}
	
	public List<MVCData> MVCgetALL () throws Exception
	{
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("select * from customer");
		rs = ps.executeQuery();
		List<MVCData> L = new ArrayList<MVCData>();
		while(rs.next())
		{
			MVCData md = new MVCData();
			md.setUsername(rs.getString(1));
			md.setPassword(rs.getString(2));
			L.add(md);
		}
		con.close();
		return L;
		
		
	}
	public boolean insertData (MVCData md) throws Exception
	{
		try {
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		Statement st = con.createStatement();
		 st.executeUpdate("insert into customer values ('"+md.getUsername()+"','"+md.getPassword()+"')");
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean updateData (MVCData md) throws Exception
	{
		try {
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("update customer set password=? where username=?");
		ps.setString(1, md.getPassword());
		ps.setString(2,md.getUsername());
		 ps.execute();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean deleteData (MVCData md) throws Exception
	{
		try {
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("delete from customer where username=?");
		ps.setString(1, md.getUsername());
		 ps.execute();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public List<MVCData> searchData (String S) throws Exception
	{
		con = DriverManager.getConnection(dburl, dbun,dbpw);
		ps = con.prepareStatement("select * from customer where username=?");
		ps.setString(1, S);
		rs = ps.executeQuery();
		List<MVCData> L = new ArrayList<MVCData>();
		while(rs.next())
		{
			MVCData mdout = new MVCData();
			mdout.setUsername(rs.getString(1));
			mdout.setPassword(rs.getString(2));
			L.add(mdout);
		}
		con.close();
		return L;
		
		
	}
}
