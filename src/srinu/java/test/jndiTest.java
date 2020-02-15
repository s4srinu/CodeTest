package srinu.java.test;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class jndiTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws NamingException ,SQLException{
		// TODO Auto-generated method stub

/*	Use the following steps to create a wlfullclient.jar file for a client application:
 	Change directories to the server/lib directory.
		 cd WL_HOME/server/lib
	2	Use the following command to create wlfullclient.jar in the server/lib directory:
		 java -jar ../../../modules/com.bea.core.jarbuilder_X.X.X.X.jar
		where X.X.X.X is the version number of the jarbuilder module in the WL_HOME/server/lib directory. For example:

	3	 java -jar ../../../modules/com.bea.core.jarbuilder_1.0.1.0.jar
		You can now copy and bundle the wlfullclient.jar with client applications.
	4	Add the wlfullclient.jar to the client application’s classpath.*/
		
		//Set the classpath= wlclient.jar

		Hashtable h=new Hashtable();
		h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		h.put(Context.PROVIDER_URL, "t3://localhost:7001");
		h.put(Context.SECURITY_PRINCIPAL, "weblogic");
		h.put(Context.SECURITY_CREDENTIALS, "passw0rd");
	
		InitialContext ic=new InitialContext(h);
		
/*		String name="sai";
		ic.bind("uname", name);*/
		
/*		Object o = ic.lookup("uname");
		String s = (String)o;
		System.out.println(s);*/
		
		//ic.rebind("uname", "ShragviP");
		
		//ic.unbind("uname");
		
		/*ic.createSubcontext("srinu");
		ic.createSubcontext("srinu.god");
*/		
		
		//ic.bind("srinu.god.name", "sai");
		
/*		Object o = ic.lookup("srinu.god.name");
		String s = (String)o;
		System.out.println(s);*/
		
		//ic.unbind("srinu.god.name");
		
		//ic.destroySubcontext("srinu.god");
	
		//get Connection from pool
		
		Object o = ic.lookup("eoasis");
		DataSource ds = (DataSource)o;
		Connection con=ds.getConnection();
		String query = "select ename from emp where empno =7900";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()){
			System.out.println("ename is:"+rs.getString(1));
			
		}
	

				
	}

}
