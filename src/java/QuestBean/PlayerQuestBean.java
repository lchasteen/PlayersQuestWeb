/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestBean;

/**
 *
 * @author lchastee
 */
public class PlayerQuestBean {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        String tempName[], retval = null;
       
        //tempName = name.split(" ");
        //tempName = name.split(" ", 2);        
        String tempN = name.replaceAll("\\s+", " ");        
        if(tempN != null){
            retval = tempN;
        }
        tempName = tempN.split(" ");
        
        if(tempName != null){
            if(tempName.length == 2){
            retval = tempName[0].trim() + ", " + tempName[1].trim();
            }else{
                retval = name;
            }
        }
        
        
        return retval;
    }
    
}
