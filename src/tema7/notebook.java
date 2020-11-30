package tema7;

public class notebook extends PC {

    private static final long serialVersionUID = 1L;
    private PC typeOfPC;

    public notebook(int power, String name, boolean issilicon) {
        super(power, name, issilicon);
        this.typeOfPC = null;

    }

    public void settypeOfnotebook(notebook typeOfCar) {
        this.typeOfPC = typeOfCar;
    }

    @Override
    public String toString() {
        return super.toString() + "notebook{" + "typeOfnotebook=" + typeOfPC + '}';
    }

    void settypeOfCar(PC hp) {
    }

}
