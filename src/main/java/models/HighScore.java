package models;

public class HighScore {

    private Integer userId;
    private Integer levelId;
    private Integer score;

    public HighScore(Integer userId, Integer levelId, Integer score) {
        this.userId = userId;
        this.levelId = levelId;
        this.score = score;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
