import controller.Controller;
import exception.MyException;
import model.Animal;
import model.Cow;
import model.Pig;
import repository.IRepository;
import repository.Repository;
import model.Bird;

public class Main {
    public static void main(String[] args) {
        IRepository repo = new Repository();
        Controller controller = new Controller(repo);
        Bird bird= new Bird(20,"pink","flamingo",23);
        controller.addAnimal(bird);
        Cow cow= new Cow(1,"red","red sindhi",200);
        controller.addAnimal(cow);
        Pig pig = new Pig(250,"white","chester white");
        controller.addAnimal(pig);
        Bird bird2= new Bird(2,"blue","peacock",30);
        controller.addAnimal(bird2);
        int i;
        for (i=0;i<repo.size();i++)
            System.out.println(repo.getAnimals()[i]);
        controller.removeAnimal(bird);
        System.out.println("///////////////////");
        for ( i=0;i<repo.size();i++)
            System.out.println(repo.getAnimals()[i]);
        System.out.println("//////////////////");
        Animal [] filteredAnimals = controller.filter();
        i=0;
        while (filteredAnimals[i]!=null){
            System.out.println(filteredAnimals[i]);
            i++;
        }
        System.out.println(repo.search(bird));

        try{
        controller.addAnimal(cow);}
        catch (MyException exc){
            System.out.println(exc);
        }

        try{
            controller.removeAnimal(bird2);
            controller.removeAnimal(bird2);

        }
        catch(MyException exc)
        {
            System.out.println(exc);
        }




    }
}