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

__all__ = ['FlagTriggerArgs', 'FlagTrigger']

@pulumi.input_type
class FlagTriggerArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 env_key: pulumi.Input[str],
                 flag_key: pulumi.Input[str],
                 instructions: pulumi.Input['FlagTriggerInstructionsArgs'],
                 integration_key: pulumi.Input[str],
                 project_key: pulumi.Input[str]):
        """
        The set of arguments for constructing a FlagTrigger resource.
        :param pulumi.Input[bool] enabled: Whether the trigger is currently active or not. This property defaults to true upon creation
        :param pulumi.Input[str] env_key: The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] flag_key: The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input['FlagTriggerInstructionsArgs'] instructions: Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        :param pulumi.Input[str] integration_key: The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] project_key: The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "env_key", env_key)
        pulumi.set(__self__, "flag_key", flag_key)
        pulumi.set(__self__, "instructions", instructions)
        pulumi.set(__self__, "integration_key", integration_key)
        pulumi.set(__self__, "project_key", project_key)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the trigger is currently active or not. This property defaults to true upon creation
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="envKey")
    def env_key(self) -> pulumi.Input[str]:
        """
        The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "env_key")

    @env_key.setter
    def env_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "env_key", value)

    @property
    @pulumi.getter(name="flagKey")
    def flag_key(self) -> pulumi.Input[str]:
        """
        The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "flag_key")

    @flag_key.setter
    def flag_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "flag_key", value)

    @property
    @pulumi.getter
    def instructions(self) -> pulumi.Input['FlagTriggerInstructionsArgs']:
        """
        Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        """
        return pulumi.get(self, "instructions")

    @instructions.setter
    def instructions(self, value: pulumi.Input['FlagTriggerInstructionsArgs']):
        pulumi.set(self, "instructions", value)

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> pulumi.Input[str]:
        """
        The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "integration_key")

    @integration_key.setter
    def integration_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "integration_key", value)

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> pulumi.Input[str]:
        """
        The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "project_key")

    @project_key.setter
    def project_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_key", value)


@pulumi.input_type
class _FlagTriggerState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 env_key: Optional[pulumi.Input[str]] = None,
                 flag_key: Optional[pulumi.Input[str]] = None,
                 instructions: Optional[pulumi.Input['FlagTriggerInstructionsArgs']] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 maintainer_id: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 trigger_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FlagTrigger resources.
        :param pulumi.Input[bool] enabled: Whether the trigger is currently active or not. This property defaults to true upon creation
        :param pulumi.Input[str] env_key: The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] flag_key: The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input['FlagTriggerInstructionsArgs'] instructions: Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        :param pulumi.Input[str] integration_key: The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] maintainer_id: The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
               your Terraform API key or the most recently-set maintainer
        :param pulumi.Input[str] project_key: The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] trigger_url: The unique trigger URL
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if env_key is not None:
            pulumi.set(__self__, "env_key", env_key)
        if flag_key is not None:
            pulumi.set(__self__, "flag_key", flag_key)
        if instructions is not None:
            pulumi.set(__self__, "instructions", instructions)
        if integration_key is not None:
            pulumi.set(__self__, "integration_key", integration_key)
        if maintainer_id is not None:
            pulumi.set(__self__, "maintainer_id", maintainer_id)
        if project_key is not None:
            pulumi.set(__self__, "project_key", project_key)
        if trigger_url is not None:
            pulumi.set(__self__, "trigger_url", trigger_url)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the trigger is currently active or not. This property defaults to true upon creation
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="envKey")
    def env_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "env_key")

    @env_key.setter
    def env_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "env_key", value)

    @property
    @pulumi.getter(name="flagKey")
    def flag_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "flag_key")

    @flag_key.setter
    def flag_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "flag_key", value)

    @property
    @pulumi.getter
    def instructions(self) -> Optional[pulumi.Input['FlagTriggerInstructionsArgs']]:
        """
        Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        """
        return pulumi.get(self, "instructions")

    @instructions.setter
    def instructions(self, value: Optional[pulumi.Input['FlagTriggerInstructionsArgs']]):
        pulumi.set(self, "instructions", value)

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "integration_key")

    @integration_key.setter
    def integration_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_key", value)

    @property
    @pulumi.getter(name="maintainerId")
    def maintainer_id(self) -> Optional[pulumi.Input[str]]:
        """
        The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
        your Terraform API key or the most recently-set maintainer
        """
        return pulumi.get(self, "maintainer_id")

    @maintainer_id.setter
    def maintainer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintainer_id", value)

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> Optional[pulumi.Input[str]]:
        """
        The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "project_key")

    @project_key.setter
    def project_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_key", value)

    @property
    @pulumi.getter(name="triggerUrl")
    def trigger_url(self) -> Optional[pulumi.Input[str]]:
        """
        The unique trigger URL
        """
        return pulumi.get(self, "trigger_url")

    @trigger_url.setter
    def trigger_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trigger_url", value)


class FlagTrigger(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 env_key: Optional[pulumi.Input[str]] = None,
                 flag_key: Optional[pulumi.Input[str]] = None,
                 instructions: Optional[pulumi.Input[pulumi.InputType['FlagTriggerInstructionsArgs']]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        LaunchDarkly flag triggers can be imported using the following syntax

        ```sh
         $ pulumi import launchdarkly:index/flagTrigger:FlagTrigger example example-project-key/example-env-key/example-flag-key/62581d4488def814b831abc3
        ```

         where the string following the final slash is your unique trigger ID. The unique trigger ID can be found in your saved trigger URLhttps://app.launchdarkly.com/webhook/triggers/THIS_IS_YOUR_TRIGGER_ID/aff25a53-17d9-4112-a9b8-12718d1a2e79 Please note that if you did not save this upon creation of the resource, you will have to reset it to get a new value, which can cause breaking changes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the trigger is currently active or not. This property defaults to true upon creation
        :param pulumi.Input[str] env_key: The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] flag_key: The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[pulumi.InputType['FlagTriggerInstructionsArgs']] instructions: Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        :param pulumi.Input[str] integration_key: The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] project_key: The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlagTriggerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        LaunchDarkly flag triggers can be imported using the following syntax

        ```sh
         $ pulumi import launchdarkly:index/flagTrigger:FlagTrigger example example-project-key/example-env-key/example-flag-key/62581d4488def814b831abc3
        ```

         where the string following the final slash is your unique trigger ID. The unique trigger ID can be found in your saved trigger URLhttps://app.launchdarkly.com/webhook/triggers/THIS_IS_YOUR_TRIGGER_ID/aff25a53-17d9-4112-a9b8-12718d1a2e79 Please note that if you did not save this upon creation of the resource, you will have to reset it to get a new value, which can cause breaking changes.

        :param str resource_name: The name of the resource.
        :param FlagTriggerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlagTriggerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 env_key: Optional[pulumi.Input[str]] = None,
                 flag_key: Optional[pulumi.Input[str]] = None,
                 instructions: Optional[pulumi.Input[pulumi.InputType['FlagTriggerInstructionsArgs']]] = None,
                 integration_key: Optional[pulumi.Input[str]] = None,
                 project_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlagTriggerArgs.__new__(FlagTriggerArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if env_key is None and not opts.urn:
                raise TypeError("Missing required property 'env_key'")
            __props__.__dict__["env_key"] = env_key
            if flag_key is None and not opts.urn:
                raise TypeError("Missing required property 'flag_key'")
            __props__.__dict__["flag_key"] = flag_key
            if instructions is None and not opts.urn:
                raise TypeError("Missing required property 'instructions'")
            __props__.__dict__["instructions"] = instructions
            if integration_key is None and not opts.urn:
                raise TypeError("Missing required property 'integration_key'")
            __props__.__dict__["integration_key"] = integration_key
            if project_key is None and not opts.urn:
                raise TypeError("Missing required property 'project_key'")
            __props__.__dict__["project_key"] = project_key
            __props__.__dict__["maintainer_id"] = None
            __props__.__dict__["trigger_url"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["triggerUrl"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(FlagTrigger, __self__).__init__(
            'launchdarkly:index/flagTrigger:FlagTrigger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            env_key: Optional[pulumi.Input[str]] = None,
            flag_key: Optional[pulumi.Input[str]] = None,
            instructions: Optional[pulumi.Input[pulumi.InputType['FlagTriggerInstructionsArgs']]] = None,
            integration_key: Optional[pulumi.Input[str]] = None,
            maintainer_id: Optional[pulumi.Input[str]] = None,
            project_key: Optional[pulumi.Input[str]] = None,
            trigger_url: Optional[pulumi.Input[str]] = None) -> 'FlagTrigger':
        """
        Get an existing FlagTrigger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the trigger is currently active or not. This property defaults to true upon creation
        :param pulumi.Input[str] env_key: The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] flag_key: The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[pulumi.InputType['FlagTriggerInstructionsArgs']] instructions: Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        :param pulumi.Input[str] integration_key: The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] maintainer_id: The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
               your Terraform API key or the most recently-set maintainer
        :param pulumi.Input[str] project_key: The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        :param pulumi.Input[str] trigger_url: The unique trigger URL
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlagTriggerState.__new__(_FlagTriggerState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["env_key"] = env_key
        __props__.__dict__["flag_key"] = flag_key
        __props__.__dict__["instructions"] = instructions
        __props__.__dict__["integration_key"] = integration_key
        __props__.__dict__["maintainer_id"] = maintainer_id
        __props__.__dict__["project_key"] = project_key
        __props__.__dict__["trigger_url"] = trigger_url
        return FlagTrigger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the trigger is currently active or not. This property defaults to true upon creation
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="envKey")
    def env_key(self) -> pulumi.Output[str]:
        """
        The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "env_key")

    @property
    @pulumi.getter(name="flagKey")
    def flag_key(self) -> pulumi.Output[str]:
        """
        The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "flag_key")

    @property
    @pulumi.getter
    def instructions(self) -> pulumi.Output['outputs.FlagTriggerInstructions']:
        """
        Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `"turnFlagOn"` and `"turnFlagOff"`. This must be passed as the key-value pair `{ kind = "<flag_action>" }`.
        """
        return pulumi.get(self, "instructions")

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> pulumi.Output[str]:
        """
        The unique identifier of the integration you intend to set your trigger up with. Currently supported are `"datadog"`, `"dynatrace"`, `"honeycomb"`, `"new-relic-apm"`, `"signalfx"`, and `"generic-trigger"`. `"generic-trigger"` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "integration_key")

    @property
    @pulumi.getter(name="maintainerId")
    def maintainer_id(self) -> pulumi.Output[str]:
        """
        The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
        your Terraform API key or the most recently-set maintainer
        """
        return pulumi.get(self, "maintainer_id")

    @property
    @pulumi.getter(name="projectKey")
    def project_key(self) -> pulumi.Output[str]:
        """
        The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
        """
        return pulumi.get(self, "project_key")

    @property
    @pulumi.getter(name="triggerUrl")
    def trigger_url(self) -> pulumi.Output[str]:
        """
        The unique trigger URL
        """
        return pulumi.get(self, "trigger_url")

