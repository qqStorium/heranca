package q2;
import q1.*;
public class Retangulo extends Quadrilatero {
    private float lado;
    private float altura;
    @Override
    public float calcularArea() {
        return (this.lado*this.altura);
    }
    @Override
    public float calcularPerimetro() {
        return (2*this.lado)+(2*this.altura);
    }
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}