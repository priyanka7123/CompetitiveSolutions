package UserAuthentication.Authentication_1;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthTest {

    private UserAuthentication user;
    private static int count;	
    
	@BeforeEach
	public void before() {
		user= new UserAuthentication();
		System.out.println("Authentication User main class inititated");
		count++;
		System.out.println("Test "+ count);
	}
	
	@AfterEach
	public void after() {
		user=null;
		System.out.println("Class Closed");
	}
	
	@Test
	public void checkUser() {
		assertEquals("priyanka@gmail.com", user.username());
	}
	@Test
	public void UserNotNull()
	{
		assertNotNull(user.username());
	}
	
	@Test
	public void checkPassword() {
		assertEquals("panda@28", user.paswd());
	}
	
	@Test
	public void PasswordNotNUll()
	{
		assertNotNull(user.paswd());
	}
	
	@Test
	public void checkUserRegex()
	{
		String email = user.username();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		assertEquals(true, matcher.matches());
	}
}