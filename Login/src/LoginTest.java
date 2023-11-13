import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {

		    @Test
		    public void testSuccessfullLogin(){
		        LoginScreen loginScreen = new LoginScreen();
		        assertTrue(loginScreen.login("john", "password123"));
		    }
		    
		    @Test
		    public void testFailedLogin(){
		        LoginScreen loginScreen = new LoginScreen();
		        assertFalse(loginScreen.login("john", "wrongpassword"));
		    }
		    
		    @Test
		    public void testAddUser(){
		        LoginScreen loginScreen = new LoginScreen();
		        loginScreen.addUser("testuser", "testpassword");
		        assertTrue(loginScreen.login("testuser", "testpassword"));
		    }	

	}

