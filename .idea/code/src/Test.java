import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Figure> list=new ArrayList<>();
       int c=((int) Math.random()+1);
       for (int i=0;i<c;i++){
           list.add(getFigure((int) (Math.random()*5)));
       }

        for (Figure f:list) {
            System.out.println(f);
        }
    }
    public static Figure getFigure(int number){
        Figure figure;
        String s=":"+(int)(Math.random()*(number+1));
        int n=(int)(Math.random()*5);
switch (number){
    case 1:String p="довжина сторони"+((int)Math.random()+1);
        figure=new Square("квадрат",getcolor(n),s,p);
    break;
    case 2:String q="довжина сторони"+((int)Math.random()+1);
        figure=new Trapezoid("трапеція",getcolor(n),s,q);
    break;
    case 3:String t="радіус"+((int)Math.random()+1);
        figure=new Circle("коло",getcolor(n),s,t);
        break;
    case 4:String u="гіпотенуза"+((int)Math.random()+1);
        figure=new Triangle("трикутник",getcolor(n),s,u);
        break;
    default:
        figure=new Circle("коло","чорний","10 кв.од","радіус 10");
}return  figure;
    }
    public static String getcolor(int num){
        String s="";
        switch (num){
            case 1:s="блакитний";
            break;
            case 2:s="помаранчевий";
                break;
            case 3:s="червоний";
                break;
            case 4:s="жовтий";
                break;
            default:s="чорний";
        }
        return  s;
    }

}
