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

__all__ = [
    'GetAuditLogSubscriptionResult',
    'AwaitableGetAuditLogSubscriptionResult',
    'get_audit_log_subscription',
    'get_audit_log_subscription_output',
]

@pulumi.output_type
class GetAuditLogSubscriptionResult:
    """
    A collection of values returned by getAuditLogSubscription.
    """
    def __init__(__self__, config=None, id=None, integration_key=None, name=None, on=None, statements=None, tags=None):
        if config and not isinstance(config, dict):
            raise TypeError("Expected argument 'config' to be a dict")
        pulumi.set(__self__, "config", config)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integration_key and not isinstance(integration_key, str):
            raise TypeError("Expected argument 'integration_key' to be a str")
        pulumi.set(__self__, "integration_key", integration_key)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if on and not isinstance(on, bool):
            raise TypeError("Expected argument 'on' to be a bool")
        pulumi.set(__self__, "on", on)
        if statements and not isinstance(statements, list):
            raise TypeError("Expected argument 'statements' to be a list")
        pulumi.set(__self__, "statements", statements)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def config(self) -> Optional[Mapping[str, Any]]:
        """
        A block of configuration fields associated with your integration type.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationKey")
    def integration_key(self) -> str:
        return pulumi.get(self, "integration_key")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The subscription's human-readable name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def on(self) -> Optional[bool]:
        """
        Whether the subscription is enabled.
        """
        return pulumi.get(self, "on")

    @property
    @pulumi.getter
    def statements(self) -> Optional[Sequence['outputs.GetAuditLogSubscriptionStatementResult']]:
        """
        The statement block used to filter subscription events. To learn more, read Statement Blocks.
        """
        return pulumi.get(self, "statements")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Sequence[str]]:
        """
        Set of tags associated with the subscription.
        """
        return pulumi.get(self, "tags")


class AwaitableGetAuditLogSubscriptionResult(GetAuditLogSubscriptionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuditLogSubscriptionResult(
            config=self.config,
            id=self.id,
            integration_key=self.integration_key,
            name=self.name,
            on=self.on,
            statements=self.statements,
            tags=self.tags)


def get_audit_log_subscription(config: Optional[Mapping[str, Any]] = None,
                               id: Optional[str] = None,
                               integration_key: Optional[str] = None,
                               name: Optional[str] = None,
                               on: Optional[bool] = None,
                               statements: Optional[Sequence[pulumi.InputType['GetAuditLogSubscriptionStatementArgs']]] = None,
                               tags: Optional[Sequence[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuditLogSubscriptionResult:
    """
    Provides a LaunchDarkly audit log subscription data source.

    This data source allows you to retrieve information about LaunchDarkly audit log subscriptions.

    ```python
    import pulumi
    import pulumi_launchdarkly as launchdarkly

    test = launchdarkly.get_audit_log_subscription(id="5f0cd446a77cba0b4c5644a7",
        integration_key="msteams")
    ```


    :param Mapping[str, Any] config: A block of configuration fields associated with your integration type.
    :param str id: The unique subscription ID. This can be found in the URL of the pull-out configuration sidebar for the given subscription on your [LaunchDarkly Integrations page](https://app.launchdarkly.com/default/integrations).
    :param str integration_key: The integration key. As of February 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`.
    :param str name: The subscription's human-readable name.
    :param bool on: Whether the subscription is enabled.
    :param Sequence[pulumi.InputType['GetAuditLogSubscriptionStatementArgs']] statements: The statement block used to filter subscription events. To learn more, read Statement Blocks.
    :param Sequence[str] tags: Set of tags associated with the subscription.
    """
    __args__ = dict()
    __args__['config'] = config
    __args__['id'] = id
    __args__['integrationKey'] = integration_key
    __args__['name'] = name
    __args__['on'] = on
    __args__['statements'] = statements
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('launchdarkly:index/getAuditLogSubscription:getAuditLogSubscription', __args__, opts=opts, typ=GetAuditLogSubscriptionResult).value

    return AwaitableGetAuditLogSubscriptionResult(
        config=__ret__.config,
        id=__ret__.id,
        integration_key=__ret__.integration_key,
        name=__ret__.name,
        on=__ret__.on,
        statements=__ret__.statements,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_audit_log_subscription)
def get_audit_log_subscription_output(config: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                      id: Optional[pulumi.Input[str]] = None,
                                      integration_key: Optional[pulumi.Input[str]] = None,
                                      name: Optional[pulumi.Input[Optional[str]]] = None,
                                      on: Optional[pulumi.Input[Optional[bool]]] = None,
                                      statements: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetAuditLogSubscriptionStatementArgs']]]]] = None,
                                      tags: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAuditLogSubscriptionResult]:
    """
    Provides a LaunchDarkly audit log subscription data source.

    This data source allows you to retrieve information about LaunchDarkly audit log subscriptions.

    ```python
    import pulumi
    import pulumi_launchdarkly as launchdarkly

    test = launchdarkly.get_audit_log_subscription(id="5f0cd446a77cba0b4c5644a7",
        integration_key="msteams")
    ```


    :param Mapping[str, Any] config: A block of configuration fields associated with your integration type.
    :param str id: The unique subscription ID. This can be found in the URL of the pull-out configuration sidebar for the given subscription on your [LaunchDarkly Integrations page](https://app.launchdarkly.com/default/integrations).
    :param str integration_key: The integration key. As of February 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`.
    :param str name: The subscription's human-readable name.
    :param bool on: Whether the subscription is enabled.
    :param Sequence[pulumi.InputType['GetAuditLogSubscriptionStatementArgs']] statements: The statement block used to filter subscription events. To learn more, read Statement Blocks.
    :param Sequence[str] tags: Set of tags associated with the subscription.
    """
    ...
