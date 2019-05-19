public class SpacePointTest {
    public static void main(String[] args) {
        SpacePoint spacePoint = new SpacePoint();
        spacePoint.getData();
        System.out.printf("The point (%d,%d) is in %s ",
                spacePoint.point.getPointX(),spacePoint.point.getPointY(), spacePoint.spacePoint());
    }
}
