// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly audit log subscription resource.
//
// This resource allows you to create and manage LaunchDarkly audit log subscriptions.
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
//			_, err := launchdarkly.NewAuditLogSubscription(ctx, "example", &launchdarkly.AuditLogSubscriptionArgs{
//				Config: pulumi.AnyMap{
//					"api_key":  pulumi.Any("yoursecretkey"),
//					"host_url": pulumi.Any("https://api.datadoghq.com"),
//				},
//				IntegrationKey: pulumi.String("datadog"),
//				Statements: launchdarkly.AuditLogSubscriptionStatementArray{
//					&launchdarkly.AuditLogSubscriptionStatementArgs{
//						Actions: pulumi.StringArray{
//							pulumi.String("*"),
//						},
//						Effect: pulumi.String("allow"),
//						Resources: pulumi.StringArray{
//							pulumi.String("proj/*:env/*:flag/*"),
//						},
//					},
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("integrations"),
//					pulumi.String("terraform"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuditLogSubscription struct {
	pulumi.CustomResourceState

	Config pulumi.MapOutput `pulumi:"config"`
	// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	IntegrationKey pulumi.StringOutput `pulumi:"integrationKey"`
	// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether or not you want your subscription enabled, i.e. to actively send events.
	On pulumi.BoolOutput `pulumi:"on"`
	// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
	Statements AuditLogSubscriptionStatementArrayOutput `pulumi:"statements"`
	// Set of tags associated with the subscription object.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewAuditLogSubscription registers a new resource with the given unique name, arguments, and options.
func NewAuditLogSubscription(ctx *pulumi.Context,
	name string, args *AuditLogSubscriptionArgs, opts ...pulumi.ResourceOption) (*AuditLogSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.IntegrationKey == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationKey'")
	}
	if args.On == nil {
		return nil, errors.New("invalid value for required argument 'On'")
	}
	if args.Statements == nil {
		return nil, errors.New("invalid value for required argument 'Statements'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource AuditLogSubscription
	err := ctx.RegisterResource("launchdarkly:index/auditLogSubscription:AuditLogSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuditLogSubscription gets an existing AuditLogSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuditLogSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuditLogSubscriptionState, opts ...pulumi.ResourceOption) (*AuditLogSubscription, error) {
	var resource AuditLogSubscription
	err := ctx.ReadResource("launchdarkly:index/auditLogSubscription:AuditLogSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuditLogSubscription resources.
type auditLogSubscriptionState struct {
	Config map[string]interface{} `pulumi:"config"`
	// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	IntegrationKey *string `pulumi:"integrationKey"`
	// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
	Name *string `pulumi:"name"`
	// Whether or not you want your subscription enabled, i.e. to actively send events.
	On *bool `pulumi:"on"`
	// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
	Statements []AuditLogSubscriptionStatement `pulumi:"statements"`
	// Set of tags associated with the subscription object.
	Tags []string `pulumi:"tags"`
}

type AuditLogSubscriptionState struct {
	Config pulumi.MapInput
	// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	IntegrationKey pulumi.StringPtrInput
	// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
	Name pulumi.StringPtrInput
	// Whether or not you want your subscription enabled, i.e. to actively send events.
	On pulumi.BoolPtrInput
	// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
	Statements AuditLogSubscriptionStatementArrayInput
	// Set of tags associated with the subscription object.
	Tags pulumi.StringArrayInput
}

func (AuditLogSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*auditLogSubscriptionState)(nil)).Elem()
}

type auditLogSubscriptionArgs struct {
	Config map[string]interface{} `pulumi:"config"`
	// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	IntegrationKey string `pulumi:"integrationKey"`
	// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
	Name *string `pulumi:"name"`
	// Whether or not you want your subscription enabled, i.e. to actively send events.
	On bool `pulumi:"on"`
	// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
	Statements []AuditLogSubscriptionStatement `pulumi:"statements"`
	// Set of tags associated with the subscription object.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a AuditLogSubscription resource.
type AuditLogSubscriptionArgs struct {
	Config pulumi.MapInput
	// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	IntegrationKey pulumi.StringInput
	// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
	Name pulumi.StringPtrInput
	// Whether or not you want your subscription enabled, i.e. to actively send events.
	On pulumi.BoolInput
	// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
	Statements AuditLogSubscriptionStatementArrayInput
	// Set of tags associated with the subscription object.
	Tags pulumi.StringArrayInput
}

func (AuditLogSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*auditLogSubscriptionArgs)(nil)).Elem()
}

type AuditLogSubscriptionInput interface {
	pulumi.Input

	ToAuditLogSubscriptionOutput() AuditLogSubscriptionOutput
	ToAuditLogSubscriptionOutputWithContext(ctx context.Context) AuditLogSubscriptionOutput
}

func (*AuditLogSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**AuditLogSubscription)(nil)).Elem()
}

func (i *AuditLogSubscription) ToAuditLogSubscriptionOutput() AuditLogSubscriptionOutput {
	return i.ToAuditLogSubscriptionOutputWithContext(context.Background())
}

func (i *AuditLogSubscription) ToAuditLogSubscriptionOutputWithContext(ctx context.Context) AuditLogSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuditLogSubscriptionOutput)
}

// AuditLogSubscriptionArrayInput is an input type that accepts AuditLogSubscriptionArray and AuditLogSubscriptionArrayOutput values.
// You can construct a concrete instance of `AuditLogSubscriptionArrayInput` via:
//
//	AuditLogSubscriptionArray{ AuditLogSubscriptionArgs{...} }
type AuditLogSubscriptionArrayInput interface {
	pulumi.Input

	ToAuditLogSubscriptionArrayOutput() AuditLogSubscriptionArrayOutput
	ToAuditLogSubscriptionArrayOutputWithContext(context.Context) AuditLogSubscriptionArrayOutput
}

type AuditLogSubscriptionArray []AuditLogSubscriptionInput

func (AuditLogSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuditLogSubscription)(nil)).Elem()
}

func (i AuditLogSubscriptionArray) ToAuditLogSubscriptionArrayOutput() AuditLogSubscriptionArrayOutput {
	return i.ToAuditLogSubscriptionArrayOutputWithContext(context.Background())
}

func (i AuditLogSubscriptionArray) ToAuditLogSubscriptionArrayOutputWithContext(ctx context.Context) AuditLogSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuditLogSubscriptionArrayOutput)
}

// AuditLogSubscriptionMapInput is an input type that accepts AuditLogSubscriptionMap and AuditLogSubscriptionMapOutput values.
// You can construct a concrete instance of `AuditLogSubscriptionMapInput` via:
//
//	AuditLogSubscriptionMap{ "key": AuditLogSubscriptionArgs{...} }
type AuditLogSubscriptionMapInput interface {
	pulumi.Input

	ToAuditLogSubscriptionMapOutput() AuditLogSubscriptionMapOutput
	ToAuditLogSubscriptionMapOutputWithContext(context.Context) AuditLogSubscriptionMapOutput
}

type AuditLogSubscriptionMap map[string]AuditLogSubscriptionInput

func (AuditLogSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuditLogSubscription)(nil)).Elem()
}

func (i AuditLogSubscriptionMap) ToAuditLogSubscriptionMapOutput() AuditLogSubscriptionMapOutput {
	return i.ToAuditLogSubscriptionMapOutputWithContext(context.Background())
}

func (i AuditLogSubscriptionMap) ToAuditLogSubscriptionMapOutputWithContext(ctx context.Context) AuditLogSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuditLogSubscriptionMapOutput)
}

type AuditLogSubscriptionOutput struct{ *pulumi.OutputState }

func (AuditLogSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuditLogSubscription)(nil)).Elem()
}

func (o AuditLogSubscriptionOutput) ToAuditLogSubscriptionOutput() AuditLogSubscriptionOutput {
	return o
}

func (o AuditLogSubscriptionOutput) ToAuditLogSubscriptionOutputWithContext(ctx context.Context) AuditLogSubscriptionOutput {
	return o
}

func (o AuditLogSubscriptionOutput) Config() pulumi.MapOutput {
	return o.ApplyT(func(v *AuditLogSubscription) pulumi.MapOutput { return v.Config }).(pulumi.MapOutput)
}

// The integration key. As of January 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o AuditLogSubscriptionOutput) IntegrationKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuditLogSubscription) pulumi.StringOutput { return v.IntegrationKey }).(pulumi.StringOutput)
}

// A human-friendly name for your audit log subscription viewable from within the LaunchDarkly Integrations page.
func (o AuditLogSubscriptionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AuditLogSubscription) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether or not you want your subscription enabled, i.e. to actively send events.
func (o AuditLogSubscriptionOutput) On() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuditLogSubscription) pulumi.BoolOutput { return v.On }).(pulumi.BoolOutput)
}

// A block representing the resources to which you wish to subscribe. To learn more about how to configure these blocks, read Nested Subscription Statements Blocks.
func (o AuditLogSubscriptionOutput) Statements() AuditLogSubscriptionStatementArrayOutput {
	return o.ApplyT(func(v *AuditLogSubscription) AuditLogSubscriptionStatementArrayOutput { return v.Statements }).(AuditLogSubscriptionStatementArrayOutput)
}

// Set of tags associated with the subscription object.
func (o AuditLogSubscriptionOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuditLogSubscription) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type AuditLogSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (AuditLogSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuditLogSubscription)(nil)).Elem()
}

func (o AuditLogSubscriptionArrayOutput) ToAuditLogSubscriptionArrayOutput() AuditLogSubscriptionArrayOutput {
	return o
}

func (o AuditLogSubscriptionArrayOutput) ToAuditLogSubscriptionArrayOutputWithContext(ctx context.Context) AuditLogSubscriptionArrayOutput {
	return o
}

func (o AuditLogSubscriptionArrayOutput) Index(i pulumi.IntInput) AuditLogSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuditLogSubscription {
		return vs[0].([]*AuditLogSubscription)[vs[1].(int)]
	}).(AuditLogSubscriptionOutput)
}

type AuditLogSubscriptionMapOutput struct{ *pulumi.OutputState }

func (AuditLogSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuditLogSubscription)(nil)).Elem()
}

func (o AuditLogSubscriptionMapOutput) ToAuditLogSubscriptionMapOutput() AuditLogSubscriptionMapOutput {
	return o
}

func (o AuditLogSubscriptionMapOutput) ToAuditLogSubscriptionMapOutputWithContext(ctx context.Context) AuditLogSubscriptionMapOutput {
	return o
}

func (o AuditLogSubscriptionMapOutput) MapIndex(k pulumi.StringInput) AuditLogSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuditLogSubscription {
		return vs[0].(map[string]*AuditLogSubscription)[vs[1].(string)]
	}).(AuditLogSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuditLogSubscriptionInput)(nil)).Elem(), &AuditLogSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuditLogSubscriptionArrayInput)(nil)).Elem(), AuditLogSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuditLogSubscriptionMapInput)(nil)).Elem(), AuditLogSubscriptionMap{})
	pulumi.RegisterOutputType(AuditLogSubscriptionOutput{})
	pulumi.RegisterOutputType(AuditLogSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(AuditLogSubscriptionMapOutput{})
}
