public class Main {

    static int timeout = 10;
    public static void main(String[] args) {
        System.out.println("Hello Janis Java 1");
//vesls sakitis
        int x = 5;
        int y = 10;
        float Tmp = 40.22222222222F;
        System.out.println(Tmp);

        System.out.println("x ir vienads ar:");
        System.out.println(x);
        System.out.println("y ir vienads ar:");
        System.out.println(y);
        System.out.println("x+y ir vienads ar:");
        System.out.println(x+y);

        //[Mainiga tiops][mainga nosakums] = [vertoiba];
        //vardi un teikumi java valoda tiek saglabti mainiga tipa "String"

        String dogName = "Daisy";
        //veseli skati tiek defineti ar mainiga tipu 'int'
        int dogAge = 6;
        // dalskatiki tiek defineti ar mainigu tipi 'double' vai 'float'
        double dogWeight = 15.5;
        String dogBreed = "French Bulldog";
        //Ja(true) un Ne (false) jautajums tiek definets ar mainiga tipu 'boolean'
        boolean isDogHungry = false;
        boolean isDogVaccinated = true;
        // vienu siboliu definu ar mainga tipu 'char'
        char currency= '$';
        int dogPrice = 100;
        char dogGender = 'M';

        System.out.println("Suna vards: "+ dogName + "Suna vards: "+ dogName);
        System.out.println("Suna vecums: "+ dogAge);
        System.out.println("Suna svars: "+ dogWeight);
        System.out.println("Suna breed: "+ dogBreed);
        System.out.println("Suns izalcis: "+ isDogHungry);
        System.out.println("Suns izalcis: "+ isDogVaccinated);
        System.out.println("Suns kuceni maksa: " + dogPrice + currency );

        byte age = 10;
        short deepestSeaLevel = 1000;
        int highestIntNumber =213125;
        long USACountrydebt = 2222222222222222L;

        System.out.println(age);
        System.out.println(deepestSeaLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountrydebt);

//int summa
        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;


       int starpiba =  pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
       int dalijums = pirmaisSkaitlis / otraisSkaitlis;
       int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
       int alikums = pirmaisSkaitlis % otraisSkaitlis;

       System.out.println(dalijums);
        System.out.println(starpiba);
        System.out.println(reizinajums);
        System.out.println(alikums);

        int a = 1;
        int b = 4;
        int c = 7;

        System.out.println("Ja atlikums ir 0, tad para skaitlis" + a%2);
        if ( b % 2 == 0 ){
            System.out.println("sis ir para skaitlis");
        }



        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);
        System.out.println(timeout);








    }



}
