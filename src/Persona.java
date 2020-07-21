public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private int peso;
    private int altura;

    public Persona(){

    }

    public Persona(String nombre,int edad,char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public Persona(String nombre,int edad,String dni,char sexo,int peso,int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;

    }


    public double Imc(){
        double imc=peso/Math.pow((float)altura/100,2);
        return imc;
    }


}
