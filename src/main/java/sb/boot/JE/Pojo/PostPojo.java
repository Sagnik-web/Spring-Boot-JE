package sb.boot.JE.Pojo;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;


public class PostPojo {


    private String title;
//    private String description;

    public PostPojo(String title) {
        this.title = title;
//        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
