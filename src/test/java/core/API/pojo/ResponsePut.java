package core.API.pojo;

public class ResponsePut {
    private String name;
    private String job;
    private String updatedAt;

    public ResponsePut() {
    }

    public ResponsePut(String name, String job, String updatedAt) {
        this.name = name;
        this.job = job;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
