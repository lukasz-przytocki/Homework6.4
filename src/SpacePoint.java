import java.util.Scanner;
public class SpacePoint {
    private Scanner input = new Scanner(System.in);
//    private Point point;
    int pointX;
    int pointY;

    String spacePoint() {

        System.out.println("Enter X coordinate");
        pointX = input.nextInt();
        System.out.println("Enter Y coordinate");
        pointY = input.nextInt();

        if (pointX > 0 && pointY > 0) {
            return "I -st quarter of the coordinate system.";

        } else if (pointX < 0 && pointY > 0) {
            return "II -nd quarter of the coordinate system.";

        }else if (pointX < 0 && pointY < 0) {
            return "III -rd quarter of the coordinate system.";

        } else if (pointX > 0 && pointY < 0) {
            return "IV -th quarter of the coordinate system.";

        } else if(pointX == 0 && pointY != 0) {
            return "Y axis.";

        } else if(pointX != 0 && pointY == 0) {
            return "X axis.";

        } else {
            return "Centre of coordinate system.";
            }


    }


}
