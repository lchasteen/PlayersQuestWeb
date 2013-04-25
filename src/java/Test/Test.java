/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author lchastee
 */
public class Test {
    
    public static void main(String args[]){
 
        String tempName[], retval = null, name = "this            name";
       
        //tempName = name.split(" ");
        //tempName = name.split(" ", 2);        
        String tempN = name.replaceAll("\\s+", " ");        
        System.out.println(name);
        System.out.println(tempN);
        
        
        if(tempN != null){
            retval = tempN;
        }
        tempName = tempN.split(" ");
        System.out.println(String.valueOf(tempName.length));
        
        if(tempName != null){
            if(tempName.length >= 2){
            retval = tempName[0].trim() + "," + tempName[1].trim();
            }else{
                retval = name;
            }
        }
    }
}



