package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FivefieldRegistratoinDemo
{
	
	@DataProvider(name="data10")
	public Object[][] dpmethod()
	{
		Object data[][]=new Object[10][5];
		//ist row
		data[0][0]="leela";
		data[0][1]="rani";
		data[0][2]="02-07";
		data[0][3]='f';
		data[0][4]="lee@gmail.com";
		//2nd row
				data[1][0]="leela";
				data[1][1]="rani";
				data[1][2]="02-07";
				data[1][3]='f';
				data[1][4]="lee@gmail.com";
				//3rd row
				data[2][0]="tanni";
				data[2][1]="reddy";
				data[2][2]="27-04";
				data[2][3]='f';
				data[2][4]="tanni@gmail.com";
				//4th row
				data[3][0]="shresta";
				data[3][1]="reddy";
				data[3][2]="01-02";
				data[3][3]='f';
				data[3][4]="shresta@gmail.com";
				//5th row
				data[4][0]="siri";
				data[4][1]="reddy";
				data[4][2]="07-12";
				data[4][3]='f';
				data[4][4]="siri@gmail.com";
				//6th row
				data[5][0]="siva";
				data[5][1]="reddy";
				data[5][2]="12-11";
				data[5][3]='m';
				data[5][4]="shiv@gmail.com";
				//7th row
				data[6][0]="rab";
				data[6][1]="bani";
				data[6][2]="07-09";
				data[6][3]='m';
				data[6][4]="raddu@gmail.com";
				//8th row
				data[7][0]="bunny";
				data[7][1]="bash";
				data[7][2]="11-07";
				data[7][3]='m';
				data[7][4]="bunny@gmail.com";
				//9th row
				data[8][0]="sunny";
				data[8][1]="sam";
				data[8][2]="11-10";
				data[8][3]='f';
				data[8][4]="sam@gmail.com";
				//1oth row
				data[9][0]="naren";
				data[9][1]="reddy";
				data[9][2]="14-11";
				data[9][3]='m';
				data[9][4]="naren@gmail.com";
				return data;
	}
@Test(dataProvider="data10")
public void tenregistration(String fname,String lname,String dob,char gender,String email)
{
	System.out.println("first name is.."+fname);
	System.out.println("last name is.."+lname);
	System.out.println("DOB is......"+dob);
	System.out.println("Gender male/female.."+gender);
	System.out.println("EMAIL ID.."+email);
}
}
