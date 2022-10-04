# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['WebhookArgs', 'Webhook']

@pulumi.input_type
class WebhookArgs:
    def __init__(__self__, *,
                 url: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 on: Optional[pulumi.Input[bool]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 statements: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Webhook resource.
        :param pulumi.Input[str] url: The URL of the remote webhook.
        :param pulumi.Input[str] name: The webhook's human-readable name.
        :param pulumi.Input[bool] on: Specifies whether the webhook is enabled.
        :param pulumi.Input[str] secret: The secret used to sign the webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Set of tags associated with the webhook.
        """
        pulumi.set(__self__, "url", url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if on is not None:
            pulumi.set(__self__, "on", on)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if statements is not None:
            pulumi.set(__self__, "statements", statements)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL of the remote webhook.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The webhook's human-readable name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def on(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the webhook is enabled.
        """
        return pulumi.get(self, "on")

    @on.setter
    def on(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        The secret used to sign the webhook.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter
    def statements(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]]:
        return pulumi.get(self, "statements")

    @statements.setter
    def statements(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]]):
        pulumi.set(self, "statements", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of tags associated with the webhook.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _WebhookState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 on: Optional[pulumi.Input[bool]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 statements: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Webhook resources.
        :param pulumi.Input[str] name: The webhook's human-readable name.
        :param pulumi.Input[bool] on: Specifies whether the webhook is enabled.
        :param pulumi.Input[str] secret: The secret used to sign the webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Set of tags associated with the webhook.
        :param pulumi.Input[str] url: The URL of the remote webhook.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if on is not None:
            pulumi.set(__self__, "on", on)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if statements is not None:
            pulumi.set(__self__, "statements", statements)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The webhook's human-readable name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def on(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the webhook is enabled.
        """
        return pulumi.get(self, "on")

    @on.setter
    def on(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        The secret used to sign the webhook.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter
    def statements(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]]:
        return pulumi.get(self, "statements")

    @statements.setter
    def statements(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookStatementArgs']]]]):
        pulumi.set(self, "statements", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of tags associated with the webhook.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the remote webhook.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class Webhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 on: Optional[pulumi.Input[bool]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 statements: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookStatementArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a LaunchDarkly webhook resource.

        This resource allows you to create and manage webhooks within your LaunchDarkly organization.

        ## Import

        LaunchDarkly webhooks can be imported using the webhook's 24 character ID, e.g.

        ```sh
         $ pulumi import launchdarkly:index/webhook:Webhook example 57c0af609969090743529967
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The webhook's human-readable name.
        :param pulumi.Input[bool] on: Specifies whether the webhook is enabled.
        :param pulumi.Input[str] secret: The secret used to sign the webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Set of tags associated with the webhook.
        :param pulumi.Input[str] url: The URL of the remote webhook.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a LaunchDarkly webhook resource.

        This resource allows you to create and manage webhooks within your LaunchDarkly organization.

        ## Import

        LaunchDarkly webhooks can be imported using the webhook's 24 character ID, e.g.

        ```sh
         $ pulumi import launchdarkly:index/webhook:Webhook example 57c0af609969090743529967
        ```

        :param str resource_name: The name of the resource.
        :param WebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 on: Optional[pulumi.Input[bool]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 statements: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookStatementArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookArgs.__new__(WebhookArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["on"] = on
            __props__.__dict__["secret"] = None if secret is None else pulumi.Output.secret(secret)
            __props__.__dict__["statements"] = statements
            __props__.__dict__["tags"] = tags
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Webhook, __self__).__init__(
            'launchdarkly:index/webhook:Webhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            on: Optional[pulumi.Input[bool]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            statements: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WebhookStatementArgs']]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'Webhook':
        """
        Get an existing Webhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The webhook's human-readable name.
        :param pulumi.Input[bool] on: Specifies whether the webhook is enabled.
        :param pulumi.Input[str] secret: The secret used to sign the webhook.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Set of tags associated with the webhook.
        :param pulumi.Input[str] url: The URL of the remote webhook.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookState.__new__(_WebhookState)

        __props__.__dict__["name"] = name
        __props__.__dict__["on"] = on
        __props__.__dict__["secret"] = secret
        __props__.__dict__["statements"] = statements
        __props__.__dict__["tags"] = tags
        __props__.__dict__["url"] = url
        return Webhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The webhook's human-readable name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def on(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the webhook is enabled.
        """
        return pulumi.get(self, "on")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[str]]:
        """
        The secret used to sign the webhook.
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter
    def statements(self) -> pulumi.Output[Optional[Sequence['outputs.WebhookStatement']]]:
        return pulumi.get(self, "statements")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Set of tags associated with the webhook.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL of the remote webhook.
        """
        return pulumi.get(self, "url")

