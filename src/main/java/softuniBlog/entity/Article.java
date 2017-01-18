package softuniBlog.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articles")
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String imgurl;
    private String imgurltwo;
    private String imgurlthree;
    private User author;
    private Category category;
    private Set<Tag> tags;

    public Article() {

    }

    public Article(String title, String content, String imgurl, String imgurltwo, String imgurlthree,User author, Category category, HashSet<Tag> tags) {
        this.title = title;
        this.content = content;
        this.imgurl = imgurl;
        this.imgurltwo = imgurltwo;
        this.imgurlthree = imgurlthree;
        this.author = author;
        this.category = category;
        this.tags = tags;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Column()
    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Column()
    public String getImgurltwo() {
        return imgurltwo;
    }

    public void setImgurltwo(String imgurltwo) {
        this.imgurltwo = imgurltwo;
    }

    @Column()
    public String getImgurlthree() {
        return imgurlthree;
    }

    public void setImgurlthree(String imgurlthree) {
        this.imgurlthree = imgurlthree;
    }


    @ManyToOne()
    @JoinColumn(nullable = false, name = "authorId")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }


    @ManyToOne()
    @JoinColumn(nullable = false, name = "categoryId")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Transient
    public String getSummary() {

        return this.getContent().substring(0, this.getContent().length() / 2) + "...";
    }


    @ManyToMany()
    @JoinColumn(table = "articles_tags")
    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

}
