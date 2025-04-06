class ImageLibrary extends Image{
    public void insertImage(int width, int length, String color){
        Image img = new Image(width, length, color);
    }
    public String getImage(Image img){
        if(img.getClass().getName().equals("Image"))
            return img.toString();
        return "No Image Found";
    }
    public boolean searchImage(Image img){
        if(img.getClass().getName().equals("Image"))
            return true;
        return false;
    }
}
public class Q5 {
    public static void main(String[] args) {
        ImageLibrary iml = new ImageLibrary();
        iml.insertImage(150,350,"#85ds69");
        Image img = new Image(360,960,"#5s8f1r");
        System.out.println(iml.getImage(img));
        System.out.println("Does img Exists : "+iml.searchImage(img));
    }
}
