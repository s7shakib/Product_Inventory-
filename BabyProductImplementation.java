

// The last class or the Implementation class for the Baby Product 
import javax.swing.JOptionPane;

public class BabyProductImplementation{
   public static void main(String[] args){
      
      BabyProduct ProductType = null;
      
      // Product selections or types 
      do{
         switch(createProductTypes()){
            
            case "Powder":
               ProductType = PowderType();
               break;
            case "Liquid": 
               ProductType = LiquidType();
               break;
          
            default: JOptionPane.showMessageDialog(null,"You have chosen an invalid option");
         }
        } while(ProductType == null);
      
       if (ProductType != null){
               JOptionPane.showMessageDialog(null, ProductType.finalReport());
         }
        
    } 
   
   
    
    public static String createProductTypes (){
      
       String[] Types = {"Powder", "Liquid"};
      
      // This will create Dropdown menu
       return (String) JOptionPane.showInputDialog(null, "Please Select the Type of Baby's Product you would like to add","Product Types", JOptionPane.QUESTION_MESSAGE, null, Types, Types[0]);
   }
   
   
     
   
   
   


  // The required inputs for Powder Class 
  
    public static PowderProduct PowderType(){
         PowderProduct ProductType = null;
         
         do{
            try{
               
               ProductType = new PowderProduct (JOptionPane.showInputDialog("Please Enter the Product Name!"),
                  
                  Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the 5-digit identifier for the Product!")),
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the Price of the Product!")),
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the Duration time for the Product!")),
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter how many of these products are in Stock!")),
                   // Inputs
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter how many of these products are out of Stock!")));
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter an Int");
            }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
            }
         }while(ProductType == null);
               
         return ProductType;
     }
  
    // These are the required inputs for Liquid Class
   
    public static LiquidProduct LiquidType(){
         LiquidProduct ProductType = null;
         
         do{
            try{
               
               ProductType = new LiquidProduct (JOptionPane.showInputDialog("Please Enter the Product Name!"),
                  
                  Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the 5-digit identifier for the Product!")),
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the Price of the Product!")),
                   Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter the Duration time for the Product!")),
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter how many of these products are in Stock!")),
                   
                    Double.parseDouble(JOptionPane.showInputDialog("Note Must be an Int!!\nPlease enter how many of these product are out of Stock!")));
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter an Int");
            }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
            }
         }while(ProductType == null);
               
         return ProductType;
     }
}





