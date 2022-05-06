package Parser;

public interface SimpleParser {
    String parse(String filePath, String tag);

    default String[] parse(String filePath, String tag1, String tag2){
        return new String[2];
    }
}
