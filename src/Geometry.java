
public class Geometry {
	public static double circleArea(double radius) {
		return (radius * radius) * Math.PI;
	}
	public static double cylinderVolume(double radius, double height) {
		return (circleArea(radius) * height);
	}
}
