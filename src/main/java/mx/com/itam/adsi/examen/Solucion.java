package mx.com.itam.adsi.examen;
/**Clase Main Solucion para el examen.
 *
 */
public class Solucion{
    
    /**
     * Método que crea 6 Nodos cada uno con una letra diferente y
     * luego a cada uno en su propiedad next le asigna el siguiente.
     * 
     * @return Node Regresa el primero que se creó.
     */
    private Node build() {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba.
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.setNext(d);
        c = c.gus();
        c.prn();   
    }
    /**Main para probar el proyecto.
     *@param argv - argumentos
     */
    public static void main(String...argv) {
        new Solucion().ok();
    }

}
