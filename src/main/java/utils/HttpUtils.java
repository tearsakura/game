package utils;

public class HttpUtils {

    private static final HttpUtils INSTANCE = new HttpUtils();

    public static final String LOGIN_PATH = "login";
    public static final String HIGHSCORE_PATH = "highscore";
    public static final String SCORE_PATH = "score";

    public static final String GET_HTTP_METHOD = "GET";
    public static final String POST_HTTP_METHOD = "POST";

    public static final String LOGIN_PATTERN = "\\d";
    public static final String HIGHSCORE_PATTERN = "";
    public static final String SCORE_PATTERN = "";

    private HttpUtils() {
    }

    public static HttpUtils getInstance() {
        return INSTANCE;
    }

}
