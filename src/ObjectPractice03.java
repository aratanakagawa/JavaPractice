public class ObjectPractice03 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=20;
        Double area = circle.getArea();
        Double circum = circle.getCircumference();

        System.out.println(area);
        System.out.println(circum);

    }
}
