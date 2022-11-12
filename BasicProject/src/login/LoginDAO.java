package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class LoginDAO {
	private static LoginDAO instance = new LoginDAO();
	private LoginDAO() {
	}
	public static LoginDAO getInstance() {
		return instance;
	}
	
	public LoginVO getLogin(String id,String pw) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.34.16:1521:xe", "project_team1", "sand");
		Statement statement = connection.createStatement();
		StringBuilder builder =new StringBuilder();
		builder.append(" SELECT");
		builder.append("     mem_id,");
		builder.append("     mem_password");
		builder.append(" FROM");
		builder.append("     member");	
		builder.append(" WHERE");
		builder.append("     mem_id = '" + id + "'" );
		builder.append("     AND mem_password = '" + pw + "'");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		LoginVO vo = null;
		while (resultSet.next()) {
			String memid = resultSet.getString("mem_id");
			String mempw = resultSet.getString("mem_password");
			vo = new LoginVO(memid,mempw);
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		return vo;
	}
	
}
