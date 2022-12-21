//Hasan Pekedis 150120068


import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<Object>poli1=new ArrayList<>();
		ArrayList<Integer>onlyPersons=new ArrayList<>();
		 
		 File files = new File("input.txt");
			Scanner input = new Scanner(files);
			
	
		while(input.hasNext()) {
			String object =input.next();
			
			if(object.equals("Department")) {
				int id=input.nextInt();
				String departmentName=input.next();
				try {
				poli1.add(new Department(id,departmentName));
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if(object.equals("Project")) {
				String projectName=input.next();
				String[] date = input.next().split("/");
				Calendar startDate=Calendar.getInstance();
				startDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				String state=input.next();
				
				poli1.add(new Project(projectName, startDate, state));
				
			}			
			else if(object.equals("Product")) {
				String sName=input.next();
				String[] date = input.next().split("/");
				Calendar saleDate=Calendar.getInstance();
				saleDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				double price=input.nextDouble();
				try {
					
				poli1.add(new Product(sName, saleDate, price));
				
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			else if(object.equals("Person")) {
				String firsName=input.next();
				String lastName=input.next();
				int id=input.nextInt();
				String gender=input.next();
				String[] date = input.next().split("/");
				 Calendar birthDate = Calendar.getInstance();
				 birthDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
				String marialStatus=input.next();
				String hasDriverLicence=input.next();
				try {
					poli1.add(new Person(id,firsName,lastName,gender,birthDate,marialStatus,hasDriverLicence));
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (object.equals("Customer")) {
				int id=input.nextInt();
				onlyPersons.add(id);
				Person person=null;
				for(int i=0;i<poli1.size();i++) {
					if(poli1.get(i) instanceof Person) {
						if(((Person)poli1.get(i)).getId()==id)
							person=(Person)poli1.get(i);
					}
				}
					ArrayList<Product> products=new ArrayList<>();
					String[] cProduct=input.nextLine().trim().split(" ");
					for(int i=0;i<cProduct.length;i++) {
						for(int j=0;j<poli1.size();j++) {
							 if (poli1.get(j) instanceof Product) {
								 if(((Product)poli1.get(j)).getProductName().equals((cProduct[i]))) {
									 products.add((Product)poli1.get(j));
							}
						}
						}
					}
					
					
					try {
						poli1.add(new Customer(person,products));
					} 
					catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			    else if(object.equals("Employee")) {
			    	int id=input.nextInt();
			    	onlyPersons.add(id);
			    	double salary=input.nextDouble();
			    	String[] date = input.next().split("/");
					 Calendar hireDate = Calendar.getInstance();
					 hireDate.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
					 String departmentName=input.next();
					Person person=null;
					for(int i=0;i<poli1.size();i++) {
						 if (poli1.get(i) instanceof Person) {
							 if(((Person)poli1.get(i)).getId()==id) {
								person =(Person)poli1.get(i);
						}
						 }
					}
						Department department =null;
						for(int i=0;i<poli1.size();i++) {
							 if (poli1.get(i) instanceof Department) {
								 if(((Department)poli1.get(i)).getDepartmentName().equals(departmentName)) {
									 department=(Department)poli1.get(i);
							}
						}
						}
						poli1.add(new Employee(person, salary, hireDate, department));
			    	
			    }
			    else if(object.equals("Manager")) {
			    	int id=input.nextInt();
			    	double bonusBudget=input.nextDouble();
			    	Employee employee=null;
			    	for(int i=0;i<poli1.size();i++) {
			    		 if (poli1.get(i) instanceof Employee) {
			    			 if(((Employee)poli1.get(i)).getId()==id) {
			    				 employee=(Employee)poli1.get(i);
			    		}
			    		 }
			    	}
			    poli1.add(new Manager(employee, bonusBudget));	
			}
			    else if (object.equals("RegularEmployee")) {
			         int id=input.nextInt();
			         double performanceScore=input.nextDouble();
			         Employee employee=null;
			    	for(int i=0;i<poli1.size();i++) {
			    		 if (poli1.get(i) instanceof Employee) {
			    			 if(((Employee)poli1.get(i)).getId()==id) {
			    				 employee=(Employee)poli1.get(i);
			    		}
			    	}
			    	}
			    	poli1.add(new RegularEmployee(employee, performanceScore));
			    	
			    }
			    else if(object.equals("SalesEmployee")) {
			    	int id=input.nextInt();
			    	RegularEmployee regularEmployee=null;
			    	for(int i=0;i<poli1.size();i++) {
			    		if (poli1.get(i) instanceof RegularEmployee) {
			    			if(((RegularEmployee)poli1.get(i)).getId()==id) {
			    				regularEmployee=(RegularEmployee)poli1.get(i);
			    		}
			    		}
			    	}
			    	ArrayList<Product> products=new ArrayList<>();
					String[] cProduct=input.nextLine().trim().split(" ");
					for(int i=0;i<cProduct.length;i++) {
						for(int k=0;k<poli1.size();k++) {
							if (poli1.get(k) instanceof Product) {
								if(((Product)poli1.get(k)).getProductName().equals((cProduct[i]))) {
									products.add((Product)poli1.get(k));
							}
						}
						}
						
					}
			    	poli1.add(new SalesEmployee(regularEmployee, products));
			    	
			    }
			
			    else if(object.equals("Developer")) {
			    	int id=input.nextInt();
			    	ArrayList<Project> projects=new ArrayList<>();
					String[] cProject=input.nextLine().trim().split(" ");
					for(int i=0;i<cProject.length;i++) {	
						for(int j=0;j<poli1.size();j++) {
							if (poli1.get(j) instanceof Project) {
								if(((Project)poli1.get(j)).getProjectName().equals(cProject[i])) {
									projects.add((Project)poli1.get(j));
							}
						}
						}
					}
			    	RegularEmployee regularEmployee=null;
			    	for(int i=0;i<poli1.size();i++) {
			    		if (poli1.get(i) instanceof RegularEmployee) {
			    			if(((RegularEmployee)poli1.get(i)).getId()==id) {
			    				regularEmployee=(RegularEmployee)poli1.get(i);
			    		}
			    	}
			    	}
			    	
			    	poli1.add(new Developer(regularEmployee, projects));
			    }
			
		}
		
		for(int i=0;i<poli1.size();i++) {
			if (poli1.get(i) instanceof Manager) {
			for(int k=0;k<poli1.size();k++) {
				 if (poli1.get(k) instanceof RegularEmployee && !(poli1.get(k) instanceof SalesEmployee) && !(poli1.get(k) instanceof Developer)) {
					 if (((Manager)poli1.get(i)).getDepartment().getDepartmentName().equals(((RegularEmployee)poli1.get(k)).getDepartment().getDepartmentName())) {
					((Manager)poli1.get(i)).addEmployee(((RegularEmployee)poli1.get(k)));
				}
			}
			}
		}
		}
		for(int i=0;i<poli1.size();i++) {
			if(poli1.get(i) instanceof Manager)
			((Manager)poli1.get(i)).distributeBonusBudget();
		}
		
		double mValue = 0;
		int indexMaxSales = 0;
		for(int i=0;i<poli1.size();i++) {
			if(poli1.get(i) instanceof Manager) {
				((Manager)poli1.get(i)).raiseSalary(0.2);
				
			}
			else if (poli1.get(i) instanceof SalesEmployee) {
				double tValue = 0;
				((SalesEmployee)poli1.get(i)).raiseSalary(0.18);
				for (int j = 0 ; j < ((SalesEmployee)poli1.get(i)).getSales().size() ; j++) {
					tValue += ((SalesEmployee)poli1.get(i)).getSales().get(j).getPrice();
				}
				if (tValue > mValue) {
					mValue = tValue;
					indexMaxSales = i;
			}
			}
			else if(poli1.get(i) instanceof Developer) {
				((Developer)poli1.get(i)).raiseSalary(0.23);
				
			}	
			
			else if((poli1.get(i) instanceof RegularEmployee)&&!(poli1.get(i) instanceof SalesEmployee) && !(poli1.get(i) instanceof Developer) ) {
				((RegularEmployee)poli1.get(i)).raiseSalary(0.3);
			}
			
	}	 
	    ((SalesEmployee)poli1.get(indexMaxSales)).raiseSalary(1000);
	    
	  
	    
		
	for(int i=0;i<poli1.size();i++) {
		if(poli1.get(i) instanceof Department) {
		System.out.println("****************");
		System.out.println(((Department)poli1.get(i)).toString());
		
		for(int k=0;k<poli1.size();k++) {
			if(poli1.get(k) instanceof Manager) {
				if(((Manager)poli1.get(k)).getDepartment().getDepartmentName().equals(((Department)poli1.get(i)).getDepartmentName())) {
         System.out.println(((Manager)poli1.get(k)).toString());
        
         int number=1;
         
         
             for(int l=0;l<((Manager)poli1.get(k)).getRegularEmployees().size();l++) {
            	 for(int m=0;m<poli1.size();m++) {
            	 if(poli1.get(m) instanceof Developer) {
            		 if (((Developer)poli1.get(m)).getId() == ((Manager)poli1.get(k)).getRegularEmployees().get(l).getId()) {
            			 System.out.println("\t\t\t" +number+ ". Developer");
            		 System.out.print(((Developer)poli1.get(m)).toString());
            		 System.out.println(", bonus="+((Manager)poli1.get(k)).getRegularEmployees().get(l).getBonus()+"]");
            		 System.out.println("\t\t\t\t"+((Developer)poli1.get(m)).getProjects());
            		 ((Manager)poli1.get(k)).getRegularEmployees().remove(l);
            		 l=0;
            		 number++;
            		 }
            	 }          	 
            	 }       
             }
             for(int l=0;l<((Manager)poli1.get(k)).getRegularEmployees().size();l++) {
            	 
                for(int m=0;m<poli1.size();m++) {
                	if(poli1.get(m) instanceof SalesEmployee) {
                		if (((SalesEmployee)poli1.get(m)).getId() == ((Manager)poli1.get(k)).getRegularEmployees().get(l).getId()) {
                			System.out.println("\t\t\t"+number+" SalesEmployee");
                			
                			System.out.print(((SalesEmployee)poli1.get(m)).toString());
                    		 System.out.println(", bonus="+((Manager)poli1.get(k)).getRegularEmployees().get(l).getBonus()+"]");
                    		 System.out.println("\t\t\t\t"+((SalesEmployee)poli1.get(m)).getSales());
                			((Manager)poli1.get(k)).getRegularEmployees().remove(l);
                			l=0;
                			number++;
                		}
                	}
                	
                }

             }
         
             for(int l=0;l<((Manager)poli1.get(k)).getRegularEmployees().size();l++) {
            	 System.out.println("\t\t\t"+number+" RegularEmployee");
            	 
            	System.out.print(((Manager)poli1.get(k)).getRegularEmployees().get(l).toString());
            	 System.out.println(", bonus="+((Manager)poli1.get(k)).getRegularEmployees().get(l).getBonus()+"]");
             }
             
          
				}
			}		
		}	
		}
		
		
		
			
	}
	System.out.println("\n\n");
	    System.out.println("*******CUSTOMERS*********");
	   for(int i=0;i<poli1.size();i++) {
		   if(poli1.get(i) instanceof Customer) {
			   System.out.println(((Customer)poli1.get(i)).toString());
		   }   
	   }
	System.out.println("\n\n");
	System.out.println("*******PEOPLE*********");
     for(int i=0;i<poli1.size();i++) {
    	 if(poli1.get(i) instanceof Person &&!(poli1.get(i) instanceof Customer)&&!(poli1.get(i) instanceof Employee) ) {
    		if(!(onlyPersons.contains(((Person)poli1.get(i)).getId()))){
    		System.out.println(""+((Person)poli1.get(i)).toString().trim()+", birthDate="+((Person)poli1.get(i)).getBirthDate().get(Calendar.DATE)+"/"+((Person)poli1.get(i)).getBirthDate().get(Calendar.MONTH)+"/"+((Person)poli1.get(i)).getBirthDate().get(Calendar.YEAR)+", maritalStatus="+((Person)poli1.get(i)).getMaritalStatus()+", hasDriverLicence="+((Person)poli1.get(i)).getHasDriverLicence()+"]");
    	 }
    	 }
     }
	}
	}