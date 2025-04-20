package JDBC;
import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
        import packages
        load Driver
        register Driver
        create connection
        create statement
        execute statement
        process the results
        close
        */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uName = "postgres";
        String pass = "RISHIpgsql@123";

        // queries below
        
        //String sql = "select sname from student where sid = 1";
        //String sql = "select * from student";
        //String sql = "insert into student values (6,'John', 48)";
        //String sql = "update student set sname = 'Max' where sid =5";
        String sql = "delete from student where sid=6";

        Class.forName("org.postgresql.Driver"); //load and register drivers
        Connection con = DriverManager.getConnection(url,uName,pass); //create connection
        Statement st = con.createStatement(); //create statement

//        Case-1

//        ResultSet rs = st.executeQuery(sql); // (executeStatement) use executeQuery for fetching, but use execute only when to change something
//        String nameFetched = rs.getString("sname"); // this statement doesn't clarify that foe which row you are talking
//        rs.next(); //use this then fetch the data to go to the first record o checking whether the row exists or not
//        String nameFetched = rs.getString("sname");
//        System.out.println("Congratulations Rohan ! Connection Established");
//        System.out.println("Name Fetched from PostgreSql DataBase = "+ nameFetched); //(process the data)
//        while (rs.next()) {
//            System.out.print(rs.getInt(1)+ " - ");
//            System.out.print(rs.getString(2)+ " - ");
//            System.out.println(rs.getInt(3));
//        }

//        Case-2

        System.out.println("Congratulations Rohan ! Connection Established");
        st.execute(sql); //it gives false as it executes not executeQuery as seen above gives true






        con.close(); // Close the connection
        System.out.println("Connection closed");
    }
}
