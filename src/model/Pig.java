package model;

public class Pig implements Animal {
    private String species;
    private int weight;
    private String colour;

    public Pig(int weight, String colour,String species) {
        this.weight = weight;
        this.colour = colour;
        this.species = species;
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
        return "weight: "+this.weight+ " colour: "+this.colour+" species: "+this.species+" ";
    }
}
