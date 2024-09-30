package core.API.pojo;

import java.util.ArrayList;

public class UsersResource {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private ArrayList<UserDataResource> data;

    public UsersResource(Integer page, Integer per_page, Integer total, Integer total_pages,
                         ArrayList<UserDataResource> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public ArrayList<UserDataResource> getData() {
        return data;
    }
}
