public class Trapezoid extends Figure{
    private  String uniq;

    public Trapezoid(String name, String color, String area, String uniq) {
        super(name, color, area);
        this.uniq = uniq;
    }

    @Override
    public String getUniq() {
        return uniq;
    }


}
