package school.sptech;

public abstract class Figura {

    private String cor;
    private Integer espessura;

    public abstract Double calcularArea();

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public Figura() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString(){

        return "Cor: " + cor +
                "/n Espessura: " + espessura;
    }
}
