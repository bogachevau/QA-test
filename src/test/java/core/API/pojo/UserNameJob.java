package core.API.pojo;

public class UserNameJob {
    private String name;
    private String job;

    public UserNameJob(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
