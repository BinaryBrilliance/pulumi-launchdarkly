// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.GetMetricUrl;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMetricResult {
    /**
     * @return The description of the metric&#39;s purpose.
     * 
     */
    private @Nullable String description;
    /**
     * @return The event key to watch for `custom` metrics.
     * 
     */
    private @Nullable String eventKey;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean isActive;
    private @Nullable Boolean isNumeric;
    private String key;
    /**
     * @return The metric type. Available choices are `click`, `custom`, and `pageview`.
     * 
     */
    private @Nullable String kind;
    private String maintainerId;
    /**
     * @return The name of the metric.
     * 
     */
    private @Nullable String name;
    /**
     * @return The metrics&#39;s project key.
     * 
     */
    private String projectKey;
    /**
     * @return The CSS selector for `click` metrics.
     * 
     */
    private @Nullable String selector;
    /**
     * @return The success criteria for numeric `custom` metrics.
     * 
     */
    private @Nullable String successCriteria;
    /**
     * @return Set of tags associated with the metric.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return The unit for numeric `custom` metrics.
     * 
     */
    private @Nullable String unit;
    /**
     * @return Which URLs the metric watches.
     * 
     */
    private @Nullable List<GetMetricUrl> urls;

    private GetMetricResult() {}
    /**
     * @return The description of the metric&#39;s purpose.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The event key to watch for `custom` metrics.
     * 
     */
    public Optional<String> eventKey() {
        return Optional.ofNullable(this.eventKey);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isActive() {
        return Optional.ofNullable(this.isActive);
    }
    public Optional<Boolean> isNumeric() {
        return Optional.ofNullable(this.isNumeric);
    }
    public String key() {
        return this.key;
    }
    /**
     * @return The metric type. Available choices are `click`, `custom`, and `pageview`.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public String maintainerId() {
        return this.maintainerId;
    }
    /**
     * @return The name of the metric.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The metrics&#39;s project key.
     * 
     */
    public String projectKey() {
        return this.projectKey;
    }
    /**
     * @return The CSS selector for `click` metrics.
     * 
     */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return The success criteria for numeric `custom` metrics.
     * 
     */
    public Optional<String> successCriteria() {
        return Optional.ofNullable(this.successCriteria);
    }
    /**
     * @return Set of tags associated with the metric.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The unit for numeric `custom` metrics.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * @return Which URLs the metric watches.
     * 
     */
    public List<GetMetricUrl> urls() {
        return this.urls == null ? List.of() : this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String eventKey;
        private String id;
        private @Nullable Boolean isActive;
        private @Nullable Boolean isNumeric;
        private String key;
        private @Nullable String kind;
        private String maintainerId;
        private @Nullable String name;
        private String projectKey;
        private @Nullable String selector;
        private @Nullable String successCriteria;
        private @Nullable List<String> tags;
        private @Nullable String unit;
        private @Nullable List<GetMetricUrl> urls;
        public Builder() {}
        public Builder(GetMetricResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventKey = defaults.eventKey;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.isNumeric = defaults.isNumeric;
    	      this.key = defaults.key;
    	      this.kind = defaults.kind;
    	      this.maintainerId = defaults.maintainerId;
    	      this.name = defaults.name;
    	      this.projectKey = defaults.projectKey;
    	      this.selector = defaults.selector;
    	      this.successCriteria = defaults.successCriteria;
    	      this.tags = defaults.tags;
    	      this.unit = defaults.unit;
    	      this.urls = defaults.urls;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder eventKey(@Nullable String eventKey) {
            this.eventKey = eventKey;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder isNumeric(@Nullable Boolean isNumeric) {
            this.isNumeric = isNumeric;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder maintainerId(String maintainerId) {
            this.maintainerId = Objects.requireNonNull(maintainerId);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder successCriteria(@Nullable String successCriteria) {
            this.successCriteria = successCriteria;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder urls(@Nullable List<GetMetricUrl> urls) {
            this.urls = urls;
            return this;
        }
        public Builder urls(GetMetricUrl... urls) {
            return urls(List.of(urls));
        }
        public GetMetricResult build() {
            final var o = new GetMetricResult();
            o.description = description;
            o.eventKey = eventKey;
            o.id = id;
            o.isActive = isActive;
            o.isNumeric = isNumeric;
            o.key = key;
            o.kind = kind;
            o.maintainerId = maintainerId;
            o.name = name;
            o.projectKey = projectKey;
            o.selector = selector;
            o.successCriteria = successCriteria;
            o.tags = tags;
            o.unit = unit;
            o.urls = urls;
            return o;
        }
    }
}
