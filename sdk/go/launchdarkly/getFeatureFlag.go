// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly feature flag data source.
//
// This data source allows you to retrieve feature flag information from your LaunchDarkly organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.LookupFeatureFlag(ctx, &GetFeatureFlagArgs{
//				Key:        "example-flag",
//				ProjectKey: "example-project",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFeatureFlag(ctx *pulumi.Context, args *LookupFeatureFlagArgs, opts ...pulumi.InvokeOption) (*LookupFeatureFlagResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupFeatureFlagResult
	err := ctx.Invoke("launchdarkly:index/getFeatureFlag:getFeatureFlag", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFeatureFlag.
type LookupFeatureFlagArgs struct {
	Archived *bool `pulumi:"archived"`
	// A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities []GetFeatureFlagClientSideAvailability `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties []GetFeatureFlagCustomProperty `pulumi:"customProperties"`
	// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
	Defaults *GetFeatureFlagDefaults `pulumi:"defaults"`
	// The variation's description.
	Description *string `pulumi:"description"`
	// **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `includeInSnippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet *bool `pulumi:"includeInSnippet"`
	// The unique feature flag key that references the flag in your application code.
	Key string `pulumi:"key"`
	// The feature flag maintainer's 24 character alphanumeric team member ID.
	MaintainerId *string `pulumi:"maintainerId"`
	// The feature flag's project key.
	ProjectKey string `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags []string `pulumi:"tags"`
	// Whether the flag is a temporary flag.
	Temporary *bool `pulumi:"temporary"`
	// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
	Variations []GetFeatureFlagVariation `pulumi:"variations"`
}

// A collection of values returned by getFeatureFlag.
type LookupFeatureFlagResult struct {
	Archived *bool `pulumi:"archived"`
	// A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities []GetFeatureFlagClientSideAvailability `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties []GetFeatureFlagCustomProperty `pulumi:"customProperties"`
	// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
	Defaults GetFeatureFlagDefaults `pulumi:"defaults"`
	// The variation's description.
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `includeInSnippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet bool `pulumi:"includeInSnippet"`
	// The unique custom property key.
	Key string `pulumi:"key"`
	// The feature flag maintainer's 24 character alphanumeric team member ID.
	MaintainerId string `pulumi:"maintainerId"`
	// The name of the custom property.
	Name       string `pulumi:"name"`
	ProjectKey string `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags []string `pulumi:"tags"`
	// Whether the flag is a temporary flag.
	Temporary *bool `pulumi:"temporary"`
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType string `pulumi:"variationType"`
	// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
	Variations []GetFeatureFlagVariation `pulumi:"variations"`
}

func LookupFeatureFlagOutput(ctx *pulumi.Context, args LookupFeatureFlagOutputArgs, opts ...pulumi.InvokeOption) LookupFeatureFlagResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFeatureFlagResult, error) {
			args := v.(LookupFeatureFlagArgs)
			r, err := LookupFeatureFlag(ctx, &args, opts...)
			var s LookupFeatureFlagResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFeatureFlagResultOutput)
}

// A collection of arguments for invoking getFeatureFlag.
type LookupFeatureFlagOutputArgs struct {
	Archived pulumi.BoolPtrInput `pulumi:"archived"`
	// A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities GetFeatureFlagClientSideAvailabilityArrayInput `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties GetFeatureFlagCustomPropertyArrayInput `pulumi:"customProperties"`
	// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
	Defaults GetFeatureFlagDefaultsPtrInput `pulumi:"defaults"`
	// The variation's description.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `includeInSnippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet pulumi.BoolPtrInput `pulumi:"includeInSnippet"`
	// The unique feature flag key that references the flag in your application code.
	Key pulumi.StringInput `pulumi:"key"`
	// The feature flag maintainer's 24 character alphanumeric team member ID.
	MaintainerId pulumi.StringPtrInput `pulumi:"maintainerId"`
	// The feature flag's project key.
	ProjectKey pulumi.StringInput `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// Whether the flag is a temporary flag.
	Temporary pulumi.BoolPtrInput `pulumi:"temporary"`
	// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
	Variations GetFeatureFlagVariationArrayInput `pulumi:"variations"`
}

func (LookupFeatureFlagOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureFlagArgs)(nil)).Elem()
}

// A collection of values returned by getFeatureFlag.
type LookupFeatureFlagResultOutput struct{ *pulumi.OutputState }

func (LookupFeatureFlagResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFeatureFlagResult)(nil)).Elem()
}

func (o LookupFeatureFlagResultOutput) ToLookupFeatureFlagResultOutput() LookupFeatureFlagResultOutput {
	return o
}

func (o LookupFeatureFlagResultOutput) ToLookupFeatureFlagResultOutputWithContext(ctx context.Context) LookupFeatureFlagResultOutput {
	return o
}

func (o LookupFeatureFlagResultOutput) Archived() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) *bool { return v.Archived }).(pulumi.BoolPtrOutput)
}

// A map describing whether this flag has been made available to the client-side JavaScript SDK. To learn more, read Nested Client-Side Availability Block.
func (o LookupFeatureFlagResultOutput) ClientSideAvailabilities() GetFeatureFlagClientSideAvailabilityArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) []GetFeatureFlagClientSideAvailability {
		return v.ClientSideAvailabilities
	}).(GetFeatureFlagClientSideAvailabilityArrayOutput)
}

// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
func (o LookupFeatureFlagResultOutput) CustomProperties() GetFeatureFlagCustomPropertyArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) []GetFeatureFlagCustomProperty { return v.CustomProperties }).(GetFeatureFlagCustomPropertyArrayOutput)
}

// A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
func (o LookupFeatureFlagResultOutput) Defaults() GetFeatureFlagDefaultsOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) GetFeatureFlagDefaults { return v.Defaults }).(GetFeatureFlagDefaultsOutput)
}

// The variation's description.
func (o LookupFeatureFlagResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFeatureFlagResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.Id }).(pulumi.StringOutput)
}

// **Deprecated** A boolean describing whether this flag has been made available to the client-side Javescript SDK using the client-side ID only. `includeInSnippet` is now deprecated. Please retrieve information from `client_side_availability.using_environment_id` to maintain future compatability.
//
// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
func (o LookupFeatureFlagResultOutput) IncludeInSnippet() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) bool { return v.IncludeInSnippet }).(pulumi.BoolOutput)
}

// The unique custom property key.
func (o LookupFeatureFlagResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.Key }).(pulumi.StringOutput)
}

// The feature flag maintainer's 24 character alphanumeric team member ID.
func (o LookupFeatureFlagResultOutput) MaintainerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.MaintainerId }).(pulumi.StringOutput)
}

// The name of the custom property.
func (o LookupFeatureFlagResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupFeatureFlagResultOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.ProjectKey }).(pulumi.StringOutput)
}

// Set of feature flag tags.
func (o LookupFeatureFlagResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Whether the flag is a temporary flag.
func (o LookupFeatureFlagResultOutput) Temporary() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) *bool { return v.Temporary }).(pulumi.BoolPtrOutput)
}

// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
func (o LookupFeatureFlagResultOutput) VariationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) string { return v.VariationType }).(pulumi.StringOutput)
}

// List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
func (o LookupFeatureFlagResultOutput) Variations() GetFeatureFlagVariationArrayOutput {
	return o.ApplyT(func(v LookupFeatureFlagResult) []GetFeatureFlagVariation { return v.Variations }).(GetFeatureFlagVariationArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFeatureFlagResultOutput{})
}
