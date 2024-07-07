
// The class for life insurance 

public class LiquidProduct extends BabyProduct { // These are instance variables
   private double ProductPrice_;
   private double ProductDuration_;
   private double InStock_;
   private double OutStock_;
   
   
   public LiquidProduct(String ProductName_,  double ProductPrice_, double ProductID, double ProductDuration_, double InStock_, double OutStock_){
   
      super(ProductName_, ProductID);
      
      this.ProductDuration_ = ProductDuration_;
      this.ProductPrice_ = ProductPrice_;
      this.InStock_ = InStock_;
      this.OutStock_ = OutStock_;
      
      
      
    }
    
    
    
    //These are Accessors
   public double getProductDuration_(){ 
      return this.ProductDuration_;
   }
 
   public double getProductPrice_ () {
      return this.ProductPrice_;
   }
   
   public double getInStock_ () {
      return this.InStock_;
   }
   
   public double getOutStock_ () {
      return this.OutStock_;
   }
   


// The mutators 

   
   public void setProductDuration_(double ProductDuration_ ){
      if(ProductDuration_ < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.ProductDuration_ = ProductDuration_;
   }
   
    public void setProductPrice_(double ProductPrice_ ){
         if(ProductPrice_ < 0){
            throw new IllegalArgumentException("Must be an int");
         }
         
      this.ProductPrice_ = ProductPrice_;
   }
   
   public void setInStock_(double InStock_ ){
      if(ProductPrice_ < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.InStock_ = InStock_;
   }
   
   public void setOutStock_(double OutStock_ ){
      if(OutStock_ < 0){
         throw new IllegalArgumentException("Must be an int");
      }
      
      this.OutStock_ = OutStock_;
   }
// Specail constructor or the final report 
   public String finalReport(){
      return super.finalReport() + "\nDuration In Hours: "+this.getProductDuration_() + "\nThe Price: $" + this.getProductPrice_() + "\nIn Stock: " + this.getInStock_() + "\nOut Stock: " + this.getOutStock_();

  } 
   
   
   
}