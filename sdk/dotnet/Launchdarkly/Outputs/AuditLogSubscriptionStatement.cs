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
    public sealed class AuditLogSubscriptionStatement
    {
        /// <summary>
        /// The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
        /// </summary>
        public readonly ImmutableArray<string> NotActions;
        /// <summary>
        /// The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
        /// </summary>
        public readonly ImmutableArray<string> NotResources;
        /// <summary>
        /// The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
        /// </summary>
        public readonly ImmutableArray<string> Resources;

        [OutputConstructor]
        private AuditLogSubscriptionStatement(
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
