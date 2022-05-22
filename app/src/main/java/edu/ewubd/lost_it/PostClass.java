package edu.ewubd.lost_it;

public class PostClass {
        private String post_details;
        private String post_imageUrl;
        private String post_date;
        String user_Email;

        public PostClass() {
        }

    public PostClass(String user_email, String date, String post_detail, String imageUrl) {
        if (post_detail.trim().equals("")) {
            post_details = "No post";
        }
        user_Email = user_email;
        post_date = date;
        post_details = post_detail;
        post_imageUrl = imageUrl;
    }

    public String getPost_details() {
        return post_details;
    }

    public void setPost_details(String post_details) {
        this.post_details = post_details;
    }

    public String getPost_imageUrl() {
        return post_imageUrl;
    }

    public void setPost_imageUrl(String post_imageUrl) {
        this.post_imageUrl = post_imageUrl;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }
}
