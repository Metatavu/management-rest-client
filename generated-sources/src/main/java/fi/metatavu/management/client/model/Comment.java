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
import fi.metatavu.management.client.model.CommentAuthorAvatarUrls;
import fi.metatavu.management.client.model.PostContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Comment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:08:15.286+02:00")
public class Comment   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("author")
  private Integer author = null;

  @JsonProperty("author_email")
  private String authorEmail = null;

  @JsonProperty("author_ip")
  private String authorIp = null;

  @JsonProperty("author_name")
  private String authorName = null;

  @JsonProperty("author_url")
  private String authorUrl = null;

  @JsonProperty("author_user_agent")
  private String authorUserAgent = null;

  @JsonProperty("content")
  private PostContent content = null;

  @JsonProperty("date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime date = null;

  @JsonProperty("date_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime dateGmt = null;

  @JsonProperty("karma")
  private Integer karma = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("parent")
  private Integer parent = null;

  @JsonProperty("post")
  private Integer post = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("author_avatar_urls")
  private CommentAuthorAvatarUrls authorAvatarUrls = null;

  public Comment id(Integer id) {
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

  public Comment author(Integer author) {
    this.author = author;
    return this;
  }

   /**
   * The id of the user object, if author was a user.
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "The id of the user object, if author was a user.")
  public Integer getAuthor() {
    return author;
  }

  public void setAuthor(Integer author) {
    this.author = author;
  }

  public Comment authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

   /**
   * Email address for the object author.
   * @return authorEmail
  **/
  @ApiModelProperty(example = "null", value = "Email address for the object author.")
  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public Comment authorIp(String authorIp) {
    this.authorIp = authorIp;
    return this;
  }

   /**
   * IP address for the object author.
   * @return authorIp
  **/
  @ApiModelProperty(example = "null", value = "IP address for the object author.")
  public String getAuthorIp() {
    return authorIp;
  }

  public void setAuthorIp(String authorIp) {
    this.authorIp = authorIp;
  }

  public Comment authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * Display name for the object author.
   * @return authorName
  **/
  @ApiModelProperty(example = "null", value = "Display name for the object author.")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Comment authorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
    return this;
  }

   /**
   * URL for the object author.
   * @return authorUrl
  **/
  @ApiModelProperty(example = "null", value = "URL for the object author.")
  public String getAuthorUrl() {
    return authorUrl;
  }

  public void setAuthorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
  }

  public Comment authorUserAgent(String authorUserAgent) {
    this.authorUserAgent = authorUserAgent;
    return this;
  }

   /**
   * User agent for the object author.
   * @return authorUserAgent
  **/
  @ApiModelProperty(example = "null", value = "User agent for the object author.")
  public String getAuthorUserAgent() {
    return authorUserAgent;
  }

  public void setAuthorUserAgent(String authorUserAgent) {
    this.authorUserAgent = authorUserAgent;
  }

  public Comment content(PostContent content) {
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

  public Comment date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date the object was published.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Comment dateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
    return this;
  }

   /**
   * The date the object was published as GMT.
   * @return dateGmt
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published as GMT.")
  public LocalDateTime getDateGmt() {
    return dateGmt;
  }

  public void setDateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
  }

  public Comment karma(Integer karma) {
    this.karma = karma;
    return this;
  }

   /**
   * Karma for the object.
   * @return karma
  **/
  @ApiModelProperty(example = "null", value = "Karma for the object.")
  public Integer getKarma() {
    return karma;
  }

  public void setKarma(Integer karma) {
    this.karma = karma;
  }

  public Comment link(String link) {
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

  public Comment parent(Integer parent) {
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

  public Comment post(Integer post) {
    this.post = post;
    return this;
  }

   /**
   * The id of the associated post object.
   * @return post
  **/
  @ApiModelProperty(example = "null", value = "The id of the associated post object.")
  public Integer getPost() {
    return post;
  }

  public void setPost(Integer post) {
    this.post = post;
  }

  public Comment status(String status) {
    this.status = status;
    return this;
  }

   /**
   * State of the object.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "State of the object.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Comment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Comment for the object.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of Comment for the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Comment authorAvatarUrls(CommentAuthorAvatarUrls authorAvatarUrls) {
    this.authorAvatarUrls = authorAvatarUrls;
    return this;
  }

   /**
   * Get authorAvatarUrls
   * @return authorAvatarUrls
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommentAuthorAvatarUrls getAuthorAvatarUrls() {
    return authorAvatarUrls;
  }

  public void setAuthorAvatarUrls(CommentAuthorAvatarUrls authorAvatarUrls) {
    this.authorAvatarUrls = authorAvatarUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.author, comment.author) &&
        Objects.equals(this.authorEmail, comment.authorEmail) &&
        Objects.equals(this.authorIp, comment.authorIp) &&
        Objects.equals(this.authorName, comment.authorName) &&
        Objects.equals(this.authorUrl, comment.authorUrl) &&
        Objects.equals(this.authorUserAgent, comment.authorUserAgent) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.date, comment.date) &&
        Objects.equals(this.dateGmt, comment.dateGmt) &&
        Objects.equals(this.karma, comment.karma) &&
        Objects.equals(this.link, comment.link) &&
        Objects.equals(this.parent, comment.parent) &&
        Objects.equals(this.post, comment.post) &&
        Objects.equals(this.status, comment.status) &&
        Objects.equals(this.type, comment.type) &&
        Objects.equals(this.authorAvatarUrls, comment.authorAvatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, authorEmail, authorIp, authorName, authorUrl, authorUserAgent, content, date, dateGmt, karma, link, parent, post, status, type, authorAvatarUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    authorIp: ").append(toIndentedString(authorIp)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    authorUserAgent: ").append(toIndentedString(authorUserAgent)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    karma: ").append(toIndentedString(karma)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authorAvatarUrls: ").append(toIndentedString(authorAvatarUrls)).append("\n");
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
