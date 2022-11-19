package model;

public class Bird implements Animal {
    private String name;
    private int flightSpeed;
    private int weight;
    private String colour;

    public Bird(int weight, String colour,String name, int flightSpeed) {
        this.weight = weight;
        this.colour = colour;
        this.name = name;
        this.flightSpeed = flightSpeed;
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
        return "weight: "+this.weight+ " colour: "+this.colour+" name: "+this.name+" flight speed: "+this.flightSpeed+" ";
    }
}
