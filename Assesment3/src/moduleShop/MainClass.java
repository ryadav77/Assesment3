package moduleShop;
import java.util.*;


public class MainClass{
  int id;
  static Scanner s = new Scanner(System.in);
  static List<Item> Items= new ArrayList<>();
  static List<Item> Av_items = new ArrayList<>();
  static List<String> codes= new ArrayList<>();
  
  
  public static void main(String[] args) {
	  
	  double totalcost=0;
	  int totalquantity=0;
	  Item i = new Item(50.0,"111",10,"Orange");
	  Av_items.add(i);
	  codes.add(i.getCode());
	  Item j = new Item(70.0,"222",10,"Apple_");
	  Av_items.add(j);
	  codes.add(j.getCode());
	  Item k = new Item(80.0,"333",10,"Mango_");
	  Av_items.add(k);
	  codes.add(k.getCode());
	  Item l = new Item(20.0,"444",10,"Tomato");
	  Av_items.add(l);
	  codes.add(l.getCode());
	  Item m = new Item(90.0,"555",10,"Potato");
	  Av_items.add(m);
	  codes.add(m.getCode());
	  Item n = new Item(150.0,"666",10,"Chilli");
	  Av_items.add(n);
	  codes.add(n.getCode());
	  MainClass obj= new MainClass();
	 
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	  System.out.printf("%70s\n","Welcome to the Shop");
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	  obj.printav();
	  int option=-1;
      
      do {
    	  System.out.println("\n\nLets!Shop.....\n");
    	  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		  System.out.println("Press 1 to Add Item");
	      System.out.println("Press 2 to View Invoice");
	      System.out.println("Press 3 If the Operator Wants to Change or Manage Stock.");
		  System.out.println("Press 4 to Exit");
		  
		  option= s.nextInt();
		  
		  switch(option) {
		  
		  case 1:
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			  System.out.println("Here are the Available Items\n");
			  obj.printav();
			  System.out.println("Enter the Code of Item you want\n");
			  String icode;
			  icode= s.next();
			  while(codes.contains(icode)==false){
				  System.out.println("Sorry Entered Code does not matches,Enter Again-->");
				  icode= s.next();
			  }
			  if(codes.contains(icode)) {
				  int index = codes.indexOf(icode);
				 System.out.println("Enter Quantity\n "); 
			         int qty;
			         qty= s.nextInt();
			         if(qty< Av_items.get(index).getQuantity()) {
			         int sq=  Av_items.get(index).getQuantity()-qty;
			         Av_items.get(index).setQuantity(sq);
			         Item buy= new Item(Av_items.get(index).getCost(),Av_items.get(index).getCode(),qty,Av_items.get(index).getName());
			         Items.add(buy);
			         totalcost += qty*Av_items.get(index).getCost();
			         totalquantity+= qty;
			         System.out.println(Av_items.get(index).getName()+" has been Added Succesfully.\n");
			  }else {
				  System.out.println("Sorry Number of Items left are only: "+ Av_items.get(index).getQuantity() );
			  }
			  }
			 
			  break;
			  
			  
		  case 2:
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			  System.out.printf("%70s\n","Shpped Items are");
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		      System.out.println("Name       Code       Price         Purchased_Quantity             Amount \n");
		      for(Item itr:Items) {
		    	  System.out.printf("%1s %7s  %12s %18s %25s  \n",itr.getName(),itr.getCode(),itr.getCost(),itr.getQuantity(),itr.getQuantity()*itr.getCost());
		    	  
		      }
		      
		      System.out.println("--------------------");
		      System.out.println("Total Cost: "+ totalcost);
		      System.out.println("--------------------");
		      System.out.println("Total Quantity: "+ totalquantity);
		      System.out.println("--------------------");
		      break;
		  case 3:
		        obj.printav();
		        
		        
		        int change=0;
		        System.out.println("Press 1 to Add Item in Shop");
			    System.out.println("Press 2 to Add Quantity of Items");
			    System.out.println("Press 3 to Alter Price");
			    System.out.println("Press4 to Alter Code of Item");
				System.out.println("Press 5 to Exit");
				
				change= s.nextInt();
				switch(change) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Enter a Valid Options");
				}
		        
		        break;
		        
			    
			    
		  case 4:
			  option=-1;
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			  System.out.printf("%70s\n","Thanks for Shopping with us! Visit Again");
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			  break;
			  
		 
			  
		  default:
			  System.out.println("Enter a Valid Choice");
		  }
		  
      }while(option!=-1);
  
  }
  public void printav() {
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	  System.out.printf("%70s\n","Available Items");
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("Name       Code       Price         Available_Quantity \n");
      for(Item i:Av_items) {
    	  System.out.printf("%1s %7s  %12s %18s   \n",i.getName(),i.getCode(),i.getCost(),i.getQuantity());
    	  
      }
      
  }
  

}
