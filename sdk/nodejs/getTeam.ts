// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly team data source.
 *
 * This data source allows you to retrieve team information from your LaunchDarkly organization.
 *
 * > **Note:** Teams are available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const platformTeam = pulumi.output(launchdarkly.getTeam({
 *     key: "platform_team",
 * }));
 * ```
 */
export function getTeam(args: GetTeamArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("launchdarkly:index/getTeam:getTeam", {
        "customRoleKeys": args.customRoleKeys,
        "description": args.description,
        "key": args.key,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamArgs {
    /**
     * The list of the keys of the custom roles that you have assigned to the team.
     */
    customRoleKeys?: string[];
    /**
     * The team description.
     */
    description?: string;
    /**
     * The team key.
     */
    key: string;
    /**
     * Human readable name for the team.
     */
    name?: string;
}

/**
 * A collection of values returned by getTeam.
 */
export interface GetTeamResult {
    /**
     * The list of the keys of the custom roles that you have assigned to the team.
     */
    readonly customRoleKeys?: string[];
    /**
     * The team description.
     */
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly key: string;
    /**
     * The list of team maintainers as [team member objects](https://www.terraform.io/docs/providers/launchdarkly/d/team_member.html).
     */
    readonly maintainers: outputs.GetTeamMaintainer[];
    /**
     * Human readable name for the team.
     */
    readonly name?: string;
    /**
     * The list of keys of the projects that the team has any write access to.
     */
    readonly projectKeys: string[];
}

export function getTeamOutput(args: GetTeamOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTeamResult> {
    return pulumi.output(args).apply(a => getTeam(a, opts))
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamOutputArgs {
    /**
     * The list of the keys of the custom roles that you have assigned to the team.
     */
    customRoleKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The team description.
     */
    description?: pulumi.Input<string>;
    /**
     * The team key.
     */
    key: pulumi.Input<string>;
    /**
     * Human readable name for the team.
     */
    name?: pulumi.Input<string>;
}