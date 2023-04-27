package uninove.calculadora;

public class Imc {

    public float calculaIMC(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public String classificaIMC(float imc) {
        //classificação baseada na SBN: https://arquivos.sbn.org.br/equacoes/eq5.htm
        String classifc = "";

        if (imc < 16) {
            classifc = "Magreza grau III";
        } else if (imc >= 16 && imc <= 16.9) {
            classifc = "Magreza grau II";
        } else if (imc > 16.9 && imc <= 18.4) {
            classifc = "Magreza grau I";
        } else if (imc > 18.4 && imc <= 24.9) {
            classifc = "Adequado";
        } else if (imc > 24.9 && imc <= 29.9) {
            classifc = "Pré-obeso";
        } else if (imc > 29.9 && imc <= 34.9) {
            classifc = "Obesidade grau I";
        } else if (imc > 34.9 && imc <= 39.9) {
            classifc = "Obesidade grau II";
        } else {
            classifc = "Obesidade grau III";
        }

        return classifc;
    }
}
