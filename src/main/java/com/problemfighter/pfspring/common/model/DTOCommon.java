package com.problemfighter.pfspring.common.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTOCommon {

    @ApiModelProperty(readOnly = true)
    @JsonIgnore
    public Long id;

    @ApiModelProperty(readOnly = true)
    @JsonIgnore
    public String uuid;

    @ApiModelProperty(readOnly = true)
    @JsonIgnore
    public Date created;

    @ApiModelProperty(readOnly = true)
    @JsonIgnore
    public Date lastUpdated;

    @JsonProperty
    public Long getId() {
        return id;
    }

    @JsonProperty
    public String getUuid() {
        return uuid;
    }

    @JsonProperty
    public Date getCreated() {
        return created;
    }

    @JsonProperty
    public Date getLastUpdated() {
        return lastUpdated;
    }
}
