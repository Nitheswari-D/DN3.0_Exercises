package proxypattern;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image will be loaded and displayed from the server
        image1.display();

        // The image will be displayed from cache
        image1.display();

        // The image will be loaded and displayed from the server
        image2.display();
    }
}
