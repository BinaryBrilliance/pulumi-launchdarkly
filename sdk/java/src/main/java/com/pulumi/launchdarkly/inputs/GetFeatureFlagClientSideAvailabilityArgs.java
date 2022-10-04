// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureFlagClientSideAvailabilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFeatureFlagClientSideAvailabilityArgs Empty = new GetFeatureFlagClientSideAvailabilityArgs();

    /**
     * When set to true, this flag is available to SDKs using the client-side ID.
     * 
     */
    @Import(name="usingEnvironmentId", required=true)
    private Output<Boolean> usingEnvironmentId;

    /**
     * @return When set to true, this flag is available to SDKs using the client-side ID.
     * 
     */
    public Output<Boolean> usingEnvironmentId() {
        return this.usingEnvironmentId;
    }

    /**
     * When set to true, this flag is available to SDKs using a mobile key.
     * 
     */
    @Import(name="usingMobileKey")
    private @Nullable Output<Boolean> usingMobileKey;

    /**
     * @return When set to true, this flag is available to SDKs using a mobile key.
     * 
     */
    public Optional<Output<Boolean>> usingMobileKey() {
        return Optional.ofNullable(this.usingMobileKey);
    }

    private GetFeatureFlagClientSideAvailabilityArgs() {}

    private GetFeatureFlagClientSideAvailabilityArgs(GetFeatureFlagClientSideAvailabilityArgs $) {
        this.usingEnvironmentId = $.usingEnvironmentId;
        this.usingMobileKey = $.usingMobileKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagClientSideAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagClientSideAvailabilityArgs $;

        public Builder() {
            $ = new GetFeatureFlagClientSideAvailabilityArgs();
        }

        public Builder(GetFeatureFlagClientSideAvailabilityArgs defaults) {
            $ = new GetFeatureFlagClientSideAvailabilityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param usingEnvironmentId When set to true, this flag is available to SDKs using the client-side ID.
         * 
         * @return builder
         * 
         */
        public Builder usingEnvironmentId(Output<Boolean> usingEnvironmentId) {
            $.usingEnvironmentId = usingEnvironmentId;
            return this;
        }

        /**
         * @param usingEnvironmentId When set to true, this flag is available to SDKs using the client-side ID.
         * 
         * @return builder
         * 
         */
        public Builder usingEnvironmentId(Boolean usingEnvironmentId) {
            return usingEnvironmentId(Output.of(usingEnvironmentId));
        }

        /**
         * @param usingMobileKey When set to true, this flag is available to SDKs using a mobile key.
         * 
         * @return builder
         * 
         */
        public Builder usingMobileKey(@Nullable Output<Boolean> usingMobileKey) {
            $.usingMobileKey = usingMobileKey;
            return this;
        }

        /**
         * @param usingMobileKey When set to true, this flag is available to SDKs using a mobile key.
         * 
         * @return builder
         * 
         */
        public Builder usingMobileKey(Boolean usingMobileKey) {
            return usingMobileKey(Output.of(usingMobileKey));
        }

        public GetFeatureFlagClientSideAvailabilityArgs build() {
            $.usingEnvironmentId = Objects.requireNonNull($.usingEnvironmentId, "expected parameter 'usingEnvironmentId' to be non-null");
            return $;
        }
    }

}