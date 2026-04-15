package br.com.fiap.lanhouse.model;

public class Computador {

    private String processador;
    private int id;
    private String placaVideo;
    private double armazenamento;
    private boolean possuiSsd;
    private int memoriaRam;

    public Computador(String processador, int id){
        this.processador = processador;
        this.id = id;
    }

    public Computador(String processador, int id, String placaVideo, double armazenamento, boolean possuiSsd, int memoriaRam){
        this(processador, id);
        this.placaVideo = placaVideo;
        this.memoriaRam = memoriaRam;
        this.possuiSsd = possuiSsd;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean getPossuiSsd() {
        return possuiSsd;
    }

    public void setPossuiSsd(boolean possuiSsd) {
        this.possuiSsd = possuiSsd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
