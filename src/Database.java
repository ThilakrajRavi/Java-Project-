/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThilakrajRavi
 */
import java.sql.*;
public class Database
{
  public static void main(String[] args) {
  try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database01","root","Rthilakraj2000");
//here sonoo is database name, root is username and password
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student where name='thilak'");
while(rs.next()){
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3));}
con.close();
}catch(Exception e){ System.out.println(e);}
}
}
