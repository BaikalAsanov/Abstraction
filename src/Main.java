// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cow cow1=new Cow(400,5, "Female","Darya");
        Cow cow2=new Cow(1100,7, "Male","Borya");
        Cow cow3=new Cow(800,13, "Female","Kwasha");
        Cow cow4=new Cow(775,9, "Female","Varya");
        Cow cow5=new Cow(300,2,"Male","Gena");
        Sheep sheep1=new Sheep(300,4,"Female","Byasha");
        Sheep sheep2=new Sheep(125,6,"Female","Ovyasha");
        Sheep sheep3=new Sheep(250,3,"Male","Brashick");
        Sheep sheep4=new Sheep(187,9,"Female","Masha");
        Horse horse1=new Horse(1100,7,"Male","Mustang","Blonde");
        Horse horse2=new Horse(600,5,"Female","Vera","Brown");
        Horse horse3=new Horse(876,7,"Female","Nadezhda","White");
        AbstractAnimals[] animals={cow1,cow2,cow3,cow4,sheep1,sheep2,sheep3,horse1,horse2};
        AbstractAnimals[] animals2={cow5,sheep4,horse3};
        Farm1 farm1=new Farm1("ZhylAldy",animals,"Kumar");
        Farm2 farm2=new Farm2("ZhanyChek",animals2,"Samagan");
        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
    }
}