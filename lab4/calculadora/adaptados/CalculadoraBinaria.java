package lab4.calculadora.adaptados;

public class CalculadoraBinaria {
    public String somar(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public String subtrair(String a, String b) {
        if (Integer.parseInt(a, 2) < Integer.parseInt(b, 2)) {
            return "-" + Integer.toBinaryString(Integer.parseInt(b, 2) - Integer.parseInt(a, 2));
        }
        return Integer.toBinaryString(Integer.parseInt(a, 2) - Integer.parseInt(b, 2));
    }
}
