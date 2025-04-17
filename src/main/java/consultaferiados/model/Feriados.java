package consultaferiados.model;

public class Feriados {
    private String data;
    private String nome;
    private String tipo;

<<<<<<< HEAD
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

=======
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

>>>>>>> 34cf2e1e474cb64e23d86b121c9784d32aa5b8bf
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String type){
        this.tipo = type;
    }
}
