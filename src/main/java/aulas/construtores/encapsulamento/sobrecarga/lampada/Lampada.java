package src.main.java.aulas.construtores.encapsulamento.sobrecarga.lampada;

public class Lampada {

    private String modelo;
    private String tensao;
    private Integer potencia;
    private String cor;
    private String tipoLuz;
    private Integer garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada() {

    }

    public Lampada(String modelo, String tensao, Integer potencia, String cor, String tipoLuz, Integer garantiaMeses, String[] tipos, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public Integer getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(Integer garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("A Lampada está ligada!");
        } else {
            System.out.println("A Lampada está desligada!");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}
