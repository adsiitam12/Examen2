package mx.com.itam.adsi.examen;
/**Clase Node para el examen.
 *
 */
public class Node {
        private String data;
        private Node next;
        
        /**Constructor de Node, recibe el dato.
         *@param data - el dato del nodo
         */
        Node(String data) {
            this.data = data;
        }
        /**Setter para Next.
         *@param next - el siguiente nodo
         */
        public void setNext(Node next){
            this.next = next;
        }

        /**Metodo gus.
         *Voltea la cadena de nodos a parti del nodo del nodo que lo invoco.
         *Por ejemplo, si se tiene A->B->C y se invoca el metodo A.gus, la cadena queda como:
         * c->B->A
         * @return Node - El primer nodo de la cadena reordenada
         */
        public Node gus() {
            if(next == null){ 
               return this; //Si no hay siguiente regresa este nodo
            }
            Node otro = next; //Accesa tu siguiente nodo
            next      = null; 
            Node tavo = otro.gus(); //Voltea los nodos a partir de tu siguiente
            otro.next = this; //Agregate al final de los nodos volteados
            return tavo;
        }
      
        /**
         * Imprime en la consola la secuencia de Nodos que 
         * componen a esta lista. Por ejemplo, para la lista
         * que devuelve el método "build", la invocación de
         * este método escribe en la consola: 
         * 
         * A-->B-->C-->D-->E-->F
         * 
         * Lo anterior sería lo que se visualiza en la consola 
         * justo después de ejecutar las siguintes dos lineas:
         * 
         *         Node a = build();
         *         a.prn();
         *         
         */
        void prn() {
            if(next == null){
                System.out.println(data);
            }else{
                System.out.print(data+"-->");
                next.prn();
            }

        }
        
    }// ends Node class


