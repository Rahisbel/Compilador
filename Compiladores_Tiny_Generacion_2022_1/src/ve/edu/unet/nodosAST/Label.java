package ve.edu.unet.nodosAST;

public class Label {
    private int number;
    private String label;

    public Label(int number, String label){
        this.number = number;
        this.label = label;
    }

    public int getNumber(){
        return number;
    }

    public String getLabel(){
        return label;
    }
}
