package models;

public class SessionScore {

    private Integer levelId;
    private String sessionKey;
    private Integer score;

    public SessionScore(Integer levelId, String sessionKey, Integer score) {
        this.levelId = levelId;
        this.sessionKey = sessionKey;
        this.score = score;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
