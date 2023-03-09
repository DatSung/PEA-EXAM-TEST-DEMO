
import java.security.acl.Owner;
import javax.jws.Oneway;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uinic
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala(int color) {
        this.color = color;
    }
    
    public SpecCala() {
        
    }
    
    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    
    
    @Override
    public String toString() {
        return owner + ", " + price + ", " + color;
    }
    
    
    public void setData() {  
//        String supString = owner.substring(0, 1);
//        String subString = owner.substring(2, owner.length());
        owner = owner.substring(0, 1) + "XX" + owner.substring(2);
    }
    
    public int getValue() {
        if (color % 2 == 0) {
            return color + 7;
        }
        return color + 3;
    }
}
