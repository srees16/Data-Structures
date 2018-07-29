
public class TimeClass {
	private int hour;
	private int minute;
	private int second;
	
	public void thetime (int H, int M, int S) {
		hour = ((H>=0 && H < 24)? H : 0);
		minute = ((M>=0 && M < 60)? M : 0);
		second = ((S>=0 && S < 60)? S : 0);
	}
	public String toString () {
		return String.format("%d:%2d:%d %s", (hour==0 || hour ==12) ? 12 : hour%12, minute , second, (hour<=12 ? "AM" : "PM"));
		}
}
/*
 	private int hour;
	private int minute;
	private int second;
	
	public void time (int h , int m , int s) {
		
			hour = ((h>=0 && h<24) ? h : 0);
			minute = ((m>=0 && m<60) ? m : 0);
			second = ((s>=0 && s<60) ? s : 0);
	}
	public String militarytime () {
		return String.format("%02d%02d", hour , minute, second);
	}
	public String twelvehrfrmt () {
		return String.format("%d:%2d:%2d %s", (hour==0 || hour ==12)? 12: hour %12, minute , second, (hour < 12? "AM" : "PM"));
	} 
 */
