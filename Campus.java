package campus;

/**
 *
 * @author Patric
 * @param <C>
 * @param <V>
 */
public class Campus<C,V>{


    private C chave;
    private V valor;
    
        public Campus(C chave, V valor){
            this.setChave(chave);
            this.setValor(valor);   
        }
        
        public C getChave(){
            return this.chave;
        }
        
        public void setChave(C chave){
            this.chave = chave;
        }
        
        public V getValor(){
            return this.valor;
        }
        
        public void setValor(V valor){
            this.valor = valor;
        }
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* Campus<String, String> c1 = new Campus<String, String> ("Campus Recife","Pernambuco");
        System.out.println(c1.getChave() + "-------" + c1.getValor());*/
        
        Campus<String, Double> c2 = new Campus<String,Double>("Campus Igarassu" , 17.4);
         System.out.println(c2.getChave() + "-------" + c2.getValor());
         
        /*Campus<String, Double> c3 = new Campus<String,Double>("Campus João Pessoa" , 92.0);
         System.out.println(c3.getChave() + "-------" + c3.getValor()); */
    }
    
}
