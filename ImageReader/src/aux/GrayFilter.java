import java.awt.image.RGBImageFilter;
import java.awt.image.FilteredImageSource;

class GrayFilter extends RGBImageFilter {
 
    public int filterRGB(int x, int y, int rgb) {
        
        int red = (rgb & 0x00ff0000) >> 16;
        int green = (rgb & 0x0000ff00) >> 8;        
        int blue = rgb & 0x000000ff;
        int alaph = rgb & 0xff000000;
        double ntsc = 0.299 * red + 0.587 * green + 0.114 * blue;
        int gray = (int)ntsc;
        return alaph+(gray<<16)+(gray<<8)+gray;
    }
}
