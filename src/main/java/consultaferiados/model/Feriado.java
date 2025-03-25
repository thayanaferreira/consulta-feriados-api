package consultaferiados.model;

public class Feriado {
    private String date;
    private String name;
    private String type;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
