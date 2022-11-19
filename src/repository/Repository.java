package repository;

import exception.MyException;
import model.Animal;

public class Repository implements IRepository{
    private Animal animals[];
    private int capacity = 5, size;

    public Repository(){
        size=0;
        animals = new Animal[capacity];
    }


    @Override
    public void add(Animal a) throws MyException {
        if(this.search(a)==false && size<capacity-1)
            animals[size++] = a;
        else
            throw new MyException("Error occured when adding");
    }

    @Override
    public void remove(Animal a) throws MyException{

        for (int i=0;i<size;i++)
            if(animals[i]==a && this.search(a)==true && size>=0)
            {
                animals[i]=animals[size-1];
                animals[size-1]=null;
                size--;
                return;
            }
        else
            if(this.search(a)==false)
                throw new MyException("An error occured while removing");

    }

    @Override
    public boolean search(Animal a) {
        for (int i=0;i<size;i++)
            if(animals[i]==a)
            {
                return true;
            }
        return false;
    }


    @Override
    public Animal[] getAnimals() {
        return animals;
    }

    @Override
    public int size() {
        return size;
    }
}
