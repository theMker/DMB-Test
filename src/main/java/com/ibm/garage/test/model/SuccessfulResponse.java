package com.ibm.garage.test.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SuccessfulResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-05T18:28:20.131Z[GMT]")

public class SuccessfulResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("rev")
  private String rev;

  public SuccessfulResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of created feedback
   * @return id
  */
  @ApiModelProperty(value = "id of created feedback")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuccessfulResponse rev(String rev) {
    this.rev = rev;
    return this;
  }

  /**
   * revision number of created feedback
   * @return rev
  */
  @ApiModelProperty(value = "revision number of created feedback")


  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulResponse successfulResponse = (SuccessfulResponse) o;
    return Objects.equals(this.id, successfulResponse.id) &&
        Objects.equals(this.rev, successfulResponse.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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

