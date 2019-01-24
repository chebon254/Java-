import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<PropertyClass> list;
        PropertyClass movie;
        list = new ArrayList<>();
        movie = new PropertyClass("wakanda","Lupita",5.5);
        list.add(movie);

        movie = new PropertyClass("Siren","That Guy",5.5);
        list.add(movie);

        movie = new PropertyClass("skycrapper","The Rock",4.5);
        list.add(movie);
        System.out.println(list.toString());
    }
}
