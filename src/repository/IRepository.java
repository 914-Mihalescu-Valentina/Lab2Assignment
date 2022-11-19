package repository;

import model.Animal;

public interface IRepository {
    void add(Animal a);

    void remove(Animal a);

    boolean search(Animal a);

    Animal[] getAnimals();

    int size();


}
