package consultaferiados.model;

public class Feriados {
    private String data;
    private String nome;
    private String tipo;

    public Feriados() {
    }

    public Feriados(String nome, String data, String tipo) {
        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
    }

    public String getData(){
        return data;
    }

    public void setData(String date){
        this.data = date;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String type){
        this.tipo = type;
    }
}
