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


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Avatar URLs for the resource.
 */
@ApiModel(description = "Avatar URLs for the resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-30T13:16:42.776+02:00")
public class UserAvatarUrls   {
  @JsonProperty("24")
  private String _24 = null;

  @JsonProperty("48")
  private String _48 = null;

  @JsonProperty("96")
  private String _96 = null;

  public UserAvatarUrls _24(String _24) {
    this._24 = _24;
    return this;
  }

   /**
   * Avatar URL with image size of 24 pixels.
   * @return _24
  **/
  @ApiModelProperty(example = "null", value = "Avatar URL with image size of 24 pixels.")
  public String get24() {
    return _24;
  }

  public void set24(String _24) {
    this._24 = _24;
  }

  public UserAvatarUrls _48(String _48) {
    this._48 = _48;
    return this;
  }

   /**
   * Avatar URL with image size of 48 pixels.
   * @return _48
  **/
  @ApiModelProperty(example = "null", value = "Avatar URL with image size of 48 pixels.")
  public String get48() {
    return _48;
  }

  public void set48(String _48) {
    this._48 = _48;
  }

  public UserAvatarUrls _96(String _96) {
    this._96 = _96;
    return this;
  }

   /**
   * Avatar URL with image size of 96 pixels.
   * @return _96
  **/
  @ApiModelProperty(example = "null", value = "Avatar URL with image size of 96 pixels.")
  public String get96() {
    return _96;
  }

  public void set96(String _96) {
    this._96 = _96;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAvatarUrls userAvatarUrls = (UserAvatarUrls) o;
    return Objects.equals(this._24, userAvatarUrls._24) &&
        Objects.equals(this._48, userAvatarUrls._48) &&
        Objects.equals(this._96, userAvatarUrls._96);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_24, _48, _96);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAvatarUrls {\n");
    
    sb.append("    _24: ").append(toIndentedString(_24)).append("\n");
    sb.append("    _48: ").append(toIndentedString(_48)).append("\n");
    sb.append("    _96: ").append(toIndentedString(_96)).append("\n");
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

