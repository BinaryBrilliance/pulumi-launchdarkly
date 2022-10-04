// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly.Outputs
{

    [OutputType]
    public sealed class RelayProxyConfigurationPolicy
    {
        /// <summary>
        /// The list of action specifiers defining the actions to which the rule policy applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// - Either `allow` or `deny`. This argument defines whether the rule policy allows or denies access to the named resources and actions.
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// The list of action specifiers defining the actions to which the rule policy does not apply. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
        /// </summary>
        public readonly ImmutableArray<string> NotActions;
        /// <summary>
        /// - The list of resource specifiers defining the resources to which the rule policy does not apply. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
        /// </summary>
        public readonly ImmutableArray<string> NotResources;
        /// <summary>
        /// - The list of resource specifiers defining the resources to which the rule policy applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private RelayProxyConfigurationPolicy(
            ImmutableArray<string> actions,

            string effect,

            ImmutableArray<string> notActions,

            ImmutableArray<string> notResources,

            ImmutableArray<string> resources)
        {
            Actions = actions;
            Effect = effect;
            NotActions = notActions;
            NotResources = notResources;
            Resources = resources;
        }
    }
}
