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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Settings
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:37:16.986+03:00")
public class Settings   {
  @JsonProperty("title")
  private String title = "null";

  @JsonProperty("description")
  private String description = "null";

  @JsonProperty("url")
  private String url = "null";

  @JsonProperty("email")
  private String email = "null";

  @JsonProperty("timezone")
  private String timezone = "null";

  @JsonProperty("date_format")
  private String dateFormat = "null";

  @JsonProperty("time_format")
  private String timeFormat = "null";

  @JsonProperty("start_of_week")
  private Integer startOfWeek = null;

  @JsonProperty("language")
  private String language = "en_US";

  @JsonProperty("use_smilies")
  private Boolean useSmilies = true;

  @JsonProperty("default_category")
  private Integer defaultCategory = null;

  @JsonProperty("default_post_format")
  private String defaultPostFormat = "null";

  @JsonProperty("posts_per_page")
  private Integer postsPerPage = null;

  /**
   * Salli linkki-ilmoitukset muista blogeista (pingback ja trackback) uusiin artikkeleihin.
   */
  public enum DefaultPingStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    DefaultPingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultPingStatusEnum fromValue(String text) {
      for (DefaultPingStatusEnum b : DefaultPingStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("default_ping_status")
  private DefaultPingStatusEnum defaultPingStatus = null;

  /**
   * Salli uusien artikkelien kommentointi. 
   */
  public enum DefaultCommentStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    DefaultCommentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultCommentStatusEnum fromValue(String text) {
      for (DefaultCommentStatusEnum b : DefaultCommentStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("default_comment_status")
  private DefaultCommentStatusEnum defaultCommentStatus = null;

  public Settings title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Sivuston otsikko.
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Sivuston otsikko.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Settings description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Sivun kuvaus.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Sivun kuvaus.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Settings url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Sivuston URL.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Sivuston URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Settings email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Tätä osoitetta käytetään ylläpidon tehtäviin, kuten uusien käyttäjien rekisteröitymisilmoituksiin.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Tätä osoitetta käytetään ylläpidon tehtäviin, kuten uusien käyttäjien rekisteröitymisilmoituksiin.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Settings timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Kaupunki samassa aikavyöhykkeessä kuin sinä.
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "Kaupunki samassa aikavyöhykkeessä kuin sinä.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Settings dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Muoto kaikille päivämäärän merkkijonoille.
   * @return dateFormat
  **/
  @ApiModelProperty(example = "null", value = "Muoto kaikille päivämäärän merkkijonoille.")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public Settings timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * Muoto kaikille kellonajan merkkijonoille.
   * @return timeFormat
  **/
  @ApiModelProperty(example = "null", value = "Muoto kaikille kellonajan merkkijonoille.")
  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public Settings startOfWeek(Integer startOfWeek) {
    this.startOfWeek = startOfWeek;
    return this;
  }

   /**
   * Viikonpäivän numero josta viikko alkaa.
   * @return startOfWeek
  **/
  @ApiModelProperty(example = "null", value = "Viikonpäivän numero josta viikko alkaa.")
  public Integer getStartOfWeek() {
    return startOfWeek;
  }

  public void setStartOfWeek(Integer startOfWeek) {
    this.startOfWeek = startOfWeek;
  }

  public Settings language(String language) {
    this.language = language;
    return this;
  }

   /**
   * WordPressin kieli- ja maakoodi.
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "WordPressin kieli- ja maakoodi.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Settings useSmilies(Boolean useSmilies) {
    this.useSmilies = useSmilies;
    return this;
  }

   /**
   * Muunna hymiöt kuviksi.
   * @return useSmilies
  **/
  @ApiModelProperty(example = "null", value = "Muunna hymiöt kuviksi.")
  public Boolean getUseSmilies() {
    return useSmilies;
  }

  public void setUseSmilies(Boolean useSmilies) {
    this.useSmilies = useSmilies;
  }

  public Settings defaultCategory(Integer defaultCategory) {
    this.defaultCategory = defaultCategory;
    return this;
  }

   /**
   * Oletuskategoria artikkeleille.
   * @return defaultCategory
  **/
  @ApiModelProperty(example = "null", value = "Oletuskategoria artikkeleille.")
  public Integer getDefaultCategory() {
    return defaultCategory;
  }

  public void setDefaultCategory(Integer defaultCategory) {
    this.defaultCategory = defaultCategory;
  }

  public Settings defaultPostFormat(String defaultPostFormat) {
    this.defaultPostFormat = defaultPostFormat;
    return this;
  }

   /**
   * Artikkelisivujen oletusmuoto.
   * @return defaultPostFormat
  **/
  @ApiModelProperty(example = "null", value = "Artikkelisivujen oletusmuoto.")
  public String getDefaultPostFormat() {
    return defaultPostFormat;
  }

  public void setDefaultPostFormat(String defaultPostFormat) {
    this.defaultPostFormat = defaultPostFormat;
  }

  public Settings postsPerPage(Integer postsPerPage) {
    this.postsPerPage = postsPerPage;
    return this;
  }

   /**
   * Näytä enintään
   * @return postsPerPage
  **/
  @ApiModelProperty(example = "null", value = "Näytä enintään")
  public Integer getPostsPerPage() {
    return postsPerPage;
  }

  public void setPostsPerPage(Integer postsPerPage) {
    this.postsPerPage = postsPerPage;
  }

  public Settings defaultPingStatus(DefaultPingStatusEnum defaultPingStatus) {
    this.defaultPingStatus = defaultPingStatus;
    return this;
  }

   /**
   * Salli linkki-ilmoitukset muista blogeista (pingback ja trackback) uusiin artikkeleihin.
   * @return defaultPingStatus
  **/
  @ApiModelProperty(example = "null", value = "Salli linkki-ilmoitukset muista blogeista (pingback ja trackback) uusiin artikkeleihin.")
  public DefaultPingStatusEnum getDefaultPingStatus() {
    return defaultPingStatus;
  }

  public void setDefaultPingStatus(DefaultPingStatusEnum defaultPingStatus) {
    this.defaultPingStatus = defaultPingStatus;
  }

  public Settings defaultCommentStatus(DefaultCommentStatusEnum defaultCommentStatus) {
    this.defaultCommentStatus = defaultCommentStatus;
    return this;
  }

   /**
   * Salli uusien artikkelien kommentointi. 
   * @return defaultCommentStatus
  **/
  @ApiModelProperty(example = "null", value = "Salli uusien artikkelien kommentointi. ")
  public DefaultCommentStatusEnum getDefaultCommentStatus() {
    return defaultCommentStatus;
  }

  public void setDefaultCommentStatus(DefaultCommentStatusEnum defaultCommentStatus) {
    this.defaultCommentStatus = defaultCommentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.title, settings.title) &&
        Objects.equals(this.description, settings.description) &&
        Objects.equals(this.url, settings.url) &&
        Objects.equals(this.email, settings.email) &&
        Objects.equals(this.timezone, settings.timezone) &&
        Objects.equals(this.dateFormat, settings.dateFormat) &&
        Objects.equals(this.timeFormat, settings.timeFormat) &&
        Objects.equals(this.startOfWeek, settings.startOfWeek) &&
        Objects.equals(this.language, settings.language) &&
        Objects.equals(this.useSmilies, settings.useSmilies) &&
        Objects.equals(this.defaultCategory, settings.defaultCategory) &&
        Objects.equals(this.defaultPostFormat, settings.defaultPostFormat) &&
        Objects.equals(this.postsPerPage, settings.postsPerPage) &&
        Objects.equals(this.defaultPingStatus, settings.defaultPingStatus) &&
        Objects.equals(this.defaultCommentStatus, settings.defaultCommentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, url, email, timezone, dateFormat, timeFormat, startOfWeek, language, useSmilies, defaultCategory, defaultPostFormat, postsPerPage, defaultPingStatus, defaultCommentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    startOfWeek: ").append(toIndentedString(startOfWeek)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    useSmilies: ").append(toIndentedString(useSmilies)).append("\n");
    sb.append("    defaultCategory: ").append(toIndentedString(defaultCategory)).append("\n");
    sb.append("    defaultPostFormat: ").append(toIndentedString(defaultPostFormat)).append("\n");
    sb.append("    postsPerPage: ").append(toIndentedString(postsPerPage)).append("\n");
    sb.append("    defaultPingStatus: ").append(toIndentedString(defaultPingStatus)).append("\n");
    sb.append("    defaultCommentStatus: ").append(toIndentedString(defaultCommentStatus)).append("\n");
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

