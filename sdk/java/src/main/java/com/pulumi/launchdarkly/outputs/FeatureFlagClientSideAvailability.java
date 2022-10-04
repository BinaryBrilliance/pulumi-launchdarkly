// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFlagClientSideAvailability {
    /**
     * @return Whether this flag is available to SDKs using the client-side ID.
     * 
     */
    private @Nullable Boolean usingEnvironmentId;
    /**
     * @return Whether this flag is available to SDKs using a mobile key.
     * 
     */
    private @Nullable Boolean usingMobileKey;

    private FeatureFlagClientSideAvailability() {}
    /**
     * @return Whether this flag is available to SDKs using the client-side ID.
     * 
     */
    public Optional<Boolean> usingEnvironmentId() {
        return Optional.ofNullable(this.usingEnvironmentId);
    }
    /**
     * @return Whether this flag is available to SDKs using a mobile key.
     * 
     */
    public Optional<Boolean> usingMobileKey() {
        return Optional.ofNullable(this.usingMobileKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFlagClientSideAvailability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean usingEnvironmentId;
        private @Nullable Boolean usingMobileKey;
        public Builder() {}
        public Builder(FeatureFlagClientSideAvailability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usingEnvironmentId = defaults.usingEnvironmentId;
    	      this.usingMobileKey = defaults.usingMobileKey;
        }

        @CustomType.Setter
        public Builder usingEnvironmentId(@Nullable Boolean usingEnvironmentId) {
            this.usingEnvironmentId = usingEnvironmentId;
            return this;
        }
        @CustomType.Setter
        public Builder usingMobileKey(@Nullable Boolean usingMobileKey) {
            this.usingMobileKey = usingMobileKey;
            return this;
        }
        public FeatureFlagClientSideAvailability build() {
            final var o = new FeatureFlagClientSideAvailability();
            o.usingEnvironmentId = usingEnvironmentId;
            o.usingMobileKey = usingMobileKey;
            return o;
        }
    }
}