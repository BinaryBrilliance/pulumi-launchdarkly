# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TeamArgs', 'Team']

@pulumi.input_type
class TeamArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 custom_role_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 maintainers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 member_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Team resource.
        :param pulumi.Input[str] key: The team key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_role_keys: List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        :param pulumi.Input[str] description: The team description.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] maintainers: List of member IDs for users who maintain the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_ids: List of member IDs who belong to the team.
        :param pulumi.Input[str] name: A human-friendly name for the team.
        """
        pulumi.set(__self__, "key", key)
        if custom_role_keys is not None:
            pulumi.set(__self__, "custom_role_keys", custom_role_keys)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if maintainers is not None:
            pulumi.set(__self__, "maintainers", maintainers)
        if member_ids is not None:
            pulumi.set(__self__, "member_ids", member_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        The team key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="customRoleKeys")
    def custom_role_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        """
        return pulumi.get(self, "custom_role_keys")

    @custom_role_keys.setter
    def custom_role_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_role_keys", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The team description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def maintainers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member IDs for users who maintain the team.
        """
        return pulumi.get(self, "maintainers")

    @maintainers.setter
    def maintainers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "maintainers", value)

    @property
    @pulumi.getter(name="memberIds")
    def member_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member IDs who belong to the team.
        """
        return pulumi.get(self, "member_ids")

    @member_ids.setter
    def member_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "member_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly name for the team.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TeamState:
    def __init__(__self__, *,
                 custom_role_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 maintainers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 member_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Team resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_role_keys: List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        :param pulumi.Input[str] description: The team description.
        :param pulumi.Input[str] key: The team key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] maintainers: List of member IDs for users who maintain the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_ids: List of member IDs who belong to the team.
        :param pulumi.Input[str] name: A human-friendly name for the team.
        """
        if custom_role_keys is not None:
            pulumi.set(__self__, "custom_role_keys", custom_role_keys)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if maintainers is not None:
            pulumi.set(__self__, "maintainers", maintainers)
        if member_ids is not None:
            pulumi.set(__self__, "member_ids", member_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="customRoleKeys")
    def custom_role_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        """
        return pulumi.get(self, "custom_role_keys")

    @custom_role_keys.setter
    def custom_role_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_role_keys", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The team description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The team key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def maintainers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member IDs for users who maintain the team.
        """
        return pulumi.get(self, "maintainers")

    @maintainers.setter
    def maintainers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "maintainers", value)

    @property
    @pulumi.getter(name="memberIds")
    def member_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member IDs who belong to the team.
        """
        return pulumi.get(self, "member_ids")

    @member_ids.setter
    def member_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "member_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A human-friendly name for the team.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Team(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_role_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 maintainers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 member_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a LaunchDarkly team resource.

        This resource allows you to create and manage a team within your LaunchDarkly organization.

        > **Note:** Teams are available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_launchdarkly as launchdarkly

        platform_team = launchdarkly.Team("platformTeam",
            custom_role_keys=[
                "platform",
                "nomad-administrators",
            ],
            description="Team to manage internal infrastructure",
            key="platform_team",
            maintainers=["12ab3c45de678910abc12345"],
            member_ids=[
                "507f1f77bcf86cd799439011",
                "569f183514f4432160000007",
            ])
        ```

        ## Import

        A LaunchDarkly team can be imported using the team key

        ```sh
         $ pulumi import launchdarkly:index/team:Team platform_team platform_team
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_role_keys: List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        :param pulumi.Input[str] description: The team description.
        :param pulumi.Input[str] key: The team key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] maintainers: List of member IDs for users who maintain the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_ids: List of member IDs who belong to the team.
        :param pulumi.Input[str] name: A human-friendly name for the team.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a LaunchDarkly team resource.

        This resource allows you to create and manage a team within your LaunchDarkly organization.

        > **Note:** Teams are available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_launchdarkly as launchdarkly

        platform_team = launchdarkly.Team("platformTeam",
            custom_role_keys=[
                "platform",
                "nomad-administrators",
            ],
            description="Team to manage internal infrastructure",
            key="platform_team",
            maintainers=["12ab3c45de678910abc12345"],
            member_ids=[
                "507f1f77bcf86cd799439011",
                "569f183514f4432160000007",
            ])
        ```

        ## Import

        A LaunchDarkly team can be imported using the team key

        ```sh
         $ pulumi import launchdarkly:index/team:Team platform_team platform_team
        ```

        :param str resource_name: The name of the resource.
        :param TeamArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_role_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 maintainers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 member_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamArgs.__new__(TeamArgs)

            __props__.__dict__["custom_role_keys"] = custom_role_keys
            __props__.__dict__["description"] = description
            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["maintainers"] = maintainers
            __props__.__dict__["member_ids"] = member_ids
            __props__.__dict__["name"] = name
        super(Team, __self__).__init__(
            'launchdarkly:index/team:Team',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_role_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            maintainers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            member_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Team':
        """
        Get an existing Team resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_role_keys: List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        :param pulumi.Input[str] description: The team description.
        :param pulumi.Input[str] key: The team key.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] maintainers: List of member IDs for users who maintain the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_ids: List of member IDs who belong to the team.
        :param pulumi.Input[str] name: A human-friendly name for the team.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamState.__new__(_TeamState)

        __props__.__dict__["custom_role_keys"] = custom_role_keys
        __props__.__dict__["description"] = description
        __props__.__dict__["key"] = key
        __props__.__dict__["maintainers"] = maintainers
        __props__.__dict__["member_ids"] = member_ids
        __props__.__dict__["name"] = name
        return Team(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customRoleKeys")
    def custom_role_keys(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don't, the provider may behave unexpectedly.
        """
        return pulumi.get(self, "custom_role_keys")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The team description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The team key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def maintainers(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of member IDs for users who maintain the team.
        """
        return pulumi.get(self, "maintainers")

    @property
    @pulumi.getter(name="memberIds")
    def member_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of member IDs who belong to the team.
        """
        return pulumi.get(self, "member_ids")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A human-friendly name for the team.
        """
        return pulumi.get(self, "name")
