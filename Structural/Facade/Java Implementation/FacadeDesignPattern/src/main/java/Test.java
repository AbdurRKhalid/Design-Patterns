import java.io.File;

public class Test {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("example.ogg", "mp4");
    }
}
