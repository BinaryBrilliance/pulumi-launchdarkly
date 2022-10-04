// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.GetFlagTriggerInstructions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFlagTriggerResult {
    /**
     * @return Whether the trigger is currently active or not.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The unique key of the environment the flag trigger will work in.
     * 
     */
    private String envKey;
    /**
     * @return The unique key of the associated flag.
     * 
     */
    private String flagKey;
    private String id;
    /**
     * @return Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. These can be found on the `kind` field nested on the `instructions` attribute.
     * 
     */
    private @Nullable GetFlagTriggerInstructions instructions;
    /**
     * @return The unique identifier of the integration your trigger is set up with.
     * 
     */
    private @Nullable String integrationKey;
    private String maintainerId;
    /**
     * @return The unique key of the project encompassing the associated flag.
     * 
     */
    private String projectKey;
    private String triggerUrl;

    private GetFlagTriggerResult() {}
    /**
     * @return Whether the trigger is currently active or not.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The unique key of the environment the flag trigger will work in.
     * 
     */
    public String envKey() {
        return this.envKey;
    }
    /**
     * @return The unique key of the associated flag.
     * 
     */
    public String flagKey() {
        return this.flagKey;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. These can be found on the `kind` field nested on the `instructions` attribute.
     * 
     */
    public Optional<GetFlagTriggerInstructions> instructions() {
        return Optional.ofNullable(this.instructions);
    }
    /**
     * @return The unique identifier of the integration your trigger is set up with.
     * 
     */
    public Optional<String> integrationKey() {
        return Optional.ofNullable(this.integrationKey);
    }
    public String maintainerId() {
        return this.maintainerId;
    }
    /**
     * @return The unique key of the project encompassing the associated flag.
     * 
     */
    public String projectKey() {
        return this.projectKey;
    }
    public String triggerUrl() {
        return this.triggerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlagTriggerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String envKey;
        private String flagKey;
        private String id;
        private @Nullable GetFlagTriggerInstructions instructions;
        private @Nullable String integrationKey;
        private String maintainerId;
        private String projectKey;
        private String triggerUrl;
        public Builder() {}
        public Builder(GetFlagTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.envKey = defaults.envKey;
    	      this.flagKey = defaults.flagKey;
    	      this.id = defaults.id;
    	      this.instructions = defaults.instructions;
    	      this.integrationKey = defaults.integrationKey;
    	      this.maintainerId = defaults.maintainerId;
    	      this.projectKey = defaults.projectKey;
    	      this.triggerUrl = defaults.triggerUrl;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder envKey(String envKey) {
            this.envKey = Objects.requireNonNull(envKey);
            return this;
        }
        @CustomType.Setter
        public Builder flagKey(String flagKey) {
            this.flagKey = Objects.requireNonNull(flagKey);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instructions(@Nullable GetFlagTriggerInstructions instructions) {
            this.instructions = instructions;
            return this;
        }
        @CustomType.Setter
        public Builder integrationKey(@Nullable String integrationKey) {
            this.integrationKey = integrationKey;
            return this;
        }
        @CustomType.Setter
        public Builder maintainerId(String maintainerId) {
            this.maintainerId = Objects.requireNonNull(maintainerId);
            return this;
        }
        @CustomType.Setter
        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
            return this;
        }
        @CustomType.Setter
        public Builder triggerUrl(String triggerUrl) {
            this.triggerUrl = Objects.requireNonNull(triggerUrl);
            return this;
        }
        public GetFlagTriggerResult build() {
            final var o = new GetFlagTriggerResult();
            o.enabled = enabled;
            o.envKey = envKey;
            o.flagKey = flagKey;
            o.id = id;
            o.instructions = instructions;
            o.integrationKey = integrationKey;
            o.maintainerId = maintainerId;
            o.projectKey = projectKey;
            o.triggerUrl = triggerUrl;
            return o;
        }
    }
}
