package downloader;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {


@SerializedName("include_total")
@Expose
private Boolean includeTotal;
@SerializedName("limit")
@Expose
private Integer limit;
@SerializedName("records_format")
@Expose
private String recordsFormat;
@SerializedName("resource_id")
@Expose
private String resourceId;
@SerializedName("total_estimation_threshold")
@Expose
private Object totalEstimationThreshold;
@SerializedName("records")
@Expose
private List<Record> records = null;
@SerializedName("fields")
@Expose
private List<Field> fields = null;
@SerializedName("_links")
@Expose
private Links links;
@SerializedName("total")
@Expose
private Integer total;
@SerializedName("total_was_estimated")
@Expose
private Boolean totalWasEstimated;

public Boolean getIncludeTotal() {
return includeTotal;
}

public void setIncludeTotal(Boolean includeTotal) {
this.includeTotal = includeTotal;
}

public Integer getLimit() {
return limit;
}

public void setLimit(Integer limit) {
this.limit = limit;
}

public String getRecordsFormat() {
return recordsFormat;
}

public void setRecordsFormat(String recordsFormat) {
this.recordsFormat = recordsFormat;
}

public String getResourceId() {
return resourceId;
}

public void setResourceId(String resourceId) {
this.resourceId = resourceId;
}

public Object getTotalEstimationThreshold() {
return totalEstimationThreshold;
}

public void setTotalEstimationThreshold(Object totalEstimationThreshold) {
this.totalEstimationThreshold = totalEstimationThreshold;
}

public List<Record> getRecords() {
return records;
}

public void setRecords(List<Record> records) {
this.records = records;
}

public List<Field> getFields() {
return fields;
}

public void setFields(List<Field> fields) {
this.fields = fields;
}

public Links getLinks() {
return links;
}

public void setLinks(Links links) {
this.links = links;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}

public Boolean getTotalWasEstimated() {
return totalWasEstimated;
}

public void setTotalWasEstimated(Boolean totalWasEstimated) {
this.totalWasEstimated = totalWasEstimated;
}
}
