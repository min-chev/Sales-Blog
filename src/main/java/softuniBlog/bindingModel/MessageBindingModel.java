package softuniBlog.bindingModel;

import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MessageBindingModel {
    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private String phoneormail;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getPhoneormail() {
        return phoneormail;
    }

    public void setPhoneormail(String phoneormail) {
        this.phoneormail = phoneormail;
    }


}
