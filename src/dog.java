public class dog extends Pet
{
    private String breed;

    public dog (String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }//end full constructor with call to super

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;

        return output;
    }// toString with call to super
}//end class dog
