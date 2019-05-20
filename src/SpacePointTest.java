public class SpacePointTest {
    public static void main(String[] args) {
        SpacePoint spacePoint = new SpacePoint();
        Point point = new Point();
        spacePoint.getData(point);
        System.out.printf("The point (%d,%d) is in %s ",
                point.getPointX(),point.getPointY(), spacePoint.spacePoint(point));
    }
}
