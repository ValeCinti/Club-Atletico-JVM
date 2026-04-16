package Implementaciones;

public class NodePilasYColaEstatica {

    private int data;
    private NodePilasYColaEstatica next;

    public NodePilasYColaEstatica(int data, NodePilasYColaEstatica next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodePilasYColaEstatica getNext() {
        return next;
    }

    public void setNext(NodePilasYColaEstatica next) {
        this.next = next;
    }
}