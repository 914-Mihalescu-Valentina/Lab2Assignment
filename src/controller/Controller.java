package controller;

import model.Animal;
import repository.IRepository;

public class Controller {
    IRepository repository;

    public Controller(IRepository repo){
        this.repository = repo;
    }

    public void addAnimal(Animal a) {
        this.repository.add(a);
    }

    public void removeAnimal(Animal a){
        this.repository.remove(a);
    }

    public int getSize(){
        return this.repository.size();
    }

    public Animal[] filter(){

        Animal[] filteredAnimals = new Animal[this.repository.size()];
        int filteredSize = 0;
        for (int i = 0; i < this.repository.size(); i++) {
            if (this.repository.getAnimals()[i].getWeight() > 3)
                filteredAnimals[filteredSize++] = this.repository.getAnimals()[i];

        }
        return filteredAnimals;

    }

}
