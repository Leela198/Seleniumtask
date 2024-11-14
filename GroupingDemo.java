package grouping;
import org.testng.annotations.Test;

public class GroupingDemo
{
@Test(groups= {"system"})
public void m1()
{
	System.out.println("system testing");
}
@Test(groups= {"system","smoke"})
public void m2()
{
	System.out.println("system  and smoke testing");
}
@Test(groups= {"integration"})
public void m3()
{
	System.out.println("integration testing");
}
@Test(groups= {"regression"})
public void m4()
{
	System.out.println("regression testing");
}
@Test(groups= {"system"})
public void m5()
{
	System.out.println("system testing");
}
}
