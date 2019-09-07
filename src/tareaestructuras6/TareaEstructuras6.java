package tareaestructuras6;


public class TareaEstructuras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarListaOrdenada(1, 30, 20, "1DR");
        lista.insertarListaOrdenada(6, 5, 3, "2DR");
        lista.insertarListaOrdenada(500, 200, 100, "3DR");
        lista.insertarListaOrdenada(3, 30, 40, "5DR");
        lista.insertarListaOrdenada(7, 15, 30, "8DR");
        lista.insertarListaOrdenada(100, 70, 80, "10DR");
        lista.insertarListaOrdenada(200, 500, 50, "11DR");
        lista.mostrar();
        System.out.println("------------------------------------");
        lista.stockMinimo();
        lista.mostrar();
        System.out.println("------------------------------------");
        lista.eliminar();
        lista.mostrar();
    }
    
}
