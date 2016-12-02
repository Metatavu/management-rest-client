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
import fi.metatavu.management.client.model.UserAvatarUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:08:15.286+02:00")
public class User   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("registered_date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime registeredDate = null;

  @JsonProperty("roles")
  private List<String> roles = new ArrayList<String>();

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("capabilities")
  private Object capabilities = null;

  @JsonProperty("extra_capabilities")
  private Object extraCapabilities = null;

  @JsonProperty("avatar_urls")
  private UserAvatarUrls avatarUrls = null;

  public User id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the resource.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Login name for the resource.
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "Login name for the resource.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name for the resource.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Display name for the resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name for the resource.
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First name for the resource.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name for the resource.
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last name for the resource.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address for the resource.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The email address for the resource.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the resource.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "URL of the resource.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public User description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the resource.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Description of the resource.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Author URL to the resource.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "Author URL to the resource.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public User nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * The nickname for the resource.
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "The nickname for the resource.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public User slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the resource.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public User registeredDate(LocalDateTime registeredDate) {
    this.registeredDate = registeredDate;
    return this;
  }

   /**
   * Registration date for the resource.
   * @return registeredDate
  **/
  @ApiModelProperty(example = "null", value = "Registration date for the resource.")
  public LocalDateTime getRegisteredDate() {
    return registeredDate;
  }

  public void setRegisteredDate(LocalDateTime registeredDate) {
    this.registeredDate = registeredDate;
  }

  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles assigned to the resource.
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "Roles assigned to the resource.")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for the resource (never included).
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Password for the resource (never included).")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User capabilities(Object capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * All capabilities assigned to the resource.
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "All capabilities assigned to the resource.")
  public Object getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Object capabilities) {
    this.capabilities = capabilities;
  }

  public User extraCapabilities(Object extraCapabilities) {
    this.extraCapabilities = extraCapabilities;
    return this;
  }

   /**
   * Any extra capabilities assigned to the resource.
   * @return extraCapabilities
  **/
  @ApiModelProperty(example = "null", value = "Any extra capabilities assigned to the resource.")
  public Object getExtraCapabilities() {
    return extraCapabilities;
  }

  public void setExtraCapabilities(Object extraCapabilities) {
    this.extraCapabilities = extraCapabilities;
  }

  public User avatarUrls(UserAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * Get avatarUrls
   * @return avatarUrls
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(UserAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.url, user.url) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.link, user.link) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.slug, user.slug) &&
        Objects.equals(this.registeredDate, user.registeredDate) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.capabilities, user.capabilities) &&
        Objects.equals(this.extraCapabilities, user.extraCapabilities) &&
        Objects.equals(this.avatarUrls, user.avatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, firstName, lastName, email, url, description, link, nickname, slug, registeredDate, roles, password, capabilities, extraCapabilities, avatarUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    registeredDate: ").append(toIndentedString(registeredDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    extraCapabilities: ").append(toIndentedString(extraCapabilities)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
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

