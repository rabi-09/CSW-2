class Image{
    private int imageWidth, imageLength;
    private String colorCode;

    public Image(int imageWidth, int imageLength, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageLength = imageLength;
        this.colorCode = colorCode;
    }
    public Image() {
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageLength() {
        return imageLength;
    }

    public void setImageLength(int imageLength) {
        this.imageLength = imageLength;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageWidth=" + imageWidth +
                ", imageLength=" + imageLength +
                ", colorCode=" + colorCode +
                '}';
    }
}
public class Q4 {
    public static void main(String[] args) {
         Image i1 = new Image(15,35,"#suidhc");
         Image i2 = new Image();
         i2.setImageWidth(150);
         i2.setImageLength(360);
         i2.setColorCode("#jksdh5");
        System.out.println(i1);
        System.out.println(i2);
    }
}
