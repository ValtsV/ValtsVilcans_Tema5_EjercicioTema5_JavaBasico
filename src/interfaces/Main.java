package interfaces;


public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl test = new CocheCRUDImpl();

        test.save();
        test.findAll();
        test.delete();
    }
}
