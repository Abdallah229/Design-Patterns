import Image.ProxyImage;

public class Main {
    public static void main(String[] args) {

        String fileName = "family.jpg" ;

        ProxyImage proxyImage = new ProxyImage(fileName);

        // image will be loaded from disk
        proxyImage.display();

        System.out.println();
        // image will not be loaded from disk
        proxyImage.display();
    }
}