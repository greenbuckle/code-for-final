public class project
{  
public static void main(String[] args) {
		double prices []={0,2.50,4.25,20,8,10};//prices
		double sales[]={0,20,45,5,50,25};//how much was sold
		double profit[]=new double [6];//spaces for profits
		for(int i=1;i<prices.length;i++){profit[i]=prices[i]*sales[i];}//calculate
		double maxsale=sales[0];
        double total=0;//for everything to be added together
        String cookies[]={"null","Chocolate Chip","Oatmeal","Caviar","PeanutButter","Sugar"};
        
         options();//prints menu
         
         for(int ite=1;ite<sales.length;ite++){total=total+profit[ite];};//add everything together
         
        for(int it=1;it<sales.length;it++){
	    if(maxsale<sales[it]){maxsale=sales[it];}}//compares the sales 
        
      System.out.println("The total profits were: $"+total);//tell total profit
    for(int itl=1;itl<sales.length;itl++){
        if(maxsale==sales[itl]){System.out.println(cookies[itl]+" is the best selling cookie and it made $"+profit[itl]+" while selling "+sales[itl]+" units");}
    }//telles best selling cookie and its profits   
    
    {System.out.println("------------------------------");
      System.out.println("the total sales are: ");
      for(int itp=1;itp<sales.length;itp++){
          System.out.println(cookies[itp]+" sold "+sales[itp]+" units "+" making a total profit of $"+profit[itp]);}
      }//tells the amounts and profits of each cookie
	}
    public static void options(){System.out.println("what's being sold");//used to show the menu
     System.out.println("------------------------------");
    System.out.println("1.chocolate chip-$2.50");
  System.out.println("2.oatmeal cookie-$4.25");
   System.out.println("3.caviar cookie-$20");
    System.out.println("4.peanut butter cookie-$8");
     System.out.println("5.sugar cookie-$10");
      System.out.println("------------------------------");}
      
   
}
