/**
 * manage.kunta-api.dev
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.management.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.metatavu.management.client.model.PostContent;
import fi.metatavu.management.client.model.PostExcerpt;
import fi.metatavu.management.client.model.PostGuid;
import fi.metatavu.management.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Page
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:08:15.286+02:00")
public class Page   {
  @JsonProperty("date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime date = null;

  @JsonProperty("date_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime dateGmt = null;

  @JsonProperty("guid")
  private PostGuid guid = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("modified")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modified = null;

  @JsonProperty("modified_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modifiedGmt = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("slug")
  private String slug = null;

  /**
   * A named status for the object.
   */
  public enum StatusEnum {
    PUBLISH("publish"),
    
    FUTURE("future"),
    
    DRAFT("draft"),
    
    PENDING("pending"),
    
    PRIVATE("private");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("parent")
  private Integer parent = null;

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("content")
  private PostContent content = null;

  @JsonProperty("author")
  private Integer author = null;

  @JsonProperty("excerpt")
  private PostExcerpt excerpt = null;

  @JsonProperty("featured_media")
  private Integer featuredMedia = null;

  /**
   * Whether or not comments are open on the object.
   */
  public enum CommentStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    CommentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CommentStatusEnum fromValue(String text) {
      for (CommentStatusEnum b : CommentStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("comment_status")
  private CommentStatusEnum commentStatus = null;

  /**
   * Whether or not the object can be pinged.
   */
  public enum PingStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    PingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PingStatusEnum fromValue(String text) {
      for (PingStatusEnum b : PingStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("ping_status")
  private PingStatusEnum pingStatus = null;

  @JsonProperty("menu_order")
  private Integer menuOrder = null;

  @JsonProperty("template")
  private String template = null;

  public Page date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date the object was published, in the site's timezone.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published, in the site's timezone.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Page dateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
    return this;
  }

   /**
   * The date the object was published, as GMT.
   * @return dateGmt
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published, as GMT.")
  public LocalDateTime getDateGmt() {
    return dateGmt;
  }

  public void setDateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
  }

  public Page guid(PostGuid guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostGuid getGuid() {
    return guid;
  }

  public void setGuid(PostGuid guid) {
    this.guid = guid;
  }

  public Page id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the object.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Page link(String link) {
    this.link = link;
    return this;
  }

   /**
   * URL to the object.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "URL to the object.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Page modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date the object was last modified, in the site's timezone.
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "The date the object was last modified, in the site's timezone.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public Page modifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
    return this;
  }

   /**
   * The date the object was last modified, as GMT.
   * @return modifiedGmt
  **/
  @ApiModelProperty(example = "null", value = "The date the object was last modified, as GMT.")
  public LocalDateTime getModifiedGmt() {
    return modifiedGmt;
  }

  public void setModifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
  }

  public Page password(String password) {
    this.password = password;
    return this;
  }

   /**
   * A password to protect access to the post.
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "A password to protect access to the post.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Page slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the object unique to its type.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the object unique to its type.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Page status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * A named status for the object.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "A named status for the object.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Page type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Post for the object.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of Post for the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Page parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The id for the parent of the object.
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "The id for the parent of the object.")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public Page title(PostTitle title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostTitle getTitle() {
    return title;
  }

  public void setTitle(PostTitle title) {
    this.title = title;
  }

  public Page content(PostContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostContent getContent() {
    return content;
  }

  public void setContent(PostContent content) {
    this.content = content;
  }

  public Page author(Integer author) {
    this.author = author;
    return this;
  }

   /**
   * The id for the author of the object.
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "The id for the author of the object.")
  public Integer getAuthor() {
    return author;
  }

  public void setAuthor(Integer author) {
    this.author = author;
  }

  public Page excerpt(PostExcerpt excerpt) {
    this.excerpt = excerpt;
    return this;
  }

   /**
   * Get excerpt
   * @return excerpt
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostExcerpt getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(PostExcerpt excerpt) {
    this.excerpt = excerpt;
  }

  public Page featuredMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
    return this;
  }

   /**
   * The id of the featured media for the object.
   * @return featuredMedia
  **/
  @ApiModelProperty(example = "null", value = "The id of the featured media for the object.")
  public Integer getFeaturedMedia() {
    return featuredMedia;
  }

  public void setFeaturedMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
  }

  public Page commentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
    return this;
  }

   /**
   * Whether or not comments are open on the object.
   * @return commentStatus
  **/
  @ApiModelProperty(example = "null", value = "Whether or not comments are open on the object.")
  public CommentStatusEnum getCommentStatus() {
    return commentStatus;
  }

  public void setCommentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
  }

  public Page pingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

   /**
   * Whether or not the object can be pinged.
   * @return pingStatus
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the object can be pinged.")
  public PingStatusEnum getPingStatus() {
    return pingStatus;
  }

  public void setPingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
  }

  public Page menuOrder(Integer menuOrder) {
    this.menuOrder = menuOrder;
    return this;
  }

   /**
   * The order of the object in relation to other object of its type.
   * @return menuOrder
  **/
  @ApiModelProperty(example = "null", value = "The order of the object in relation to other object of its type.")
  public Integer getMenuOrder() {
    return menuOrder;
  }

  public void setMenuOrder(Integer menuOrder) {
    this.menuOrder = menuOrder;
  }

  public Page template(String template) {
    this.template = template;
    return this;
  }

   /**
   * The theme file to use to display the object.
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "The theme file to use to display the object.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.date, page.date) &&
        Objects.equals(this.dateGmt, page.dateGmt) &&
        Objects.equals(this.guid, page.guid) &&
        Objects.equals(this.id, page.id) &&
        Objects.equals(this.link, page.link) &&
        Objects.equals(this.modified, page.modified) &&
        Objects.equals(this.modifiedGmt, page.modifiedGmt) &&
        Objects.equals(this.password, page.password) &&
        Objects.equals(this.slug, page.slug) &&
        Objects.equals(this.status, page.status) &&
        Objects.equals(this.type, page.type) &&
        Objects.equals(this.parent, page.parent) &&
        Objects.equals(this.title, page.title) &&
        Objects.equals(this.content, page.content) &&
        Objects.equals(this.author, page.author) &&
        Objects.equals(this.excerpt, page.excerpt) &&
        Objects.equals(this.featuredMedia, page.featuredMedia) &&
        Objects.equals(this.commentStatus, page.commentStatus) &&
        Objects.equals(this.pingStatus, page.pingStatus) &&
        Objects.equals(this.menuOrder, page.menuOrder) &&
        Objects.equals(this.template, page.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, password, slug, status, type, parent, title, content, author, excerpt, featuredMedia, commentStatus, pingStatus, menuOrder, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
    sb.append("    featuredMedia: ").append(toIndentedString(featuredMedia)).append("\n");
    sb.append("    commentStatus: ").append(toIndentedString(commentStatus)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    menuOrder: ").append(toIndentedString(menuOrder)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

