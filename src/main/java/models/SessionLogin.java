package models;

public class SessionLogin {

    private Integer userId;
    private String sessionKey;

    public SessionLogin(Integer userId, String sessionKey) {
        this.userId = userId;
        this.sessionKey = sessionKey;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
