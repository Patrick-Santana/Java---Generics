package arraylist;

/**
 *
 * @author alunoifpe
 */
public class Arraylist {
    
    public static <T> void ArraylistNull(T[] array){
        int i = 0;
        for(T b : array){
            if(b == null){
                i++;
            }
        }
        System.out.println(i);
    }
       
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Arraylist.ArraylistNull(new Integer[] {70,12,null,null, 0});
    }
    
}
