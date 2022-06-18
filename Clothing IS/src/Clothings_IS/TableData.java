/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clothings_IS;

/**
 *
 * @author rahul
 */
public class TableData {
    private int Code, Price, Quantity;
    private String Brands, Category, Gender, Season;

    public TableData (String Code, String Brands,String Category, String Price, String Quantity, String Gender, String Season) {
        this.Code = Integer.parseInt(Code);
        this.Brands = Brands;
        this.Category = Category;
        this.Price = Integer.parseInt(Price);
        this.Quantity = Integer.parseInt(Quantity);
        this.Gender = Gender;
        this.Season = Season;
        
    }

    
    public int getCode(){
        return  Code;
    }
    
    public String getStringCodes(){
        return String.valueOf(Code);
    }
    
    
    public void setCode(String Code) {
        this.Code = Integer.parseInt(Code);
    }
    
    public String getBrands(){
        return Brands;
    }
    
    public String getCategory(){
        return  Category;
    }
    
    public int getPrice(){
        return Price;
    }
    
    public String getStringPrices(){
        return String.valueOf(Price);
    }
    
    
    public void setPrice(String Price) {
        this.Price = Integer.parseInt(Price);
    }
    
    
    public int getQuantity(){
        return Quantity;
    }
    
    public String getStringQuantities(){
        return String.valueOf(Quantity);
    }
    
    
    public void setQuantity(String Quantity) {
        this.Quantity = Integer.parseInt(Quantity);
    }
    
    public String getGender(){
        return Gender;
    }
    
    public String getSeason(){
        return Season;
    }
    
    @Override
    public String toString() {
        return "TableData{" + "Code=" + Code + ", Brands=" + Brands + ", Category=" + Category + ", Price=" + Price + ", Quantity=" + Quantity + ", Gender=" + Gender + ", Season=" + Season + '}';
    }
    
    
    
    
}
