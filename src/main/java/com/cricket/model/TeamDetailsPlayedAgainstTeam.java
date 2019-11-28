package com.cricket.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Team against which it played
 */
@ApiModel(description = "Team against which it played")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-28T15:13:11.741Z")

public class TeamDetailsPlayedAgainstTeam   {
  @JsonProperty("teamId")
  private String teamId = null;

  @JsonProperty("teamName")
  private String teamName = null;

  public TeamDetailsPlayedAgainstTeam teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  **/
  @ApiModelProperty(value = "")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public TeamDetailsPlayedAgainstTeam teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
  **/
  @ApiModelProperty(value = "")


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamDetailsPlayedAgainstTeam teamDetailsPlayedAgainstTeam = (TeamDetailsPlayedAgainstTeam) o;
    return Objects.equals(this.teamId, teamDetailsPlayedAgainstTeam.teamId) &&
        Objects.equals(this.teamName, teamDetailsPlayedAgainstTeam.teamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, teamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamDetailsPlayedAgainstTeam {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

