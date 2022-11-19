package model;

public class Cow implements Animal {
    private int weight;
    private String breed;
    private int producedMilk;
    private String colour;

    public Cow(int weight, String colour, String breed, int producedMilk) {
        this.weight = weight;
        this.colour = colour;
        this.breed = breed;
        this.producedMilk = producedMilk;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    public String toString(){
        return "weight: "+this.weight+ " colour: "+this.colour+" breed: "+this.breed+" produced milk: "+this.producedMilk+" ";
    }
}
