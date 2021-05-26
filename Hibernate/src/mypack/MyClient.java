package mypack;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class MyClient 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("HibernateDemo.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		System.out.println("Enter the number");
		Integer eno=input.nextInt();
		System.out.println("Enter the name");
		String ename=input.next();
		System.out.println("Enter the salary");
		Integer esal=input.nextInt();
		
		Employee e=new Employee();
		e.setEname(ename);
		e.setEno(eno);
		e.setEsal(esal);
		s.save(e);
		Transaction t=s.beginTransaction();
		t.commit();
		
		s.close();
		sf.close();
		
		System.out.println("Save........");
		
	}	
}
