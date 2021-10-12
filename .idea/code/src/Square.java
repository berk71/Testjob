public class Square extends Figure{
    private String uniq;
    public Square(String name, String color, String area,String uniq) {
        super(name, color, area);
        this.uniq=uniq;
    }



    @Override
    public String getUniq() {
        return uniq;
    }


}
