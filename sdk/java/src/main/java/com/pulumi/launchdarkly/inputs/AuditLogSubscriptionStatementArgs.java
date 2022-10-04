// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuditLogSubscriptionStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuditLogSubscriptionStatementArgs Empty = new AuditLogSubscriptionStatementArgs();

    /**
     * The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<String>> actions;

    /**
     * @return The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     * 
     */
    public Optional<Output<List<String>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     * 
     */
    @Import(name="notActions")
    private @Nullable Output<List<String>> notActions;

    /**
     * @return The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     * 
     */
    public Optional<Output<List<String>>> notActions() {
        return Optional.ofNullable(this.notActions);
    }

    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     * 
     */
    @Import(name="notResources")
    private @Nullable Output<List<String>> notResources;

    /**
     * @return The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     * 
     */
    public Optional<Output<List<String>>> notResources() {
        return Optional.ofNullable(this.notResources);
    }

    /**
     * The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private AuditLogSubscriptionStatementArgs() {}

    private AuditLogSubscriptionStatementArgs(AuditLogSubscriptionStatementArgs $) {
        this.actions = $.actions;
        this.effect = $.effect;
        this.notActions = $.notActions;
        this.notResources = $.notResources;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuditLogSubscriptionStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuditLogSubscriptionStatementArgs $;

        public Builder() {
            $ = new AuditLogSubscriptionStatementArgs();
        }

        public Builder(AuditLogSubscriptionStatementArgs defaults) {
            $ = new AuditLogSubscriptionStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param effect Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param notActions The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder notActions(@Nullable Output<List<String>> notActions) {
            $.notActions = notActions;
            return this;
        }

        /**
         * @param notActions The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder notActions(List<String> notActions) {
            return notActions(Output.of(notActions));
        }

        /**
         * @param notActions The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
         * 
         * @return builder
         * 
         */
        public Builder notActions(String... notActions) {
            return notActions(List.of(notActions));
        }

        /**
         * @param notResources The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder notResources(@Nullable Output<List<String>> notResources) {
            $.notResources = notResources;
            return this;
        }

        /**
         * @param notResources The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder notResources(List<String> notResources) {
            return notResources(Output.of(notResources));
        }

        /**
         * @param notResources The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder notResources(String... notResources) {
            return notResources(List.of(notResources));
        }

        /**
         * @param resources The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public AuditLogSubscriptionStatementArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            return $;
        }
    }

}
