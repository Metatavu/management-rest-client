/**
 * localhost
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
 * PostRevision
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-31T10:37:46.120+03:00")
public class PostRevision   {
  @JsonProperty("author")
  private Integer author = null;

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

  @JsonProperty("modified")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modified = null;

  @JsonProperty("modified_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modifiedGmt = null;

  @JsonProperty("parent")
  private Integer parent = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("content")
  private PostContent content = null;

  @JsonProperty("excerpt")
  private PostExcerpt excerpt = null;

  public PostRevision author(Integer author) {
    this.author = author;
    return this;
  }

   /**
   * Kohteen kirjoittajan ID.
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "Kohteen kirjoittajan ID.")
  public Integer getAuthor() {
    return author;
  }

  public void setAuthor(Integer author) {
    this.author = author;
  }

  public PostRevision date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Ajankohta kun kohde julkaistiin sivuston aikavyöhykkeen ajassa.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "Ajankohta kun kohde julkaistiin sivuston aikavyöhykkeen ajassa.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public PostRevision dateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
    return this;
  }

   /**
   * Ajankohta kun kohde julkaistiin GMT-ajassa.
   * @return dateGmt
  **/
  @ApiModelProperty(example = "null", value = "Ajankohta kun kohde julkaistiin GMT-ajassa.")
  public LocalDateTime getDateGmt() {
    return dateGmt;
  }

  public void setDateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
  }

  public PostRevision guid(PostGuid guid) {
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

  public PostRevision id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Kohteen uniikki tunniste.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Kohteen uniikki tunniste.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PostRevision modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Kohteen viimeinen muokkauspäivämäärä sivuston aikavyöhykkeen ajassa.
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "Kohteen viimeinen muokkauspäivämäärä sivuston aikavyöhykkeen ajassa.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public PostRevision modifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
    return this;
  }

   /**
   * Kohteen viimeinen muokkauspäivämäärä GMT-ajassa.
   * @return modifiedGmt
  **/
  @ApiModelProperty(example = "null", value = "Kohteen viimeinen muokkauspäivämäärä GMT-ajassa.")
  public LocalDateTime getModifiedGmt() {
    return modifiedGmt;
  }

  public void setModifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
  }

  public PostRevision parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Kohteen vanhemman ID.
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "Kohteen vanhemman ID.")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public PostRevision slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Kohteen tyypilleen uniikki alfanumeerinen tunniste.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "Kohteen tyypilleen uniikki alfanumeerinen tunniste.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PostRevision title(PostTitle title) {
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

  public PostRevision content(PostContent content) {
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

  public PostRevision excerpt(PostExcerpt excerpt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRevision postRevision = (PostRevision) o;
    return Objects.equals(this.author, postRevision.author) &&
        Objects.equals(this.date, postRevision.date) &&
        Objects.equals(this.dateGmt, postRevision.dateGmt) &&
        Objects.equals(this.guid, postRevision.guid) &&
        Objects.equals(this.id, postRevision.id) &&
        Objects.equals(this.modified, postRevision.modified) &&
        Objects.equals(this.modifiedGmt, postRevision.modifiedGmt) &&
        Objects.equals(this.parent, postRevision.parent) &&
        Objects.equals(this.slug, postRevision.slug) &&
        Objects.equals(this.title, postRevision.title) &&
        Objects.equals(this.content, postRevision.content) &&
        Objects.equals(this.excerpt, postRevision.excerpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, date, dateGmt, guid, id, modified, modifiedGmt, parent, slug, title, content, excerpt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRevision {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
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

