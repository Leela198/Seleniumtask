package TestNGpractice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1
{
@Test
public void login_to_Amazon()
{
	System.out.println("login");
}
@BeforeSuite
public void bs()
{
	System.out.println("beforesuit");
}
@AfterSuite
public void as()
{
	System.out.println("Aftersuite");
}
@BeforeTest
public void bt()
{
	System.out.println("beforetest");
}
@AfterTest
public void at()
{
	System.out.println("aftertest");
}
@BeforeClass
public void Bclass()
{
	System.out.println("beforeclass");
}

@AfterClass
public void Aclass()
{
	System.out.println("afterclass");
}

@BeforeMethod
public void beforemethod()
{
	System.out.println("beforemethod");
}

@AfterMethod
public void Ametho()
{
	System.out.println("aftermethod");
}

@BeforeTest
public void beforetest()
{
	System.out.println("beforetest");
}

@AfterTest
public void Aftertest()
{
	System.out.println("aftertest");
}

}
