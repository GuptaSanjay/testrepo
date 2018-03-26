import java.util.Optional;

public class TestMobileServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public Integer getMobileScreenWidth(Optional<Mobile> mobile){
			return mobile.flatMap(Mobile::getDisplayFeatures)
						 .flatMap(DisplayFeatures::getResolution)
						 .map(ScreenResolution::getWidth)
						 .orElse(0);
	}

}
