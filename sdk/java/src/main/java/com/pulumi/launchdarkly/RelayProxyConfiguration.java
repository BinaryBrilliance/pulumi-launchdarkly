// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.RelayProxyConfigurationArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.RelayProxyConfigurationState;
import com.pulumi.launchdarkly.outputs.RelayProxyConfigurationPolicy;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.RelayProxyConfiguration;
 * import com.pulumi.launchdarkly.RelayProxyConfigurationArgs;
 * import com.pulumi.launchdarkly.inputs.RelayProxyConfigurationPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RelayProxyConfiguration(&#34;example&#34;, RelayProxyConfigurationArgs.builder()        
 *             .policies(RelayProxyConfigurationPolicyArgs.builder()
 *                 .actions(&#34;*&#34;)
 *                 .effect(&#34;allow&#34;)
 *                 .resources(&#34;proj/*:env/*&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Relay Proxy configurations can be imported using the configuration&#39;s unique 24 character ID, e.g.
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/relayProxyConfiguration:RelayProxyConfiguration example 51d440e30c9ff61457c710f6
 * ```
 * 
 *  The unique relay proxy ID can be found in the relay proxy edit page URL, which you can locate by clicking the three dot menu on your relay proxy item in the UI and selecting &#39;Edit configuration&#39;https://app.launchdarkly.com/settings/relay/THIS_IS_YOUR_RELAY_PROXY_ID/edit
 * 
 */
@ResourceType(type="launchdarkly:index/relayProxyConfiguration:RelayProxyConfiguration")
public class RelayProxyConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The last 4 characters of the Relay Proxy configuration&#39;s unique key.
     * 
     */
    @Export(name="displayKey", type=String.class, parameters={})
    private Output<String> displayKey;

    /**
     * @return The last 4 characters of the Relay Proxy configuration&#39;s unique key.
     * 
     */
    public Output<String> displayKey() {
        return this.displayKey;
    }
    /**
     * The Relay Proxy configuration&#39;s unique key. Because the `full_key` is only exposed upon creation, it will not be available if the resource is imported.
     * 
     */
    @Export(name="fullKey", type=String.class, parameters={})
    private Output<String> fullKey;

    /**
     * @return The Relay Proxy configuration&#39;s unique key. Because the `full_key` is only exposed upon creation, it will not be available if the resource is imported.
     * 
     */
    public Output<String> fullKey() {
        return this.fullKey;
    }
    /**
     * The human-readable name for your Relay Proxy configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The human-readable name for your Relay Proxy configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
     * 
     */
    @Export(name="policies", type=List.class, parameters={RelayProxyConfigurationPolicy.class})
    private Output<List<RelayProxyConfigurationPolicy>> policies;

    /**
     * @return The Relay Proxy configuration&#39;s rule policy block. This determines what content the Relay Proxy receives. To learn more, read [Understanding policies](https://docs.launchdarkly.com/home/members/role-policies#understanding-policies).
     * 
     */
    public Output<List<RelayProxyConfigurationPolicy>> policies() {
        return this.policies;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RelayProxyConfiguration(String name) {
        this(name, RelayProxyConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RelayProxyConfiguration(String name, RelayProxyConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RelayProxyConfiguration(String name, RelayProxyConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/relayProxyConfiguration:RelayProxyConfiguration", name, args == null ? RelayProxyConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RelayProxyConfiguration(String name, Output<String> id, @Nullable RelayProxyConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/relayProxyConfiguration:RelayProxyConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "fullKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RelayProxyConfiguration get(String name, Output<String> id, @Nullable RelayProxyConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RelayProxyConfiguration(name, id, state, options);
    }
}
