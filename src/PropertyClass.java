public class PropertyClass {
    String name, mActor;
    double rating;

    public PropertyClass(String name, String mActor, double rating) {
        this.name = name;
        this.mActor = mActor;
        this.rating = rating;
    }
    public String toString(){
        return "\nName = "+name+"\nActor = "+mActor+"\nRating = "+rating+"\n\n";
    }
}
