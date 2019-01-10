package com.jobseeker.jobseeker.models.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Indeed {

  private String version;
  private String query;
  private String location;
  private String paginationPayload;
  private String radius;
  private boolean dupefilter;
  private boolean highlight;
  private int totalResults;
  private int start;
  private int end;
  private int pageNumber;

  private List<Results> results;

    public Indeed(String version, String query, String location, String paginationPayload, String radius, boolean dupefilter, boolean highlight, int totalResults, int start, int end, int pageNumber, List<Results> results) {
        this.version = version;
        this.query = query;
        this.location = location;
        this.paginationPayload = paginationPayload;
        this.radius = radius;
        this.dupefilter = dupefilter;
        this.highlight = highlight;
        this.totalResults = totalResults;
        this.start = start;
        this.end = end;
        this.pageNumber = pageNumber;
        this.results = results;
    }

    public Indeed() {

    }
}
