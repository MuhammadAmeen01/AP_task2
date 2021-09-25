package javaTask2;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testcases {
	static customer c;
	static customer c1;
	static customer c2;
	static customer c3;
	static accounts a;
	static accounts a1;
	static accounts a2;
	static accounts a3;
	static accounts a4;
	static Admin ad;
	static int admin_password;
	static int adminno;
	static LinkedList<accounts> linked_list = new LinkedList<accounts>();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

			Random rnd = new Random();
			int n1 = 100000 + rnd.nextInt(900000);
			c=new customer("Ameen","street1","saving",0223);
			c1=new customer("Gulsher","RW","checking",0243);
			c2=new customer("Azka","F7","saving",2112);
			c3=new customer("Vara","I8","checking",0113);
			a=new accounts(c,n1,9000,0,0,true,false);
			n1=100000 + rnd.nextInt(900000);
		    a1=new accounts(c1,0,0,n1,33000,false,true);
		    n1=100000 + rnd.nextInt(900000);
		    a2=new accounts(c2,n1,10000,0,0,true,false);
		    n1=100000 + rnd.nextInt(900000);
		    a3=new accounts(c3,0,0,n1,3000,false,true);
		    
		    
		    linked_list.add(a);
		    linked_list.add(a1);
		    linked_list.add(a2);
		    linked_list.add(a3);
			adminno = 100000 + rnd.nextInt(900000);
			admin_password=100000 + rnd.nextInt(900000);
			ad=new Admin("Rafay",adminno,admin_password);
			
			
			/*Random rnd = new Random();
			int n = 100000 + rnd.nextInt(900000);
			 c=new customer("Ameen","street1","saving",0223);
			 a=new accounts(c,n,9000,0,0,true,false);
			int n1 = 100000 + rnd.nextInt(900000);
		    c1=new customer("Gulsher","RW","checking",0243);
		    a1=new accounts(c1,0,0,n1,33000,false,true);
		   linked_list=new accounts();*/
		}


	
	//linked_list.add_node1(a);
	@Test 
	public void add_node()
	{
		/*linked_list.add_node1(a);
		linked_list.add_node1(a1);*/
		
		
	   // accounts linked_list=new accounts();
		//System.out.print(a1.checking_account_no+"\n");

	}
	@Test 
	public void test_login()
	{//System.out.print("lol "+a1.checking_account_no+"\n");
		//linked_list.printStatement(a.checking_account_no);
		//System.out.print(a+linked_list.login(a)+"\n");
		assertEquals(a,accounts.login(linked_list,a));
	}
	@Test 
	public void test_login1()
	{//System.out.print("lol "+a1.checking_account_no+"\n");
		//linked_list.printStatement(a.checking_account_no);
		//System.out.print(a+linked_list.login(a)+"\n");
		assertEquals(a1,accounts.login(linked_list,a1));
	}
	//a.add_node1(a);
	//@Test 


	/*@Test 
    public void add_another_checking_account()
	{
		
		assertEquals(0,accounts.add_another_account1(a.checking_account_no));
	}*/
	
	@Test 
	public void makeDeposit()
	{
		
		//a.add_node();
		assertEquals(1,accounts.makeDeposit(a,"saving",a1,"checking",900));
	}
	@Test 
	public void makeDeposit_1()
	{
		
		//a.add_node();
		assertEquals(1,accounts.makeDeposit(a,"checking",a1,"saving",900));
	}
	@Test
	public void makeDeposit_2()
	{
		
		//a.add_node();
		assertEquals(0,accounts.makeDeposit(a,"saving",a1,"checking",-1));
	}
	@Test
	public void makewithdrawal()
	{
		
		//a.add_node();
		assertEquals(1,accounts.makewithdrawal1(a,900));
	}
	@Test
	public void makewithdrawal_1()
	{
		
		//a.add_node();
		assertEquals(0,accounts.makewithdrawal1(a,-1));
	}
	@Test
	public void makewithdrawa2()
	{
		
		//a.add_node();
		assertEquals(1,accounts.makewithdrawal1(a1,900));
	}
	@Test 
	public void add_another_saving_account()
	{
	//	System.out.print("saving account must exist\n");
		assertEquals(0,accounts.add_another_account1(a,"saving",100000));
	}
	@Test 
	public void add_another_saving_account_1()
	{

		assertEquals(1,accounts.add_another_account1(a,"checking",100000));
	}
	@Test 
	public void check_another_account()
	{
		
		assertEquals(0,accounts.add_another_account1(a1,"checking",1000000));
	}
	@Test 
	public void add_another_saving_account_2()
	{
	//	System.out.print("saving account must exist\n");
		assertEquals(1,accounts.add_another_account1(a1,"saving",100000));
	}
	//@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	@Test
	public void check_balance()
	{
		
		//a.add_node();
		
		assertEquals(true,accounts.checkBalance(a,"saving"));
	}
	@Test
	public void check_balance_1()
	{
		
		//a.add_node();
		
		assertEquals(true,accounts.checkBalance(a1,"checking"));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void transfer()
	{
		//System.out.print("Result1 "+accounts.transfer1(a,"saving",a1,"checking",100)+"\n");
		assertEquals(7000,accounts.transfer1(a,"saving",a1,"checking",100));
	}
	@Test
	public void transfer1()
	{
		//System.out.print("Result2 "+accounts.transfer1(a,"saving",a1,"saving",100)+"\n");
		assertEquals(7100,accounts.transfer1(a,"saving",a1,"saving",100));
	}
	@Test
	public void transfer2()
	{
		//System.out.print("Result2 "+accounts.transfer1(a,"checking",a1,"saving",100)+"\n");
		assertEquals(-100,accounts.transfer1(a,"checking",a1,"saving",100));
	}
	@Test
	public void transfer3()
	{
		//System.out.print("Result3 "+accounts.transfer1(a,"checking",a1,"checking",100)+"\n");
		assertEquals(-200,accounts.transfer1(a,"checking",a1,"checking",100));
	}
	@Test
	public void test_zaqat()
	{
		//System.out.print("Result4 "+accounts.calculateZakat1(a1)+"\n");
		assertEquals(1,accounts.calculateZakat1(linked_list, a1));
	}
	@Test
	public void test_zaqat1()
	{
		//System.out.print("Result4 "+accounts.calculateZakat1(a)+"\n");
		assertEquals(202,accounts.calculateZakat1(linked_list,a));
	}
	@Test
	public void test_all_deduction()
	{
		//System.out.print("Result5 "+accounts.displayAllDeductions(a)+"\n");
		assertEquals(190,accounts.displayAllDeductions(linked_list,a));
	}
	@Test
	public void showdetails()
	{
		//accounts.displayAllDeductions(a);
		assertEquals(true,accounts.show_details(a));
	}
	@Test
	public void testPrintstatments()
	{
		//accounts.displayAllDeductions(a);
	
			a.printStatement(linked_list, a);
	
	}
	@Test
	public void showdetails1()
	{
		//accounts.displayAllDeductions(a);
		assertEquals(true,accounts.show_details(a1));
	}
	@Test
	public void test_admin_login()
	{
		assertEquals(true,ad.login1(adminno,admin_password));
	}
	@Test
	public void test_admin_login1()
	{
		assertEquals(false,ad.login1(282399,220833));
	}
	
	@Test
	public void admindelete()
	{
		assertEquals(1,ad.delete_account(linked_list, a1));
	}
	@Test
	public void admindelete1()
	{
		assertEquals(0,ad.delete_account(linked_list, a4));
	}
	@Test
	public void test_intrest()
	{
		assertEquals(1,accounts.calculatelnterest(a));
	}
	@Test
	public void test_intrest1()
	{
		assertEquals(0,accounts.calculatelnterest(a3));
	}
	
	
}
