package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem() {

    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double soma = 0.0;

        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> Maior20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                Maior20.add(figura);
            }
        }
        return Maior20;
    }

    public List<Figura> buscarQuadrados(){

        List<Figura> listQuadrados = new ArrayList<>();
        Quadrado quadrado = new Quadrado();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                listQuadrados.add(figura);
            }
        }
        return listQuadrados;
    }

}


