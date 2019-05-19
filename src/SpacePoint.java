import java.util.Scanner;
public class SpacePoint {
    private Scanner input = new Scanner(System.in);
    Point point = new Point();

      void getData(){
        System.out.println("Enter X coordinate");
        point.setPointX(input.nextInt());
        System.out.println("Enter Y coordinate");
        point.setPointY(input.nextInt());
    }

    public String spacePoint() {

        if (point.getPointX() > 0 && point.getPointY() > 0) {
            return "I -st quarter of the coordinate system.";

        } else if (point.getPointX() < 0 && point.getPointY() > 0) {
            return "II -nd quarter of the coordinate system.";

        }else if (point.getPointX() < 0 && point.getPointY() < 0) {
            return "III -rd quarter of the coordinate system.";

        } else if (point.getPointX() > 0 && point.getPointY() < 0) {
            return "IV -th quarter of the coordinate system.";

        } else if(point.getPointX() == 0 && point.getPointY() != 0) {
            return "Y axis.";

        } else if(point.getPointX() != 0 && point.getPointY() == 0) {
            return "X axis.";

        } else {
            return "Centre of coordinate system.";
            }


    }


}
