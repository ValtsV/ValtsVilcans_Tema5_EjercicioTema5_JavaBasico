package interfaces;

import interfacezzz.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Saves");
    }

    @Override
    public void findAll() {
        System.out.println("Finds");
    }

    @Override
    public void delete() {
        System.out.println("Deletes");
    }
}
