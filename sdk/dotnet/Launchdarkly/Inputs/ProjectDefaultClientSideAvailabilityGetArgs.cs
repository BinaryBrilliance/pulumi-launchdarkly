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

    public sealed class ProjectDefaultClientSideAvailabilityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether feature flags created under the project are available to JavaScript SDKs using the client-side ID by default. Defaults to `false` when not using `default_client_side_availability`.
        /// </summary>
        [Input("usingEnvironmentId", required: true)]
        public Input<bool> UsingEnvironmentId { get; set; } = null!;

        /// <summary>
        /// Whether feature flags created under the project are available to mobile SDKs, and other non-JavaScript SDKs, using a mobile key by default. Defaults to `true` when not using `default_client_side_availability`.
        /// </summary>
        [Input("usingMobileKey", required: true)]
        public Input<bool> UsingMobileKey { get; set; } = null!;

        public ProjectDefaultClientSideAvailabilityGetArgs()
        {
        }
        public static new ProjectDefaultClientSideAvailabilityGetArgs Empty => new ProjectDefaultClientSideAvailabilityGetArgs();
    }
}
