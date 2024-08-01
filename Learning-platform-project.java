package Registration;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class App implements ActionListener{
	Frame f=new Frame();
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
		App(){
			l1=new Label("name");
			l2=new Label("username");
			l3=new Label("password");
			l4=new Label("address");
			t1=new TextField();
			t2=new TextField();
			t3=new TextField();
			t4=new TextField();
			b1=new Button("Register");
			b2=new Button("login");
			f.add(l1);
			f.add(t1);
			f.add(l2);
			f.add(t2);
			f.add(l3);
			f.add(t3);
			f.add(l4);
			f.add(t4);
			f.add(b1);
			f.add(b2);
			f.setVisible(true);
			f.setSize(200,200);
			l1.setBounds(50,100,60,20);
			t1.setBounds(120,100,200,20);
			l2.setBounds(50,200,60,20);
			t2.setBounds(120,200,200,20);
	        l3.setBounds(50,300,60,20);
			t3.setBounds(120,300,200,20);
			l4.setBounds(50,400,60,20);
			t4.setBounds(120,400,200,20);
			b1.setBounds(80,600,100,20);
			b2.setBounds(200,600,100,20);
			f.setLayout(null);
			b1.addActionListener(this);
			b2.addActionListener(this);
			}
			public void actionPerformed(ActionEvent ae)
			{
					if(ae.getSource()==b1) {
						String s1=t1.getText();
						String s2=t2.getText();
						String s3=t3.getText();
						String s4=t4.getText();
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
						
					       String url="jdbc:mysql://localhost:3306/regdb";
					       String user="root";
					       String password="";
					       Connection myconn=DriverManager.getConnection(url,user,password);
					       Statement mystmt=myconn.createStatement();
					       mystmt.executeUpdate("insert into registration values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					}
							else
							{
								Frame f2=new Frame();
								f2.setVisible(true);
								l2=new Label("username");
								l3=new Label("password");
								t1=new TextField();
								t2=new TextField();
								b3=new Button("login");
								f2.add(l2);
								f2.add(t1);
								f2.add(l3);
								f2.add(t2);
								f2.add(b3);
								f2.setSize(200,200);
								l2.setBounds(50,200,80,30);
								l3.setBounds(50,300,80,30);
								t1.setBounds(200,200,100,30);
								t2.setBounds(200,300,100,30);
								b3.setBounds(75,500,80,30);
								f2.setLayout(null);
								f2.setVisible(true);
								b3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent ap) {
									if(ap.getSource()==b3) {
										String s5=t1.getText();
										System.out.print(s5);
										System.out.print(s5);
										String s6=t2.getText();
										try
										{
											Class.forName("com.mysql.jdbc.Driver");
								
											String url="jdbc:mysql://localhost:3306/regdb";
											String user="root";
											String password="";
											Connection myconn=DriverManager.getConnection(url,user,password);
											Statement mystmt=myconn.createStatement();
											ResultSet rs=mystmt.executeQuery("select password from registration where username='"+s5+"'");
											if(rs.next())
											{
												String ps=rs.getString(1);
												if(ps.equals(s6)) 
												{
													System.out.println("success"); 
													Frame f3=new Frame();
													Label L1=new Label("JAVA");
													Label L2=new Label("PYTHON");
													Label L3=new Label("MYSQL");
													Label L4=new Label("HTML");
													Label L5=new Label("CSS");
													Button B1=new Button("ENROLL");
													Button B2=new Button("ENROLL");
													Button B3=new Button("ENROLL");
													Button B4=new Button("ENROLL");
													Button B5=new Button("ENROLL");
													f3.setVisible(true);
													f3.add(L1);
													f3.add(B1);
													f3.add(L2);
													f3.add(B2);
													f3.add(L3);
													f3.add(B3);
													f3.add(L4);
													f3.add(B4);
													f3.add(L5);
													f3.add(B5);
													f3.setSize(300,300);
													L1.setBounds(200,100,90,50);
													L2.setBounds(200,200,90,50);
													L3.setBounds(200,300,90,50);
													L4.setBounds(200,400,90,50);
													L5.setBounds(200,500,90,50);
													B1.setBounds(400,100,100,40);
													B2.setBounds(400,200,100,40);
													B3.setBounds(400,300,100,40);
													B4.setBounds(400,400,100,40);
													B5.setBounds(400,500,100,40);
													f3.setLayout(null);
													B1.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent Ae1) {
															Frame m1=new Frame();
															Label e1=new Label("Basics of oops");
															Label e2=new Label("Abstraction");
															Label e3=new Label("Inheritance");
															Label e4=new Label("Polymorphism");
															Label e5=new Label("Encapsulation");
															Label e6=new Label("Datatypes");
															Label e7=new Label("Loops");
															Label e8=new Label("Functions");
															Label e9=new Label("IO operations");
															Label e10=new Label("Garbage collection");
															Label e11=new Label("Collection Framework");
															Label e12=new Label("AWT");
															Label e13=new Label("Swings");
															Label e14=new Label("JVM Architechture");
															Button B1=new Button("TAKE TEST");
															m1.setVisible(true);
															m1.add(B1);
															m1.add(e1);
															m1.add(e2);
															m1.add(e3);
															m1.add(e4);
															m1.add(e5);
															m1.add(e6);
															m1.add(e7);
															m1.add(e8);
															m1.add(e9);
															m1.add(e10);
															m1.add(e11);
															m1.add(e12);
															m1.add(e13);
															m1.add(e14);
															m1.setSize(300,300);
															e1.setBounds(200,100,200,50);
														    e2.setBounds(200,150,200,50); 
														    e3.setBounds(200,200,200,50); 
													        e4.setBounds(200,250,200,50); 
													        e5.setBounds(200,300,200,50); 
														    e6.setBounds(200,350,200,50); 
													        e7.setBounds(200,400,200,50);
														    e8.setBounds(600,100,200,50); 
														    e9.setBounds(600,150,200,50); 
														    e10.setBounds(600,200,200,50); 
														    e11.setBounds(600,250,200,50); 
														    e12.setBounds(600,300,200,50);
														    e13.setBounds(600,350,200,50); 
														    e14.setBounds(600,400,200,50); 
														    B1.setBounds(320,500,200,50); 
															m1.setLayout(null);
															B1.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent ae1) {
																    TextField t1=new TextField();
																	TextField t2=new TextField();
																	TextField t3=new TextField();
																	TextField t4=new TextField();
																	TextField t5=new TextField();
																	Button b1=new Button("Submit");
																	Frame h1=new Frame();
																	Label l1=new Label("1. Which component is used to compile, debug and execute the java programs?");
																	Label l2=new Label("a) JRE" +"         " +
																			"b) JIT" + "          "+
																			"c) JDK" + "          "+
																			"d) JVM");
																	Label l3=new Label("2. Which of these cannot be used for a variable name in Java?");
																	Label l4=new Label("a) identifier & keyword" + "          "+
																			"b) identifier" + "         "+
																			"c) keyword" + "         "+  
																			"d) none of the mentioned");
																	Label l5=new Label("3. What is the extension of java code files?");
																	Label l6=new Label("a) .js" + "          "+
																			"b) .txt" + "          "+
																			"c) .class" + "          "+
																			"d) .java");
																	Label l7=new Label("4. Which of the following is not an OOPS concept in Java?");
																	Label l8=new Label("a) Polymorphism" + "          "+
																			"b) Inheritance" + "          "+
																			"c) Compilation" + "          "+
																			"d) Encapsulation");
																	Label l9=new Label("5. Which exception is thrown when java is out of memory?");
																	Label l10=new Label("a) MemoryError" + "          "+
																			"b) OutOfMemoryError" + "          "+
																			"c) MemoryOutOfBoundsException" + "          "+
																			"d) MemoryFullException");
																	
																	h1.setLayout(null);
																	h1.setSize(300,300);
																	h1.setVisible(true);
																	h1.add(l1);
																	h1.add(l2);
																	h1.add(l3);
																	h1.add(l4);
																	h1.add(l5);
																	h1.add(l6);
																	h1.add(l7);
																	h1.add(l8);
																	h1.add(l9);
																	h1.add(l10);
																	h1.add(t1);
																	h1.add(t2);
																	h1.add(t3);
																	h1.add(t4);
																	h1.add(t5);
																	h1.add(b1);
																	l1.setBounds(50,75,900,40);
																	l2.setBounds(50,120,900,40);
																	l3.setBounds(50,165,900,40);
																	l4.setBounds(50,210,900,40);
																	l5.setBounds(50,255,900,40);
																	l6.setBounds(50,300,900,40);
																	l7.setBounds(50,345,900,40);
																	l8.setBounds(50,390,900,40);
																	l9.setBounds(50,435,900,40);
																	l10.setBounds(50,480,900,40);
																	t1.setBounds(950,75,50,20);
																	t2.setBounds(950,165,50,20);
																	t3.setBounds(950,255,50,20);
																	t4.setBounds(950,345,50,20);
																	t5.setBounds(950,435,50,20);
																	b1.setBounds(500,570,150,50);
																	b1.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent ae) {
																			String[] arr=new String[10];
																			arr[0]="c";
																			arr[1]="c";
																			arr[2]="d";
																			arr[3]="c";
																			arr[4]="c";
																			String[] ans=new String[10];
																			ans[0]=t1.getText();
																			ans[1]=t2.getText();
																			ans[2]=t3.getText();
																			ans[3]=t4.getText();
																			ans[4]=t5.getText();
																			int count=0;
																			for(int i=0;i<5;i++) {
																				if(arr[i].equals(ans[i])) {
																					count=count+1;
																				}
																			}
																			System.out.println(count);
																			String strg=Integer.toString(count);
																			Frame fs1=new Frame();
																			if(count>=3) {
																				Label ls=new Label("CONGRATULATIONS!! YOU HAVE SCORED "+strg+" MARKS");
																				fs1.setVisible(true);
																				fs1.setLayout(null);
																				fs1.setSize(100,100);
																				fs1.add(ls);
																				ls.setBounds(500,320,1000,100);
																			}
																			else if(count==2) {
																				Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" PRACTICE WELL!!");
																				fs1.setVisible(true);
																				fs1.setLayout(null);
																				fs1.setSize(100,100);
																				fs1.add(ls);
																				ls.setBounds(500,320,1000,100);
																			}
																			else if(count==1) {
																				Label ls=new Label("YOU HAVE SCORED "+strg+" MARK, "+" PRACTICE WELL!!");
																				fs1.setVisible(true);
																				fs1.setLayout(null);
																				fs1.setSize(100,100);
																				fs1.add(ls);
																				ls.setBounds(500,320,1000,100);
																			}
																			else {
																				Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" Work Hard!!!");
																				fs1.setVisible(true);
																				fs1.setLayout(null);
																				fs1.setSize(100,100);
																				fs1.add(ls);
																				ls.setBounds(500,320,1000,100);
																			}
																			
																		}
																	});
																	
																}
															});
														}
													});
												B2.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent Ae2) {
														Frame m2=new Frame();
														Label a1=new Label("Basic Syntax");
														Label a2=new Label("Input and Output Syntax");
														Label a3=new Label("Datatypes in python");
														Label a4=new Label("Variables");
														Label a5=new Label("Operators");
														Label a6=new Label("Keywords");
														Label a7=new Label("Conditional Statements");
														Label a8=new Label("Loops in python");
														Label a9=new Label("Functions");
														Label a10=new Label("Lists");
														Label a11=new Label("Tuples");
														Label a12=new Label("Sets");
														Label a13=new Label("Dictionaries");
														Label a14=new Label("Strings in Python");
														Label a15=new Label("Exceptional Handling");
														Label a16=new Label("Oops concepts");
														Button B2=new Button("TAKE TEST");
														m2.setVisible(true);
														m2.setSize(300,300);
														m2.setLayout(null);
														m2.add(B2);
														m2.add(a1);
														m2.add(a2);
														m2.add(a3);
														m2.add(a4);
														m2.add(a5);
														m2.add(a6);
														m2.add(a7);
														m2.add(a8);
														m2.add(a9);
														m2.add(a10);
														m2.add(a11);
														m2.add(a12);
														m2.add(a13);
														m2.add(a14);
														m2.add(a15);
														m2.add(a16);
														a1.setBounds(200,100,200,50);
													    a2.setBounds(200,150,200,50); 
													    a3.setBounds(200,200,200,50); 
												        a4.setBounds(200,250,200,50); 
												        a5.setBounds(200,300,200,50); 
													    a6.setBounds(200,350,200,50); 
												        a7.setBounds(200,400,200,50);
													    a8.setBounds(200,450,200,50); 
													    a9.setBounds(600,100,200,50); 
													    a10.setBounds(600,150,200,50); 
													    a11.setBounds(600,200,200,50); 
													    a12.setBounds(600,250,200,50);
													    a13.setBounds(600,300,200,50); 
													    a14.setBounds(600,350,200,50); 
													    a15.setBounds(600,400,200,50); 
													    a16.setBounds(600,450,200,50);
													    B2.setBounds(320,550,200,50); 
														B2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent ae2) {
																TextField t1=new TextField();
																TextField t2=new TextField();
																TextField t3=new TextField();
																TextField t4=new TextField();
																TextField t5=new TextField();
																Button b2=new Button("Submit");
																Frame h2=new Frame();
																Label e1=new Label("1.Who developed Python Programming Language?");
																Label e2=new Label("a) Wick van Rossum" +"         " +
																		"b) Guido van Rossum" + "          "+
																		"c)  Rasmus Lerdorf" + "          "+
																		"d)  Niene Stom");
																Label e3=new Label("2. Which type of Programming does Python support?");
																Label e4=new Label("a) object-oriented programming" + "          "+
																		"b) structured programming" + "         "+
																		"c)  functional programming" + "         "+ 
																		"d) all of the mentioned");
																Label e5=new Label("3.  Which of the following is the correct extension of the Python file?");
																Label e6=new Label("a) .python" + "          "+
																		"b) .pl" + "          "+
																		"c) .py" + "          "+
																		"d) .p");
																Label e7=new Label("4.  Which of the following is used to define a block of code in Python language?");
																Label e8=new Label("a)  Indentation" + "          "+
																		"b)  Key" + "          "+
																		"c) Brackets" + "          "+
																		"d) All of the mentioned");
																Label e9=new Label("5. Which keyword is used for function in Python language?");
																Label e10=new Label("a) Function" + "          "+
																		"b) def" + "          "+
																		"c) Fun" + "          "+
																		"d) Define");
																h2.add(t1);
																h2.add(t2);
																h2.add(t3);
																h2.add(t4);
																h2.add(t5);
																h2.setLayout(null);
																h2.setSize(300,300);
																h2.setVisible(true);
																h2.add(e1);
																h2.add(e2);
																h2.add(e3);
																h2.add(e4);
																h2.add(e5);
																h2.add(e6);
																h2.add(e7);
																h2.add(e8);
																h2.add(e9);
																h2.add(e10);
																h2.add(t1);
																h2.add(b2);
																e1.setBounds(50,75,900,40);
																e2.setBounds(50,120,900,40);
																e3.setBounds(50,165,900,40);
																e4.setBounds(50,210,900,40);
																e5.setBounds(50,255,900,40);
																e6.setBounds(50,300,900,40);
																e7.setBounds(50,345,900,40);
																e8.setBounds(50,390,900,40);
																e9.setBounds(50,435,900,40);
																e10.setBounds(50,480,900,40);
																t1.setBounds(950,75,50,20);
																t2.setBounds(950,165,50,20);
																t3.setBounds(950,255,50,20);
																t4.setBounds(950,345,50,20);
																t5.setBounds(950,435,50,20);
																b2.setBounds(500,570,150,50);
																b2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent ae) {
																		String[] arr=new String[10];
																		arr[0]="b";
																		arr[1]="d";
																		arr[2]="c";
																		arr[3]="a";
																		arr[4]="b";
																		String[] ans=new String[10];
																		ans[0]=t1.getText();
																		ans[1]=t2.getText();
																		ans[2]=t3.getText();
																		ans[3]=t4.getText();
																		ans[4]=t5.getText();
																		int count=0;
																		for(int i=0;i<5;i++) {
																			if(arr[i].equals(ans[i])) {
																				count=count+1;
																			}
																		}
																		System.out.println(count);
																		String strg=Integer.toString(count);
																		Frame fs1=new Frame();
																		if(count>=3) {
																			Label ls=new Label("CONGRATULATIONS!! YOU HAVE SCORED "+strg+" MARKS");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==2) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==1) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARK, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" Work Hard!!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		
																	}
																});
													}
												});
													}
												});
												B3.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent Ae3) {
														Frame m3=new Frame();
														Label c1=new Label("Basic Syntax");
														Label c2=new Label("MySQL Functions");
														Label c3=new Label("Keys");
														Label c4=new Label("Constraints");
														Label c5=new Label("Indexes");
														Label c6=new Label("Keywords");
														Label c7=new Label("Data Administration");
														Label c8=new Label("Comparision Operators");
														Label c9=new Label("SQL Queries");
														Label c10=new Label("SQL Conditions");
														Label c11=new Label("SQL Tables");
														Label c12=new Label("Datatypes");
														Button B3=new Button("TAKE TEST");
														m3.setVisible(true);
														m3.setSize(300,300);
														m3.setLayout(null);
														m3.add(B3);
														m3.add(c1);
														m3.add(c2);
														m3.add(c3);
														m3.add(c4);
														m3.add(c5);
														m3.add(c6);
														m3.add(c7);
														m3.add(c8);
														m3.add(c9);
														m3.add(c10);
														m3.add(c11);
														m3.add(c12);
														c1.setBounds(200,100,200,50);
													    c2.setBounds(200,150,200,50); 
													    c3.setBounds(200,200,200,50); 
												        c4.setBounds(200,250,200,50); 
												        c5.setBounds(200,300,200,50); 
													    c6.setBounds(200,350,200,50); 
												        c7.setBounds(600,100,200,50);
													    c8.setBounds(600,150,200,50); 
													    c9.setBounds(600,200,200,50); 
													    c10.setBounds(600,250,200,50); 
													    c11.setBounds(600,300,200,50); 
													    c12.setBounds(600,350,200,50);
													    B3.setBounds(320,450,200,50); 
														B3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent ae2) {
																TextField t1=new TextField();
																TextField t2=new TextField();
																TextField t3=new TextField();
																TextField t4=new TextField();
																TextField t5=new TextField();
																Button f3=new Button("Submit");
																Frame h3=new Frame();
																Label b1=new Label("1. Which SQL function is used to count the number of rows in a SQL query?");
																Label b2=new Label("a) COUNT()" +"         " +
																		"b) NUMBER()" + "          "+
																		"c)  SUM()" + "          "+
																		"d)  COUNT(*)");
																Label b3=new Label("2. Which SQL keyword is used to retrieve a maximum value?");
																Label b4=new Label("a)  MOST" + "          "+
																		"b)  TOP" + "         "+
																		"c)  MAX" + "         "+ 
																		"d)  UPPER");
																Label b5=new Label("3. Which of the following data type is not present in SQL Server?");
																Label b6=new Label("a)  geography" + "          "+
																		"b)  hierarchyid" + "          "+
																		"c)  boolean" + "          "+
																		"d)  bit");
																Label b7=new Label("4. Which of the query is used to see the structure of an already created table?");
																Label b8=new Label("a) DESCRIBE table" + "          "+
																		"b)  ALTER table" + "          "+
																		"c) DROP table" + "          "+
																		"d)  CREATE table");
																Label b9=new Label("5. Which symbol is used to see every column of a table?");
																Label b10=new Label("a) /" + "          "+
																		"b) *" + "          "+
																		"c) --" + "          "+
																		"d) !");
																
																h3.setLayout(null);
																h3.setSize(300,300);
																h3.setVisible(true);
																h3.add(b3);
																h3.add(t1);
																h3.add(t2);
																h3.add(t3);
																h3.add(t4);
																h3.add(t5);
																h3.add(b1);
																h3.add(b2);
																h3.add(b3);
																h3.add(b4);
																h3.add(b5);
																h3.add(b6);
																h3.add(b7);
																h3.add(b8);
																h3.add(b9);
																h3.add(b10);
																h3.add(f3);
																b1.setBounds(50,75,900,40);
																b2.setBounds(50,120,900,40);
																b3.setBounds(50,165,900,40);
																b4.setBounds(50,210,900,40);
																b5.setBounds(50,255,900,40);
																b6.setBounds(50,300,900,40);
																b7.setBounds(50,345,900,40);
																b8.setBounds(50,390,900,40);
																b9.setBounds(50,435,900,40);
																b10.setBounds(50,480,900,40);
																t1.setBounds(950,75,50,20);
																t2.setBounds(950,165,50,20);
																t3.setBounds(950,255,50,20);
																t4.setBounds(950,345,50,20);
																t5.setBounds(950,435,50,20);
																f3.setBounds(500,570,150,50);
																f3.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent ae) {
																		String[] arr=new String[10];
																		arr[0]="d";
																		arr[1]="c";
																		arr[2]="c";
																		arr[3]="a";
																		arr[4]="b";
																		String[] ans=new String[10];
																		ans[0]=t1.getText();
																		ans[1]=t2.getText();
																		ans[2]=t3.getText();
																		ans[3]=t4.getText();
																		ans[4]=t5.getText();
																		int count=0;
																		for(int i=0;i<5;i++) {
																			if(arr[i].equals(ans[i])) {
																				count=count+1;
																			}
																		}
																		System.out.println(count);
																		String strg=Integer.toString(count);
																		Frame fs1=new Frame();
																		if(count>=3) {
																			Label ls=new Label("CONGRATULATIONS!! YOU HAVE SCORED "+strg+" MARKS");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==2) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==1) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARK, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+"Work Hard!!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		
																	}
																});
													}
												});
													}
												});
												B4.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent Ae4) {
														Frame m4=new Frame();
														Label d1=new Label("Basic Structure");
														Label d2=new Label("Html Headings");
														Label d3=new Label("Html Attributes");
														Label d4=new Label("Paragraphs");
														Label d5=new Label("Styling text");
														Label d6=new Label("Tables");
														Label d7=new Label("Adding Images");
														Label d8=new Label("Adding Videos");
														Label d9=new Label("Ordered and Unordered Lists");
														Label d10=new Label("Div and Span");
														Label d11=new Label("Adding Audio");
														Label d12=new Label("Links");
														Button B4=new Button("TAKE TEST");
														m4.setVisible(true);
														m4.setSize(300,300);
														m4.setLayout(null);
														m4.add(B4);
														m4.add(d1);
														m4.add(d2);
														m4.add(d3);
														m4.add(d4);
														m4.add(d5);
														m4.add(d6);
														m4.add(d7);
														m4.add(d8);
														m4.add(d9);
														m4.add(d10);
														m4.add(d11);
														m4.add(d12);
														d1.setBounds(200,100,200,50);
													    d2.setBounds(200,150,200,50); 
													    d3.setBounds(200,200,200,50); 
												        d4.setBounds(200,250,200,50); 
												        d5.setBounds(200,300,200,50); 
													    d6.setBounds(200,350,200,50); 
												        d7.setBounds(600,100,200,50);
													    d8.setBounds(600,150,200,50); 
													    d9.setBounds(600,200,200,50); 
													    d10.setBounds(600,250,200,50); 
													    d11.setBounds(600,300,200,50); 
													    d12.setBounds(600,350,200,50);
													    B4.setBounds(320,450,200,50); 
														B4.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent ae2) {
																TextField t1=new TextField();
																TextField t2=new TextField();
																TextField t3=new TextField();
																TextField t4=new TextField();
																TextField t5=new TextField();
																Button b4=new Button("Submit");
																Frame h4=new Frame();
																Label w1=new Label("1. What is the correct syntax of doctype in HTML5?");
																Label w2=new Label("a) </doctype html>" +"         " +
																		"b) <doctype html>" + "          "+
																		"c) <doctype html!>" + "          "+
																		"d) <!doctype html>");
																Label w3=new Label("2. Which of the following is used to read an HTML page and render it?");
																Label w4=new Label("a) Web server" + "          "+
																		"b) Web network" + "         "+
																		"c) Web browser" + "         "+ 
																		"d) Web matrix");
																Label w5=new Label("3. Which of the following tag is used for inserting the largest heading in HTML?");
																Label w6=new Label("a)  head" + "          "+
																		"b) <h1>" + "          "+
																		"c) <h6>" + "          "+
																		"d) heading");
																Label w7=new Label("4.  In which part of the HTML metadata is contained?");
																Label w8=new Label("a) head tag" + "          "+
																		"b) title tag " + "          "+
																		"c) body tag" + "          "+
																		"d) html tag ");
																Label w9=new Label("5.Which element is used for or styling HTML5 layout?");
																Label w10=new Label("a) jQuery " + "          "+
																		"b) JavaScript" + "          "+
																		"c)  PHP" + "         "+
																		"d) CSS");
																
																h4.setLayout(null);
																h4.setSize(300,300);
																h4.setVisible(true);
																h4.add(t1);
																h4.add(t2);
																h4.add(t3);
																h4.add(t4);
																h4.add(t5);
																h4.add(w1);
																h4.add(w2);
																h4.add(w3);
																h4.add(w4);
																h4.add(w5);
																h4.add(w6);
																h4.add(w7);
																h4.add(w8);
																h4.add(w9);
																h4.add(w10);
																h4.add(b4);
																w1.setBounds(50,75,900,40);
																w2.setBounds(50,120,900,40);
																w3.setBounds(50,165,900,40);
																w4.setBounds(50,210,900,40);
																w5.setBounds(50,255,900,40);
																w6.setBounds(50,300,900,40);
																w7.setBounds(50,345,900,40);
																w8.setBounds(50,390,900,40);
																w9.setBounds(50,435,900,40);
																w10.setBounds(50,480,900,40);
																t1.setBounds(950,75,50,20);
																t2.setBounds(950,165,50,20);
																t3.setBounds(950,255,50,20);
																t4.setBounds(950,345,50,20);
																t5.setBounds(950,435,50,20);
																b4.setBounds(500,570,150,50);
																b4.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent ae) {
																		String[] arr=new String[10];
																		arr[0]="d";
																		arr[1]="c";
																		arr[2]="b";
																		arr[3]="a";
																		arr[4]="d";
																		String[] ans=new String[10];
																		ans[0]=t1.getText();
																		ans[1]=t2.getText();
																		ans[2]=t3.getText();
																		ans[3]=t4.getText();
																		ans[4]=t5.getText();
																		int count=0;
																		for(int i=0;i<5;i++) {
																			if(arr[i].equals(ans[i])) {
																				count=count+1;
																			}
																		}
																		System.out.println(count);
																		String strg=Integer.toString(count);
																		Frame fs1=new Frame();
																		if(count>=3) {
																			Label ls=new Label("CONGRATULATIONS!! YOU HAVE SCORED "+strg+" MARKS");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==2) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==1) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARK, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+"Work Hard!!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		
																	}
																});
													}
												});
													}
												});
												B5.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent Ae5) {
														Frame m5=new Frame();
														Label g1=new Label("Basic Structure");
														Label g2=new Label("Box Model");
														Label g3=new Label("Selectors");
														Label g4=new Label("Colors");
														Label g5=new Label("Sizing Unit");
														Label g6=new Label("Layout");
														Label g7=new Label("Font-properties");
														Label g8=new Label("Grid");
														Label g9=new Label("Media query");
														Label g10=new Label("Animations");
														Label g11=new Label("Text and Typography");
														Label g12=new Label("Backgrounds");
														Button B5=new Button("TAKE TEST");
														m5.setVisible(true);
														m5.setSize(1000,800);
														m5.setLayout(null);
														m5.add(B5);
														m5.add(g1);
														m5.add(g2);
														m5.add(g3);
														m5.add(g4);
														m5.add(g5);
														m5.add(g6);
														m5.add(g7);
														m5.add(g8);
														m5.add(g9);
														m5.add(g10);
														m5.add(g11);
														m5.add(g12);
														g1.setBounds(200,100,200,50);
													    g2.setBounds(200,150,200,50); 
													    g3.setBounds(200,200,200,50); 
												        g4.setBounds(200,250,200,50); 
												        g5.setBounds(200,300,200,50); 
													    g6.setBounds(200,350,200,50); 
												        g7.setBounds(600,100,200,50);
													    g8.setBounds(600,150,200,50); 
													    g9.setBounds(600,200,200,50); 
													    g10.setBounds(600,250,200,50); 
													    g11.setBounds(600,300,200,50); 
													    g12.setBounds(600,350,200,50);
													    B5.setBounds(320,450,200,50); 
														B5.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent ae2) {
																TextField t1=new TextField();
																TextField t2=new TextField();
																TextField t3=new TextField();
																TextField t4=new TextField();
																TextField t5=new TextField();
																Button b5=new Button("Submit");
																Frame h5=new Frame();
																Label d1=new Label("1. Which of the following tag is used to embed css in html page?");
																Label d2=new Label("a) <style> " +"         " +
																	    "b) <script> " + "          "+
																		"c) <!DOCTYPE html>" + "          "+
																		"d) <css>");
																Label d3=new Label("2. Which of the following CSS style property is used to specify an italic text?");
																Label d4=new Label("a) style" + "          "+
																		"b) font" + "         "+
																		"c) font-style" + "         "+ 
																		"d) @font-face");
																Label d5=new Label("3.  Which of the following is not the property of the CSS box model?");
																Label d6=new Label("a) margin" + "          "+
																		"b) color" + "          "+
																		"c) width" + "          "+
																		"d) height");
																Label d7=new Label("4. Which of the following CSS property sets the shadow for a box element?");
																Label d8=new Label("a)  set-shadow" + "          "+
																		"b)  box-shadow" + "          "+
																		"c)  shadow" + "          "+
																		"d)  canvas-shadow");
																Label d9=new Label("5. Which of the following CSS Property controls how an element is positioned?");
																Label d10=new Label("a)  static" + "          "+
																		"b)  position" + "          "+
																		"c)  fix" + "          "+
																		"d)  set");
																
																h5.setLayout(null);
																h5.setSize(300,300);
																h5.setVisible(true);
																h5.add(t1);
																h5.add(t2);
																h5.add(t3);
																h5.add(t4);
																h5.add(t5);
																h5.add(d1);
																h5.add(d2);
																h5.add(d3);
																h5.add(d4);
																h5.add(d5);
																h5.add(d6);
																h5.add(d7);
																h5.add(d8);
																h5.add(d9);
																h5.add(d10);
																h5.add(b5);
																d1.setBounds(50,75,900,40);
																d2.setBounds(50,120,900,40);
																d3.setBounds(50,165,900,40);
																d4.setBounds(50,210,900,40);
																d5.setBounds(50,255,900,40);
																d6.setBounds(50,300,900,40);
																d7.setBounds(50,345,900,40);
																d8.setBounds(50,390,900,40);
																d9.setBounds(50,435,900,40);
																d10.setBounds(50,480,900,40);
																t1.setBounds(950,75,50,20);
																t2.setBounds(950,165,50,20);
																t3.setBounds(950,255,50,20);
																t4.setBounds(950,345,50,20);
																t5.setBounds(950,435,50,20);
																b5.setBounds(500,570,150,50);
																b5.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent ae) {
																		String[] arr=new String[10];
																		arr[0]="a";
																		arr[1]="c";
																		arr[2]="b";
																		arr[3]="b";
																		arr[4]="b";
																		String[] ans=new String[10];
																		ans[0]=t1.getText();
																		ans[1]=t2.getText();
																		ans[2]=t3.getText();
																		ans[3]=t4.getText();
																		ans[4]=t5.getText();
																		int count=0;
																		for(int i=0;i<5;i++) {
																			if(arr[i].equals(ans[i])) {
																				count=count+1;
																			}
																		}
																		System.out.println(count);
																		String strg=Integer.toString(count);
																		Frame fs1=new Frame();
																		if(count>=3) {
																			Label ls=new Label("CONGRATULATIONS!! YOU HAVE SCORED "+strg+" MARKS");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==2) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else if(count==1) {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARK, "+" PRACTICE WELL!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		else {
																			Label ls=new Label("YOU HAVE SCORED "+strg+" MARKS, "+" Work Hard!!!");
																			fs1.setVisible(true);
																			fs1.setLayout(null);
																			fs1.setSize(100,100);
																			fs1.add(ls);
																			ls.setBounds(500,320,1000,100);
																		}
																		
																	}
																});
													}
												});
													}
												});
													}
												else
												{
													System.out.println("incorrect password");
												}
											}
											else
											{
												System.out.println("incorrect username");
											}
										}
									   catch(Exception e)
									   {
										  System.out.println(e); 
									   }
								   }
								}
							});
			}
			}
						public static void main(String [] args){	
							App r=new App();
						}
				}
					
