// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly Data Export Destination resource.
 *
 * > **Note:** Data Export is available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).
 *
 * Data Export Destinations are locations that receive exported data. This resource allows you to configure destinations for the export of raw analytics data, including feature flag requests, analytics events, custom events, and more.
 *
 * To learn more about data export, read [Data Export Documentation](https://docs.launchdarkly.com/integrations/data-export).
 *
 * ## Example Usage
 *
 * Currently the following five types of destinations are available: kinesis, google-pubsub, mparticle, azure-event-hubs, and segment. Please note that config fields will vary depending on which destination you are trying to configure / access.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const example = new launchdarkly.Destination("example", {
 *     projectKey: "example-project",
 *     envKey: "example-env",
 *     kind: "kinesis",
 *     config: {
 *         region: "us-east-1",
 *         role_arn: "arn:aws:iam::123456789012:role/marketingadmin",
 *         stream_name: "cat-stream",
 *     },
 *     on: true,
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const example = new launchdarkly.Destination("example", {
 *     projectKey: "example-project",
 *     envKey: "example-env",
 *     kind: "google-pubsub",
 *     config: {
 *         project: "example-pub-sub-project",
 *         topic: "example-topic",
 *     },
 *     on: true,
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const example = new launchdarkly.Destination("example", {
 *     projectKey: "example-project",
 *     envKey: "example-env",
 *     kind: "mparticle",
 *     config: {
 *         api_key: "apiKeyfromMParticle",
 *         secret: "mParticleSecret",
 *         user_identity: "customer_id",
 *         environment: "production",
 *     },
 *     on: true,
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const example = new launchdarkly.Destination("example", {
 *     config: {
 *         name: "example-azure-name",
 *         namespace: "example-azure-namespace",
 *         policy_key: "azure-event-hubs-policy-key",
 *         policy_name: "example-policy-name",
 *     },
 *     envKey: "example-env",
 *     kind: "azure-event-hubs",
 *     on: true,
 *     projectKey: "example-project",
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const example = new launchdarkly.Destination("example", {
 *     projectKey: "example-project",
 *     envKey: "example-env",
 *     kind: "segment",
 *     config: {
 *         write_key: "segment-write-key",
 *     },
 *     on: true,
 *     tags: ["terraform"],
 * });
 * ```
 *
 * ## Import
 *
 * You can import a data export destination using the destination's full ID in the format `project_key/environment_key/id`. For example
 *
 * ```sh
 *  $ pulumi import launchdarkly:index/destination:Destination example example-project/example-env/57c0af609969090743529967
 * ```
 */
export class Destination extends pulumi.CustomResource {
    /**
     * Get an existing Destination resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DestinationState, opts?: pulumi.CustomResourceOptions): Destination {
        return new Destination(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'launchdarkly:index/destination:Destination';

    /**
     * Returns true if the given object is an instance of Destination.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Destination {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Destination.__pulumiType;
    }

    /**
     * - The destination-specific configuration. To learn more, read Destination-Specific Configs.
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly envKey!: pulumi.Output<string>;
    /**
     * - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * -
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * - Whether the data export destination is on or not.
     */
    public readonly on!: pulumi.Output<boolean | undefined>;
    /**
     * - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly projectKey!: pulumi.Output<string>;
    /**
     * Tags associated with your resource
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Destination resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DestinationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DestinationArgs | DestinationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DestinationState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["envKey"] = state ? state.envKey : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["on"] = state ? state.on : undefined;
            resourceInputs["projectKey"] = state ? state.projectKey : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DestinationArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            if ((!args || args.envKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envKey'");
            }
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.projectKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectKey'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["envKey"] = args ? args.envKey : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["on"] = args ? args.on : undefined;
            resourceInputs["projectKey"] = args ? args.projectKey : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Destination.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Destination resources.
 */
export interface DestinationState {
    /**
     * - The destination-specific configuration. To learn more, read Destination-Specific Configs.
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    envKey?: pulumi.Input<string>;
    /**
     * - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    kind?: pulumi.Input<string>;
    /**
     * -
     */
    name?: pulumi.Input<string>;
    /**
     * - Whether the data export destination is on or not.
     */
    on?: pulumi.Input<boolean>;
    /**
     * - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    projectKey?: pulumi.Input<string>;
    /**
     * Tags associated with your resource
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Destination resource.
 */
export interface DestinationArgs {
    /**
     * - The destination-specific configuration. To learn more, read Destination-Specific Configs.
     */
    config: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    envKey: pulumi.Input<string>;
    /**
     * - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    kind: pulumi.Input<string>;
    /**
     * -
     */
    name?: pulumi.Input<string>;
    /**
     * - Whether the data export destination is on or not.
     */
    on?: pulumi.Input<boolean>;
    /**
     * - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    projectKey: pulumi.Input<string>;
    /**
     * Tags associated with your resource
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
