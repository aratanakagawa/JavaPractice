public class ObjectPractice02 {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        Double area = circle.getArea();
        Double circum = circle.getCircumference();

        System.out.println(area);
        System.out.println(circum);

    }
}
