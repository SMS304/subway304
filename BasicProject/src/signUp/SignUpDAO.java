package signUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class SignUpDAO {
	private static SignUpDAO instance = new SignUpDAO();
	private SignUpDAO() {
	}
	public static SignUpDAO getInstance() {
		return instance;
	}
	
	public int insertLogin(SignUpVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.34.16:1521:xe", "project_team1", "sand");
		Statement statement = connection.createStatement();
		StringBuilder builder =new StringBuilder();
		builder.append(" INSERT INTO MEMBER (");
		builder.append("     MEM_ID,");
		builder.append("     MEM_PASSWORD,");
		builder.append("     MEM_NAME,");
		builder.append("     MEM_PHONE");
		builder.append(" ) VALUES (");
		builder.append("     '"+vo.getMemid()+"',");
		builder.append("     '"+vo.getMempassword()+"',");
		builder.append("     '"+vo.getMemname()+"',");
		builder.append("     '"+vo.getMemphone()+"'");
		builder.append(" )");		
		String sql = builder.toString();
		int add = statement.executeUpdate(sql);
		statement.close();
		connection.close();
		return add;
	}
}
