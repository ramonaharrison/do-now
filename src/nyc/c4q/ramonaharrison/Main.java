package nyc.c4q.ramonaharrison;


public class Main {

    public static void main(String[] args) {

        MyCollection<String> colors = new MyCollection<String>();
        System.out.println(colors.isEmpty());
        System.out.println(colors);

        colors.add("Red");
        System.out.println(colors);
        colors.add("Orange");
        System.out.println(colors);
        colors.add("Yellow");
        System.out.println(colors);
        colors.add("Green");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println(colors);

        System.out.println(colors.contains("Purple"));
        System.out.println(colors.contains("Cat"));
        colors.remove("Purple");
        colors.remove("Cat");
        System.out.println(colors.contains("Purple"));






    }
}

