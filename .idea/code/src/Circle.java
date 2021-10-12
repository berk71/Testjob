public class Circle extends Figure{
    private String uniq;

    public Circle(String name, String color, String area, String uniq) {
        super(name, color, area);
        this.uniq = uniq;
    }

    public Circle(String name, String color, String area) {
        super(name, color, area);
    }



    @Override
    public String getUniq() {
        return uniq;
    }
}
