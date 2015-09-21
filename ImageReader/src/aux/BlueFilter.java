import java.awt.image.RGBImageFilter;
import java.awt.image.FilteredImageSource;

class BlueFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int rgb) {
        return (rgb & 0xff0000ff);
    }
}
