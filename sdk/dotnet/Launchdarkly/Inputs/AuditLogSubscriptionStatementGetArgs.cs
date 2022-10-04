// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly.Inputs
{

    public sealed class AuditLogSubscriptionStatementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;

        /// <summary>
        /// The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        /// <summary>
        /// Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
        /// </summary>
        [Input("effect", required: true)]
        public Input<string> Effect { get; set; } = null!;

        [Input("notActions")]
        private InputList<string>? _notActions;

        /// <summary>
        /// The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
        /// </summary>
        public InputList<string> NotActions
        {
            get => _notActions ?? (_notActions = new InputList<string>());
            set => _notActions = value;
        }

        [Input("notResources")]
        private InputList<string>? _notResources;

        /// <summary>
        /// The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
        /// </summary>
        public InputList<string> NotResources
        {
            get => _notResources ?? (_notResources = new InputList<string>());
            set => _notResources = value;
        }

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public AuditLogSubscriptionStatementGetArgs()
        {
        }
        public static new AuditLogSubscriptionStatementGetArgs Empty => new AuditLogSubscriptionStatementGetArgs();
    }
}
