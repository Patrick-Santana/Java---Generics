package campus;

/**
 *
 * @author Patric
 */
public class Campus2 {
    
    public static void Campus2 (String[] array){
        for(String v: array){
            System.out.println(v);
        }
    }
       
    public static void Campus2(int[] array){
        for(int v : array){
            System.out.println(v);
        }
    }
    
    public static <P> void campus2Generico(P[] array){
        for(P v : array){
            System.out.println(v);
        }
    }
    
    public static void main(String[] args){
        Campus2.campus2Generico(new String[] {"Campus Igarassu"});
        
        System.out.print("");
        
        Campus2.campus2Generico(new String[]{"Campus do Amor"});
        
        System.out.print("");
        
        Campus2.campus2Generico(new Integer[]{17});
        
        
    }

}
