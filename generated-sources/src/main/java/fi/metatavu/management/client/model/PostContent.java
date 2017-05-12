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
 * Kohteen sisältö.
 */
@ApiModel(description = "Kohteen sisältö.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-12T07:46:35.856+03:00")
public class PostContent   {
  @JsonProperty("raw")
  private String raw = null;

  @JsonProperty("rendered")
  private String rendered = null;

  @JsonProperty("protected")
  private Boolean _protected = null;

  public PostContent raw(String raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Kohteen sisältö siinä muodossa kuin se on tietokannassa.
   * @return raw
  **/
  @ApiModelProperty(example = "null", value = "Kohteen sisältö siinä muodossa kuin se on tietokannassa.")
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public PostContent rendered(String rendered) {
    this.rendered = rendered;
    return this;
  }

   /**
   * Kohteen HTML-sisältö, esitettäväksi muunnettuna.
   * @return rendered
  **/
  @ApiModelProperty(example = "null", value = "Kohteen HTML-sisältö, esitettäväksi muunnettuna.")
  public String getRendered() {
    return rendered;
  }

  public void setRendered(String rendered) {
    this.rendered = rendered;
  }

  public PostContent _protected(Boolean _protected) {
    this._protected = _protected;
    return this;
  }

   /**
   * Onko sisältö suojattu salasanalla.
   * @return _protected
  **/
  @ApiModelProperty(example = "null", value = "Onko sisältö suojattu salasanalla.")
  public Boolean getProtected() {
    return _protected;
  }

  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContent postContent = (PostContent) o;
    return Objects.equals(this.raw, postContent.raw) &&
        Objects.equals(this.rendered, postContent.rendered) &&
        Objects.equals(this._protected, postContent._protected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw, rendered, _protected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContent {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    rendered: ").append(toIndentedString(rendered)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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

