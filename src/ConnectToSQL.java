
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectToSQL{

	
		
		String sql;
		
		
		
		public void connect(String name, String email, String eduAll, String workAll, String skillAll){
		

		
		
		
		
			sql = "insert into Resume(name, email, eduAll, workAll, skillAll)values(?,?,?,?,?)";

			System.out.println(sql);
		
		
		Connection con = null;
		
		
		
		ResultSet rs = null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Resumebuilder?"+ "user=root&password=password");
            pstmt = con.prepareStatement(sql);
                		
     
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, eduAll);
            pstmt.setString(4, workAll);
            pstmt.setString(5, skillAll);
            pstmt.executeUpdate();
           
            }
		/*
		while(rs.next()){
			System.out.print(rs.getString("FirstName") + "\t");
			System.out.print(rs.getString("LastName"));
			System.out.println();
		}
		*/
		catch (SQLException e){

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}