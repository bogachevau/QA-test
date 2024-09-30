package core.API.pojo;

public class UnsuccessfulLoginRegisterResponse {
    private String error;

    public UnsuccessfulLoginRegisterResponse(String error) {
        this.error = error;
    }

    public UnsuccessfulLoginRegisterResponse() {
    }

    public String getError() {
        return error;
    }
}
