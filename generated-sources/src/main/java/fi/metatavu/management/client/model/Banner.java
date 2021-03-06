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
import fi.metatavu.management.client.model.PostGuid;
import fi.metatavu.management.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Banner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-31T10:37:46.120+03:00")
public class Banner   {
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
    
    PRIVATE("private"),
    
    ACF_DISABLED("acf-disabled"),
    
    EXPIRATION("expiration");

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

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("content")
  private PostContent content = null;

  @JsonProperty("featured_media")
  private Integer featuredMedia = null;

  /**
   * Teematiedosto joka näyttää kohteen.
   */
  public enum TemplateEnum {
    NONE("NONE");

    private String value;

    TemplateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TemplateEnum fromValue(String text) {
      for (TemplateEnum b : TemplateEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("template")
  private TemplateEnum template = null;

  @JsonProperty("banner-link")
  private String bannerLink = null;

  @JsonProperty("banner-text-color")
  private String bannerTextColor = null;

  @JsonProperty("banner-background-color")
  private String bannerBackgroundColor = null;

  @JsonProperty("banner-hide-title")
  private Boolean bannerHideTitle = null;

  public Banner date(LocalDateTime date) {
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

  public Banner dateGmt(LocalDateTime dateGmt) {
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

  public Banner guid(PostGuid guid) {
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

  public Banner id(Integer id) {
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

  public Banner link(String link) {
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

  public Banner modified(LocalDateTime modified) {
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

  public Banner modifiedGmt(LocalDateTime modifiedGmt) {
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

  public Banner slug(String slug) {
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

  public Banner status(StatusEnum status) {
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

  public Banner type(String type) {
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

  public Banner password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Salasana sisällön ja otteen suojaamiseksi. 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Salasana sisällön ja otteen suojaamiseksi. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Banner title(PostTitle title) {
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

  public Banner content(PostContent content) {
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

  public Banner featuredMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
    return this;
  }

   /**
   * Kohteen artikkelikuvan ID.
   * @return featuredMedia
  **/
  @ApiModelProperty(example = "null", value = "Kohteen artikkelikuvan ID.")
  public Integer getFeaturedMedia() {
    return featuredMedia;
  }

  public void setFeaturedMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
  }

  public Banner template(TemplateEnum template) {
    this.template = template;
    return this;
  }

   /**
   * Teematiedosto joka näyttää kohteen.
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "Teematiedosto joka näyttää kohteen.")
  public TemplateEnum getTemplate() {
    return template;
  }

  public void setTemplate(TemplateEnum template) {
    this.template = template;
  }

  public Banner bannerLink(String bannerLink) {
    this.bannerLink = bannerLink;
    return this;
  }

   /**
   * Banner link
   * @return bannerLink
  **/
  @ApiModelProperty(example = "null", value = "Banner link")
  public String getBannerLink() {
    return bannerLink;
  }

  public void setBannerLink(String bannerLink) {
    this.bannerLink = bannerLink;
  }

  public Banner bannerTextColor(String bannerTextColor) {
    this.bannerTextColor = bannerTextColor;
    return this;
  }

   /**
   * Banner text color
   * @return bannerTextColor
  **/
  @ApiModelProperty(example = "null", value = "Banner text color")
  public String getBannerTextColor() {
    return bannerTextColor;
  }

  public void setBannerTextColor(String bannerTextColor) {
    this.bannerTextColor = bannerTextColor;
  }

  public Banner bannerBackgroundColor(String bannerBackgroundColor) {
    this.bannerBackgroundColor = bannerBackgroundColor;
    return this;
  }

   /**
   * Banner background color
   * @return bannerBackgroundColor
  **/
  @ApiModelProperty(example = "null", value = "Banner background color")
  public String getBannerBackgroundColor() {
    return bannerBackgroundColor;
  }

  public void setBannerBackgroundColor(String bannerBackgroundColor) {
    this.bannerBackgroundColor = bannerBackgroundColor;
  }

  public Banner bannerHideTitle(Boolean bannerHideTitle) {
    this.bannerHideTitle = bannerHideTitle;
    return this;
  }

   /**
   * Banner hide title
   * @return bannerHideTitle
  **/
  @ApiModelProperty(example = "null", value = "Banner hide title")
  public Boolean getBannerHideTitle() {
    return bannerHideTitle;
  }

  public void setBannerHideTitle(Boolean bannerHideTitle) {
    this.bannerHideTitle = bannerHideTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banner banner = (Banner) o;
    return Objects.equals(this.date, banner.date) &&
        Objects.equals(this.dateGmt, banner.dateGmt) &&
        Objects.equals(this.guid, banner.guid) &&
        Objects.equals(this.id, banner.id) &&
        Objects.equals(this.link, banner.link) &&
        Objects.equals(this.modified, banner.modified) &&
        Objects.equals(this.modifiedGmt, banner.modifiedGmt) &&
        Objects.equals(this.slug, banner.slug) &&
        Objects.equals(this.status, banner.status) &&
        Objects.equals(this.type, banner.type) &&
        Objects.equals(this.password, banner.password) &&
        Objects.equals(this.title, banner.title) &&
        Objects.equals(this.content, banner.content) &&
        Objects.equals(this.featuredMedia, banner.featuredMedia) &&
        Objects.equals(this.template, banner.template) &&
        Objects.equals(this.bannerLink, banner.bannerLink) &&
        Objects.equals(this.bannerTextColor, banner.bannerTextColor) &&
        Objects.equals(this.bannerBackgroundColor, banner.bannerBackgroundColor) &&
        Objects.equals(this.bannerHideTitle, banner.bannerHideTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, slug, status, type, password, title, content, featuredMedia, template, bannerLink, bannerTextColor, bannerBackgroundColor, bannerHideTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banner {\n");
    
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
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    featuredMedia: ").append(toIndentedString(featuredMedia)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    bannerLink: ").append(toIndentedString(bannerLink)).append("\n");
    sb.append("    bannerTextColor: ").append(toIndentedString(bannerTextColor)).append("\n");
    sb.append("    bannerBackgroundColor: ").append(toIndentedString(bannerBackgroundColor)).append("\n");
    sb.append("    bannerHideTitle: ").append(toIndentedString(bannerHideTitle)).append("\n");
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

