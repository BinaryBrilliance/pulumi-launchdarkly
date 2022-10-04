// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetRelayProxyConfigurationPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRelayProxyConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRelayProxyConfigurationPlainArgs Empty = new GetRelayProxyConfigurationPlainArgs();

    /**
     * The Relay Proxy configuration&#39;s unique 24 character ID. The unique relay proxy ID can be found in the relay proxy edit page URL, which you can locate by clicking the three dot menu on your relay proxy item in the UI and selecting &#39;Edit configuration&#39;:
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The Relay Proxy configuration&#39;s unique 24 character ID. The unique relay proxy ID can be found in the relay proxy edit page URL, which you can locate by clicking the three dot menu on your relay proxy item in the UI and selecting &#39;Edit configuration&#39;:
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
     * 
     */
    @Import(name="policies")
    private @Nullable List<GetRelayProxyConfigurationPolicy> policies;

    /**
     * @return The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
     * 
     */
    public Optional<List<GetRelayProxyConfigurationPolicy>> policies() {
        return Optional.ofNullable(this.policies);
    }

    private GetRelayProxyConfigurationPlainArgs() {}

    private GetRelayProxyConfigurationPlainArgs(GetRelayProxyConfigurationPlainArgs $) {
        this.id = $.id;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRelayProxyConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRelayProxyConfigurationPlainArgs $;

        public Builder() {
            $ = new GetRelayProxyConfigurationPlainArgs();
        }

        public Builder(GetRelayProxyConfigurationPlainArgs defaults) {
            $ = new GetRelayProxyConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Relay Proxy configuration&#39;s unique 24 character ID. The unique relay proxy ID can be found in the relay proxy edit page URL, which you can locate by clicking the three dot menu on your relay proxy item in the UI and selecting &#39;Edit configuration&#39;:
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param policies The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable List<GetRelayProxyConfigurationPolicy> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
         * 
         * @return builder
         * 
         */
        public Builder policies(GetRelayProxyConfigurationPolicy... policies) {
            return policies(List.of(policies));
        }

        public GetRelayProxyConfigurationPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}