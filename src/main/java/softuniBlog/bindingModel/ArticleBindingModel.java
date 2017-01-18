package softuniBlog.bindingModel;

import javax.validation.constraints.NotNull;


public class ArticleBindingModel {
    @NotNull
    private String title;
    @NotNull
    private String content;
    private String imgurl;


    private String imgurltwo;
    private String imgurlthree;
    private Integer categoryId;
    private String tagString;

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


    public Integer getCategoryId(){

        return categoryId;
    }
    public void setCategoryId(Integer categoryId){
        this.categoryId=categoryId;
    }


    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }


    public String getImgurltwo() {
        return imgurltwo;
    }

    public void setImgurltwo(String imgurltwo) {
        this.imgurltwo = imgurltwo;
    }

    public String getImgurlthree() {
        return imgurlthree;
    }

    public void setImgurlthree(String imgurlthree) {
        this.imgurlthree = imgurlthree;
    }
}
