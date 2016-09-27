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


package fi.otavanopisto.mwp.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Menuitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-27T11:34:56.957+03:00")
public class Menuitem   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("postId")
  private BigDecimal postId = null;

  @JsonProperty("postParentId")
  private BigDecimal postParentId = null;

  @JsonProperty("url")
  private String url = null;

  public Menuitem id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Menuitem slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Menuitem postId(BigDecimal postId) {
    this.postId = postId;
    return this;
  }

   /**
   * Get postId
   * @return postId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getPostId() {
    return postId;
  }

  public void setPostId(BigDecimal postId) {
    this.postId = postId;
  }

  public Menuitem postParentId(BigDecimal postParentId) {
    this.postParentId = postParentId;
    return this;
  }

   /**
   * Get postParentId
   * @return postParentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getPostParentId() {
    return postParentId;
  }

  public void setPostParentId(BigDecimal postParentId) {
    this.postParentId = postParentId;
  }

  public Menuitem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menuitem menuitem = (Menuitem) o;
    return Objects.equals(this.id, menuitem.id) &&
        Objects.equals(this.slug, menuitem.slug) &&
        Objects.equals(this.postId, menuitem.postId) &&
        Objects.equals(this.postParentId, menuitem.postParentId) &&
        Objects.equals(this.url, menuitem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, postId, postParentId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menuitem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    postParentId: ").append(toIndentedString(postParentId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

