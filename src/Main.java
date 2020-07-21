public class Main {
    public static void main(String[] args) {

        Persona pepe=new Persona();

        Persona paco= new Persona("Paco",34,'H');

        Persona max= new Persona("Max",38,"111178x",'H',78,183);

        System.out.println(max.Imc());
        System.out.println(pepe.Imc());

    }
}

