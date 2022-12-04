public abstract class Rueda {

    private int size;

    public Rueda(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean estaPuesta(){
        return true;
    };
}
