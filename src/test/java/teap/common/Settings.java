package teap.common;

public interface Settings 
{
	//App settings
	public static final String URL="http://52.69.206.80/crg/login/user";
	
	//Rating Leader User Credentials
	public static final String RL_USER_ID="RL1";
	public static final String RL_PASSWORD="#Zpass000";
	
	//Rater User Credentials
	public static final String RT_USER_ID="RT1";
	public static final String RT_PASSWORD="#Zpass000";
	
	//DB Settings
	public static final String DB_HOST="localhost";
	public static final String DB_PORT="3306";
	public static final String DB_NAME="cbt_pf_crg";
	public static final String DB_URL = "jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME;					
	public static final String DB_USERNAME = "admin";	
	public static final String DB_PASSWORD = "1EORE9SV";

}
