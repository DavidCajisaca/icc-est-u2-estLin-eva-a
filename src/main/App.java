package main;

import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
    LogicaClasificacion mc= new LogicaClasificacion();
    Queue<String>cola = null;
    cola.add("Pedro");
    cola.add("Juan");
    cola.add("Maria");
    mc.invertirColaNombres(cola);

    }
}
