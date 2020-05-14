public abstract class Book //intended to be extended to create a full implementation
{
   //private because it cannot be directly accessed in other class
   private String title;
   private double price;
   
   public Book(String title, double price) //constructor method assigns values to the corresponding fields
   {
      this.title = title;
      this.price = price;
     
   }
 
   public abstract void getTitle(); 
   public abstract void getPrice();
   
   
   public void print()
   {
      System.out.println("Book title        : "+ title);
      System.out.println("Book price(RM)    : "+ price);
   
   }
}
