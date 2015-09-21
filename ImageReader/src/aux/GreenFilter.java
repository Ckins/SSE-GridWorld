import java.awt.image.RGBImageFilter;
import java.awt.image.FilteredImageSource;

class GreenFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int rgb) {
        
        return (rgb & 0xff00ff00);
    }
}
