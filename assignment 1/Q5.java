import java.util.ArrayList;

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
    public boolean equals(Object obj){
        if (this==obj) return true;
        if(obj instanceof Image){
            Image i = (Image)obj;
            return (this.imageLength == i.imageLength) && (this.imageWidth==i.imageWidth) && (this.colorCode.equalsIgnoreCase(i.colorCode));
        }
        else
            return false;
    }
}

class ImageLibrary{
    ArrayList<Image> imgList;
    ImageLibrary(){
        imgList = new ArrayList<>();
    }
    public void insertImage(Image img){
        imgList.add(img);
    }
    public Image searchImage(Image img){
        for (Image image : imgList) {
            if(image.equals(img))
                return image;
        }
        return null;
    }
    public Image getImage(int index){
        if(index>=0 && index<imgList.size())
            return imgList.get(index);
        return null;
    }
    public void display(){
        for (Image image : imgList) {
            System.out.println(image);
        }
    }

}

public class Q5 {
    public static void main(String[] args) {
        ImageLibrary il = new ImageLibrary();

        il.insertImage(new Image(250,364, "#hahbcc"));
        il.insertImage(new Image(652, 260, "#6594dc"));
        il.insertImage(new Image(500, 400, "#sc95sc"));
  
        Image i1 = new Image(350, 650, "#hc464s");
        Image i2 = new Image(500, 400, "#sc95sc");

        System.out.println(il.searchImage(i1));
        System.out.println(il.getImage(0));
    
        System.out.println(il.searchImage(i2));
        System.out.println(il.getImage(1));

        il.display();

    }
}
