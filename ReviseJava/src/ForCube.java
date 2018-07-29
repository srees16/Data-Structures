
public class ForCube {
	int height;
	int length;
	int bredth;
	
	public int cubevol () {
		return (height * length * bredth);
	}
	ForCube () {
	height = 12;
	length = 13;
	bredth = 14;
	}	
	ForCube (int h, int l, int b) {
	height = h;
	length = l;
	bredth = b;
	}
}