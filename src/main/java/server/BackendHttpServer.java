package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import models.SessionLogin;
import utils.HttpUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackendHttpServer {

    public static void main(String[] args) {
        HttpServer server;
        try {
            server = HttpServer.create(new InetSocketAddress(8000), 0);
            server.createContext("/", new ContextDispatcher());
            server.setExecutor(null);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ContextDispatcher implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            Pattern pattern = Pattern.compile("\\b[0-9][0-9][0-9][0-9]");
            Matcher matcher = pattern.matcher(t.getRequestURI().toURL().toString());
            String path = t.getRequestURI().toURL().getPath();
            String[] pathArray = path.split("/");
            if(t.getRequestMethod().equals(HttpUtils.GET_HTTP_METHOD)) {
                if (pathArray[1].equals(HttpUtils.LOGIN_PATH)) {
                    SessionLogin response = new SessionLogin(1234, "ABC");
                    t.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.getSessionKey().getBytes(StandardCharsets.UTF_8).length);
                    OutputStream os = t.getResponseBody();
                    os.write(response.getSessionKey().getBytes(StandardCharsets.UTF_8));
                    os.close();
                } else if (pathArray[1].equals(HttpUtils.HIGHSCORE_PATH)) {
                    SessionLogin response = new SessionLogin(1234, "ABC");
                    t.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.getSessionKey().getBytes(StandardCharsets.UTF_8).length);
                    OutputStream os = t.getResponseBody();
                    os.write(response.getSessionKey().getBytes(StandardCharsets.UTF_8));
                    os.close();
                }
            } else {
                if (pathArray[1].equals(HttpUtils.SCORE_PATH)) {
                    SessionLogin response = new SessionLogin(1234, "ABC");
                    t.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.getSessionKey().getBytes(StandardCharsets.UTF_8).length);
                    OutputStream os = t.getResponseBody();
                    os.write(response.getSessionKey().getBytes(StandardCharsets.UTF_8));
                    os.close();
                }
            }
        }
    }
}
