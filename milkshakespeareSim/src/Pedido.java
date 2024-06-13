public class Pedido {
    private int id;
    private boolean concluido;

    public Pedido(int id) {
        this.id = id;
        this.concluido = false;
    }

    public void concluir(){
        this.setConcluido(true);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
