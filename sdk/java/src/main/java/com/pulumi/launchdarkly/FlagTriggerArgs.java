// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.FlagTriggerInstructionsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class FlagTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlagTriggerArgs Empty = new FlagTriggerArgs();

    /**
     * Whether the trigger is currently active or not. This property defaults to true upon creation
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the trigger is currently active or not. This property defaults to true upon creation
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="envKey", required=true)
    private Output<String> envKey;

    /**
     * @return The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> envKey() {
        return this.envKey;
    }

    /**
     * The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="flagKey", required=true)
    private Output<String> flagKey;

    /**
     * @return The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> flagKey() {
        return this.flagKey;
    }

    /**
     * Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
     * 
     */
    @Import(name="instructions", required=true)
    private Output<FlagTriggerInstructionsArgs> instructions;

    /**
     * @return Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
     * 
     */
    public Output<FlagTriggerInstructionsArgs> instructions() {
        return this.instructions;
    }

    /**
     * The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="integrationKey", required=true)
    private Output<String> integrationKey;

    /**
     * @return The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> integrationKey() {
        return this.integrationKey;
    }

    /**
     * The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="projectKey", required=true)
    private Output<String> projectKey;

    /**
     * @return The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }

    private FlagTriggerArgs() {}

    private FlagTriggerArgs(FlagTriggerArgs $) {
        this.enabled = $.enabled;
        this.envKey = $.envKey;
        this.flagKey = $.flagKey;
        this.instructions = $.instructions;
        this.integrationKey = $.integrationKey;
        this.projectKey = $.projectKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlagTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlagTriggerArgs $;

        public Builder() {
            $ = new FlagTriggerArgs();
        }

        public Builder(FlagTriggerArgs defaults) {
            $ = new FlagTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the trigger is currently active or not. This property defaults to true upon creation
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the trigger is currently active or not. This property defaults to true upon creation
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param envKey The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder envKey(Output<String> envKey) {
            $.envKey = envKey;
            return this;
        }

        /**
         * @param envKey The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder envKey(String envKey) {
            return envKey(Output.of(envKey));
        }

        /**
         * @param flagKey The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder flagKey(Output<String> flagKey) {
            $.flagKey = flagKey;
            return this;
        }

        /**
         * @param flagKey The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder flagKey(String flagKey) {
            return flagKey(Output.of(flagKey));
        }

        /**
         * @param instructions Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder instructions(Output<FlagTriggerInstructionsArgs> instructions) {
            $.instructions = instructions;
            return this;
        }

        /**
         * @param instructions Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder instructions(FlagTriggerInstructionsArgs instructions) {
            return instructions(Output.of(instructions));
        }

        /**
         * @param integrationKey The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(Output<String> integrationKey) {
            $.integrationKey = integrationKey;
            return this;
        }

        /**
         * @param integrationKey The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(String integrationKey) {
            return integrationKey(Output.of(integrationKey));
        }

        /**
         * @param projectKey The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        public FlagTriggerArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.envKey = Objects.requireNonNull($.envKey, "expected parameter 'envKey' to be non-null");
            $.flagKey = Objects.requireNonNull($.flagKey, "expected parameter 'flagKey' to be non-null");
            $.instructions = Objects.requireNonNull($.instructions, "expected parameter 'instructions' to be non-null");
            $.integrationKey = Objects.requireNonNull($.integrationKey, "expected parameter 'integrationKey' to be non-null");
            $.projectKey = Objects.requireNonNull($.projectKey, "expected parameter 'projectKey' to be non-null");
            return $;
        }
    }

}