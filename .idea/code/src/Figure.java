public  abstract class Figure {
    private String name;
    private  String color;
    private String area;
    public  String getName(){
        return  name;
    }

    public String getColor() {
        return color;
    }

    public String getArea() {
        return area;
    }
    public abstract String getUniq();

    public Figure(String name, String color, String area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }


    @Override
    public String toString() {
        return "Фігура:"+ getName()+"," + "площа:" + getArea()+","+getUniq()+","+"колір:"+getColor();
    }
}
