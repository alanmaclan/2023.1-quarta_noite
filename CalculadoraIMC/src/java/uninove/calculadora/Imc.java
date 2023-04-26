package uninove.calculadora;

public class Imc {
    
    public float calculaIMC(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }
    
}
