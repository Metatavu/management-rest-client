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
 * Pagemappings
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T20:48:13.313+02:00")
public class Pagemappings   {
  @JsonProperty("pagePath")
  private String pagePath = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  public Pagemappings pagePath(String pagePath) {
    this.pagePath = pagePath;
    return this;
  }

   /**
   * Get pagePath
   * @return pagePath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPagePath() {
    return pagePath;
  }

  public void setPagePath(String pagePath) {
    this.pagePath = pagePath;
  }

  public Pagemappings parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Get parentPath
   * @return parentPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagemappings pagemappings = (Pagemappings) o;
    return Objects.equals(this.pagePath, pagemappings.pagePath) &&
        Objects.equals(this.parentPath, pagemappings.parentPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagePath, parentPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagemappings {\n");
    
    sb.append("    pagePath: ").append(toIndentedString(pagePath)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
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

