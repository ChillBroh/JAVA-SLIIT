
public class Inclass {
	double width, height, length;
	

	Inclass(Inclass x) {
		width = x.width; //access using . operator
		height = x.height;
		length = x.length;
	}
	
	Inclass(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}
	
	double volume() {
		return width * height * length;
	}
	
	
}
