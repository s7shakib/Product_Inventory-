/**
  
   Description:
   
      This object- oriented application track information about products for a baby’s company. 
      The application provides info for two different kind of products “Liquid” and “Powder”. 
      The application will ask the user what kind of product they want to add to the inventory. 
      After they selected the type of product then based on the type of product, the application will ask question from the user about the product.      

**/

// The main class for this application 
public class BabyProduct {

//These are instance variables
   private String ProductName_;
   private double ProductID;
  
   
   // These are the constructors 
    public BabyProduct(String ProductName_, double ProductID){
      if(ProductName_ == null || ProductName_ .equals("")){
         throw new IllegalArgumentException("The Product name must be provided!");
         // Validation
         
      }else if(ProductID < 0){
         throw new IllegalArgumentException("ID must be greater than zero ");
      }
      
     
   
      // Requried inputs for all types of insurance 
     
      this.ProductName_  = ProductName_ ;
      this.ProductID = ProductID;
    
   }
   

  //These are Accessors
   public String getProductName_(){ 
      return this.ProductName_ ;
   }

   public double getProductID(){ 
      return this.ProductID;
   }
   

   
   
   //These are Mutators
   public void setProductName_ (String ProductName_ ){
      if(ProductName_ == null || ProductName_.equals("")){
         throw new IllegalArgumentException("A Product name must be provided!");
      }
      
      this.ProductName_  = ProductName_ ;
   }
   


   // The mutators
   public void setProductID(double ProductID){
      if(ProductID < 0){
         throw new IllegalArgumentException("ID  must be greater than zero ");
      }
      
      this.ProductID = ProductID;
   }
   


// Special Constructor or final report 


  public String finalReport(){
      return "   -----Product Info List-----\n " + "\nProduct Name: "+this.getProductName_ ()+ "\nIdentifier: "+this.getProductID();



 }

}
