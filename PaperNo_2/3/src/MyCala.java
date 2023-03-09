
import java.util.List;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uinic
 */
public class MyCala implements ICala {

    public MyCala() {
    }
    

    @Override
    public int f1(List<Cala> arg0) {
        int count = 0;
//       
//        for (Cala x : arg0) {
//            char[] charArray = x.getOwner().toCharArray();
//            int c = 0;
//            for (int i = 0; i < x.getOwner().length(); i++) {
//                if (  (charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z')   ) {
//                    c++;
//                    System.out.println(c);
//                }
//            }
//            if (c == 2) {
//                count++;
//            }
//        }
        for (Cala x : arg0) {
            
         

            if (x.owner.matches("(.*)[a-zA-Z](.*)[a-zA-Z](.*)")) {
                count++;

            }

        }
        return count;
    }

    @Override
    public void f2(List<Cala> arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f3(List<Cala> arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
