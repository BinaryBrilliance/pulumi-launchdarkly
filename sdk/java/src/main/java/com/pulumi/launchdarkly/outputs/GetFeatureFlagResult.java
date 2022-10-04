// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.GetFeatureFlagClientSideAvailability;
import com.pulumi.launchdarkly.outputs.GetFeatureFlagCustomProperty;
import com.pulumi.launchdarkly.outputs.GetFeatureFlagDefaults;
import com.pulumi.launchdarkly.outputs.GetFeatureFlagVariation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFeatureFlagResult {
    private @Nullable Boolean archived;
    /**
     * @return A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
     * 
     */
    private List<GetFeatureFlagClientSideAvailability> clientSideAvailabilities;
    /**
     * @return List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    private @Nullable List<GetFeatureFlagCustomProperty> customProperties;
    /**
     * @return A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     * 
     */
    private GetFeatureFlagDefaults defaults;
    /**
     * @return The variation&#39;s description.
     * 
     */
    private @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `include_in_snippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
     * 
     * @deprecated
     * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;client_side_availability&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability. */
    private Boolean includeInSnippet;
    /**
     * @return The unique custom property key.
     * 
     */
    private String key;
    /**
     * @return The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
     * 
     */
    private String maintainerId;
    /**
     * @return The name of the custom property.
     * 
     */
    private String name;
    private String projectKey;
    /**
     * @return Set of feature flag tags.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Whether the flag is a temporary flag.
     * 
     */
    private @Nullable Boolean temporary;
    /**
     * @return The feature flag&#39;s variation type: `boolean`, `string`, `number` or `json`.
     * 
     */
    private String variationType;
    /**
     * @return List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     * 
     */
    private List<GetFeatureFlagVariation> variations;

    private GetFeatureFlagResult() {}
    public Optional<Boolean> archived() {
        return Optional.ofNullable(this.archived);
    }
    /**
     * @return A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
     * 
     */
    public List<GetFeatureFlagClientSideAvailability> clientSideAvailabilities() {
        return this.clientSideAvailabilities;
    }
    /**
     * @return List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    public List<GetFeatureFlagCustomProperty> customProperties() {
        return this.customProperties == null ? List.of() : this.customProperties;
    }
    /**
     * @return A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     * 
     */
    public GetFeatureFlagDefaults defaults() {
        return this.defaults;
    }
    /**
     * @return The variation&#39;s description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `include_in_snippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
     * 
     * @deprecated
     * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;client_side_availability&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability. */
    public Boolean includeInSnippet() {
        return this.includeInSnippet;
    }
    /**
     * @return The unique custom property key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
     * 
     */
    public String maintainerId() {
        return this.maintainerId;
    }
    /**
     * @return The name of the custom property.
     * 
     */
    public String name() {
        return this.name;
    }
    public String projectKey() {
        return this.projectKey;
    }
    /**
     * @return Set of feature flag tags.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Whether the flag is a temporary flag.
     * 
     */
    public Optional<Boolean> temporary() {
        return Optional.ofNullable(this.temporary);
    }
    /**
     * @return The feature flag&#39;s variation type: `boolean`, `string`, `number` or `json`.
     * 
     */
    public String variationType() {
        return this.variationType;
    }
    /**
     * @return List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     * 
     */
    public List<GetFeatureFlagVariation> variations() {
        return this.variations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureFlagResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean archived;
        private List<GetFeatureFlagClientSideAvailability> clientSideAvailabilities;
        private @Nullable List<GetFeatureFlagCustomProperty> customProperties;
        private GetFeatureFlagDefaults defaults;
        private @Nullable String description;
        private String id;
        private Boolean includeInSnippet;
        private String key;
        private String maintainerId;
        private String name;
        private String projectKey;
        private @Nullable List<String> tags;
        private @Nullable Boolean temporary;
        private String variationType;
        private List<GetFeatureFlagVariation> variations;
        public Builder() {}
        public Builder(GetFeatureFlagResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archived = defaults.archived;
    	      this.clientSideAvailabilities = defaults.clientSideAvailabilities;
    	      this.customProperties = defaults.customProperties;
    	      this.defaults = defaults.defaults;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.includeInSnippet = defaults.includeInSnippet;
    	      this.key = defaults.key;
    	      this.maintainerId = defaults.maintainerId;
    	      this.name = defaults.name;
    	      this.projectKey = defaults.projectKey;
    	      this.tags = defaults.tags;
    	      this.temporary = defaults.temporary;
    	      this.variationType = defaults.variationType;
    	      this.variations = defaults.variations;
        }

        @CustomType.Setter
        public Builder archived(@Nullable Boolean archived) {
            this.archived = archived;
            return this;
        }
        @CustomType.Setter
        public Builder clientSideAvailabilities(List<GetFeatureFlagClientSideAvailability> clientSideAvailabilities) {
            this.clientSideAvailabilities = Objects.requireNonNull(clientSideAvailabilities);
            return this;
        }
        public Builder clientSideAvailabilities(GetFeatureFlagClientSideAvailability... clientSideAvailabilities) {
            return clientSideAvailabilities(List.of(clientSideAvailabilities));
        }
        @CustomType.Setter
        public Builder customProperties(@Nullable List<GetFeatureFlagCustomProperty> customProperties) {
            this.customProperties = customProperties;
            return this;
        }
        public Builder customProperties(GetFeatureFlagCustomProperty... customProperties) {
            return customProperties(List.of(customProperties));
        }
        @CustomType.Setter
        public Builder defaults(GetFeatureFlagDefaults defaults) {
            this.defaults = Objects.requireNonNull(defaults);
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeInSnippet(Boolean includeInSnippet) {
            this.includeInSnippet = Objects.requireNonNull(includeInSnippet);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder maintainerId(String maintainerId) {
            this.maintainerId = Objects.requireNonNull(maintainerId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
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
        public Builder temporary(@Nullable Boolean temporary) {
            this.temporary = temporary;
            return this;
        }
        @CustomType.Setter
        public Builder variationType(String variationType) {
            this.variationType = Objects.requireNonNull(variationType);
            return this;
        }
        @CustomType.Setter
        public Builder variations(List<GetFeatureFlagVariation> variations) {
            this.variations = Objects.requireNonNull(variations);
            return this;
        }
        public Builder variations(GetFeatureFlagVariation... variations) {
            return variations(List.of(variations));
        }
        public GetFeatureFlagResult build() {
            final var o = new GetFeatureFlagResult();
            o.archived = archived;
            o.clientSideAvailabilities = clientSideAvailabilities;
            o.customProperties = customProperties;
            o.defaults = defaults;
            o.description = description;
            o.id = id;
            o.includeInSnippet = includeInSnippet;
            o.key = key;
            o.maintainerId = maintainerId;
            o.name = name;
            o.projectKey = projectKey;
            o.tags = tags;
            o.temporary = temporary;
            o.variationType = variationType;
            o.variations = variations;
            return o;
        }
    }
}
