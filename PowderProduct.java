
// The class for Powder Product 

public class PowderProduct extends BabyProduct { // These are instance variables
   private double ProductPrice;
   private double ProductDuration;
   private double InStock;
   private double OutStock;
   
   
   public PowderProduct(String ProductName_,  double ProductPrice, double ProductID, double ProductDuration, double InStock, double OutStock){
   
      super(ProductName_, ProductID);
      
      this.ProductDuration = ProductDuration;
      this.ProductPrice = ProductPrice;
      this.InStock = InStock;
      this.OutStock = OutStock;
      
      
      
    }
    
    
    
    //These are Accessors
   public double getProductDuration(){ 
      return this.ProductDuration;
   }
 
   public double getProductPrice () {
      return this.ProductPrice;
   }
   
   public double getInStock () {
      return this.InStock;
   }
   
   public double getOutStock () {
      return this.OutStock;
   }
   


// The mutators 

   
   public void setProductDuration(double ProductDuration ){
      if(ProductDuration < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.ProductDuration = ProductDuration;
   }
   
    public void setProductPrice(double ProductPrice ){
         if(ProductPrice < 0){
            throw new IllegalArgumentException("Must be an int");
         }
         
      this.ProductPrice = ProductPrice;
   }
   
   public void setInStock(double InStock ){
      if(ProductPrice < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.InStock = InStock;
   }
   
   public void setOutStock(double OutStock ){
      if(OutStock < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.OutStock = OutStock;
   }
// Specail constructor or the final report 
   public String finalReport(){
      return super.finalReport() + "\nDuration In Hours: "+this.getProductDuration() + "\nThe Price: $" + this.getProductPrice() + "\nIn Stock: " + this.getInStock() + "\nOut Stock: " + this.getOutStock();

  } 
   
   
   
}