/**
 * staging-hallinta-mikkeli.kunta-api.fi
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
import fi.metatavu.management.client.model.AttachmentCaption;
import fi.metatavu.management.client.model.AttachmentDescription;
import fi.metatavu.management.client.model.PostGuid;
import fi.metatavu.management.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Attachment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T06:40:24.206+02:00")
public class Attachment   {
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

  @JsonProperty("slug")
  private String slug = null;

  /**
   * Kohteen nimetty tila.
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

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("author")
  private Integer author = null;

  /**
   * Onko kohteen kommentointi käytössä. 
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
   * Voiko kohteelle tehdä paluuviitteen.
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

  @JsonProperty("meta")
  private Object meta = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("alt_text")
  private String altText = null;

  @JsonProperty("caption")
  private AttachmentCaption caption = null;

  @JsonProperty("description")
  private AttachmentDescription description = null;

  /**
   * Liitetiedoston tyyppi.
   */
  public enum MediaTypeEnum {
    IMAGE("image"),
    
    FILE("file");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("media_type")
  private MediaTypeEnum mediaType = null;

  @JsonProperty("mime_type")
  private String mimeType = null;

  @JsonProperty("media_details")
  private Object mediaDetails = null;

  @JsonProperty("post")
  private Integer post = null;

  @JsonProperty("source_url")
  private String sourceUrl = null;

  public Attachment date(LocalDateTime date) {
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

  public Attachment dateGmt(LocalDateTime dateGmt) {
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

  public Attachment guid(PostGuid guid) {
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

  public Attachment id(Integer id) {
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

  public Attachment link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Kohteen URL.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "Kohteen URL.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Attachment modified(LocalDateTime modified) {
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

  public Attachment modifiedGmt(LocalDateTime modifiedGmt) {
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

  public Attachment slug(String slug) {
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

  public Attachment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Kohteen nimetty tila.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Kohteen nimetty tila.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Attachment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Kohteen artikkelityyppi.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Kohteen artikkelityyppi.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Attachment title(PostTitle title) {
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

  public Attachment author(Integer author) {
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

  public Attachment commentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
    return this;
  }

   /**
   * Onko kohteen kommentointi käytössä. 
   * @return commentStatus
  **/
  @ApiModelProperty(example = "null", value = "Onko kohteen kommentointi käytössä. ")
  public CommentStatusEnum getCommentStatus() {
    return commentStatus;
  }

  public void setCommentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
  }

  public Attachment pingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

   /**
   * Voiko kohteelle tehdä paluuviitteen.
   * @return pingStatus
  **/
  @ApiModelProperty(example = "null", value = "Voiko kohteelle tehdä paluuviitteen.")
  public PingStatusEnum getPingStatus() {
    return pingStatus;
  }

  public void setPingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
  }

  public Attachment meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Metakentät.
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "Metakentät.")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public Attachment template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Teematiedosto joka näyttää kohteen.
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "Teematiedosto joka näyttää kohteen.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Attachment altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Vaihtoehtoinen teksti näytettäväksi kun liitettä ei voida näyttää.
   * @return altText
  **/
  @ApiModelProperty(example = "null", value = "Vaihtoehtoinen teksti näytettäväksi kun liitettä ei voida näyttää.")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public Attachment caption(AttachmentCaption caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(example = "null", value = "")
  public AttachmentCaption getCaption() {
    return caption;
  }

  public void setCaption(AttachmentCaption caption) {
    this.caption = caption;
  }

  public Attachment description(AttachmentDescription description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public AttachmentDescription getDescription() {
    return description;
  }

  public void setDescription(AttachmentDescription description) {
    this.description = description;
  }

  public Attachment mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Liitetiedoston tyyppi.
   * @return mediaType
  **/
  @ApiModelProperty(example = "null", value = "Liitetiedoston tyyppi.")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Liitetiedoston MIME-tyyppi.
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "Liitetiedoston MIME-tyyppi.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment mediaDetails(Object mediaDetails) {
    this.mediaDetails = mediaDetails;
    return this;
  }

   /**
   * Mediatiedoston tyyppikohtaiset tiedot.
   * @return mediaDetails
  **/
  @ApiModelProperty(example = "null", value = "Mediatiedoston tyyppikohtaiset tiedot.")
  public Object getMediaDetails() {
    return mediaDetails;
  }

  public void setMediaDetails(Object mediaDetails) {
    this.mediaDetails = mediaDetails;
  }

  public Attachment post(Integer post) {
    this.post = post;
    return this;
  }

   /**
   * Mediaan liittyvän artikkelin ID.
   * @return post
  **/
  @ApiModelProperty(example = "null", value = "Mediaan liittyvän artikkelin ID.")
  public Integer getPost() {
    return post;
  }

  public void setPost(Integer post) {
    this.post = post;
  }

  public Attachment sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * URL-osoite alkuperäiseen liitetiedostoon.
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "null", value = "URL-osoite alkuperäiseen liitetiedostoon.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.date, attachment.date) &&
        Objects.equals(this.dateGmt, attachment.dateGmt) &&
        Objects.equals(this.guid, attachment.guid) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.link, attachment.link) &&
        Objects.equals(this.modified, attachment.modified) &&
        Objects.equals(this.modifiedGmt, attachment.modifiedGmt) &&
        Objects.equals(this.slug, attachment.slug) &&
        Objects.equals(this.status, attachment.status) &&
        Objects.equals(this.type, attachment.type) &&
        Objects.equals(this.title, attachment.title) &&
        Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.commentStatus, attachment.commentStatus) &&
        Objects.equals(this.pingStatus, attachment.pingStatus) &&
        Objects.equals(this.meta, attachment.meta) &&
        Objects.equals(this.template, attachment.template) &&
        Objects.equals(this.altText, attachment.altText) &&
        Objects.equals(this.caption, attachment.caption) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.mediaType, attachment.mediaType) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.mediaDetails, attachment.mediaDetails) &&
        Objects.equals(this.post, attachment.post) &&
        Objects.equals(this.sourceUrl, attachment.sourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, slug, status, type, title, author, commentStatus, pingStatus, meta, template, altText, caption, description, mediaType, mimeType, mediaDetails, post, sourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commentStatus: ").append(toIndentedString(commentStatus)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    mediaDetails: ").append(toIndentedString(mediaDetails)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
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

