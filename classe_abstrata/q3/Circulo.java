package q3;
import q1.*;
public class Circulo extends Quadrilatero{
    private float raio;
    @Override
    public float calcularArea() {
        return (float) 3.14*(this.raio*this.raio);
    }
    @Override
    public float calcularPerimetro() {
        return (float) (2*3.14*this.raio);
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public Circulo(float raio) {
        this.raio = raio;
    }
}