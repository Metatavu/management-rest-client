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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Type
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-12T06:40:24.206+02:00")
public class Type   {
  @JsonProperty("capabilities")
  private Object capabilities = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hierarchical")
  private Boolean hierarchical = null;

  @JsonProperty("labels")
  private Object labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("taxonomies")
  private List<String> taxonomies = new ArrayList<String>();

  @JsonProperty("rest_base")
  private String restBase = null;

  public Type capabilities(Object capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Kaikki oikeudet, joita sisältötyyppi käyttää.
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "Kaikki oikeudet, joita sisältötyyppi käyttää.")
  public Object getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Object capabilities) {
    this.capabilities = capabilities;
  }

  public Type description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Kuvaus sisältötyypistä.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Kuvaus sisältötyypistä.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Type hierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
    return this;
  }

   /**
   * Onko sisältötyyppi hierarkinen vai ei.
   * @return hierarchical
  **/
  @ApiModelProperty(example = "null", value = "Onko sisältötyyppi hierarkinen vai ei.")
  public Boolean getHierarchical() {
    return hierarchical;
  }

  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }

  public Type labels(Object labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Ihmisluettavat selitteet sisältötyypille eri asiayhteyksissä.
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "Ihmisluettavat selitteet sisältötyypille eri asiayhteyksissä.")
  public Object getLabels() {
    return labels;
  }

  public void setLabels(Object labels) {
    this.labels = labels;
  }

  public Type name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Sisältötyypin otsikko.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Sisältötyypin otsikko.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Alfanumeerinen tunniste sisältötyypille.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "Alfanumeerinen tunniste sisältötyypille.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Type taxonomies(List<String> taxonomies) {
    this.taxonomies = taxonomies;
    return this;
  }

  public Type addTaxonomiesItem(String taxonomiesItem) {
    this.taxonomies.add(taxonomiesItem);
    return this;
  }

   /**
   * Sisältötyyppiin liittyvät taksonomiat.
   * @return taxonomies
  **/
  @ApiModelProperty(example = "null", value = "Sisältötyyppiin liittyvät taksonomiat.")
  public List<String> getTaxonomies() {
    return taxonomies;
  }

  public void setTaxonomies(List<String> taxonomies) {
    this.taxonomies = taxonomies;
  }

  public Type restBase(String restBase) {
    this.restBase = restBase;
    return this;
  }

   /**
   * REST-juurireitti sisältötyypille.
   * @return restBase
  **/
  @ApiModelProperty(example = "null", value = "REST-juurireitti sisältötyypille.")
  public String getRestBase() {
    return restBase;
  }

  public void setRestBase(String restBase) {
    this.restBase = restBase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type type = (Type) o;
    return Objects.equals(this.capabilities, type.capabilities) &&
        Objects.equals(this.description, type.description) &&
        Objects.equals(this.hierarchical, type.hierarchical) &&
        Objects.equals(this.labels, type.labels) &&
        Objects.equals(this.name, type.name) &&
        Objects.equals(this.slug, type.slug) &&
        Objects.equals(this.taxonomies, type.taxonomies) &&
        Objects.equals(this.restBase, type.restBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, description, hierarchical, labels, name, slug, taxonomies, restBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    taxonomies: ").append(toIndentedString(taxonomies)).append("\n");
    sb.append("    restBase: ").append(toIndentedString(restBase)).append("\n");
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

