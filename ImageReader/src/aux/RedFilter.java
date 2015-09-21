import java.awt.image.RGBImageFilter;
import java.awt.image.FilteredImageSource;

public final class RedFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int rgb) {
        return (rgb & 0xffff0000);
    }
}
