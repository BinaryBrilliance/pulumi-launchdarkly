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
    public sealed class GetTeamMaintainerResult
    {
        public readonly string Email;
        public readonly string FirstName;
        public readonly string Id;
        public readonly string LastName;
        public readonly string Role;

        [OutputConstructor]
        private GetTeamMaintainerResult(
            string email,

            string firstName,

            string id,

            string lastName,

            string role)
        {
            Email = email;
            FirstName = firstName;
            Id = id;
            LastName = lastName;
            Role = role;
        }
    }
}