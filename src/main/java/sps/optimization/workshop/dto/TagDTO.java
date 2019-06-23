package sps.optimization.workshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagDTO {

    @JsonProperty(value = "Count")
    private int count;

    @JsonProperty(value = "ExcerptPostId")
    private int excerptPostId;

    @JsonProperty(value = "WikiPostId")
    private int wikiPostId;

    @JsonProperty(value = "Id")
    private int id;

    @JsonProperty(value = "TagName")
    private String tagName;
}
