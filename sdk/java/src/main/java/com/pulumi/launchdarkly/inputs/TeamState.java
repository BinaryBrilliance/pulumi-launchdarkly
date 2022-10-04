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


public final class TeamState extends com.pulumi.resources.ResourceArgs {

    public static final TeamState Empty = new TeamState();

    /**
     * List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
     * 
     */
    @Import(name="customRoleKeys")
    private @Nullable Output<List<String>> customRoleKeys;

    /**
     * @return List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
     * 
     */
    public Optional<Output<List<String>>> customRoleKeys() {
        return Optional.ofNullable(this.customRoleKeys);
    }

    /**
     * The team description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The team description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The team key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The team key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * List of member IDs for users who maintain the team.
     * 
     */
    @Import(name="maintainers")
    private @Nullable Output<List<String>> maintainers;

    /**
     * @return List of member IDs for users who maintain the team.
     * 
     */
    public Optional<Output<List<String>>> maintainers() {
        return Optional.ofNullable(this.maintainers);
    }

    /**
     * List of member IDs who belong to the team.
     * 
     */
    @Import(name="memberIds")
    private @Nullable Output<List<String>> memberIds;

    /**
     * @return List of member IDs who belong to the team.
     * 
     */
    public Optional<Output<List<String>>> memberIds() {
        return Optional.ofNullable(this.memberIds);
    }

    /**
     * A human-friendly name for the team.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-friendly name for the team.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TeamState() {}

    private TeamState(TeamState $) {
        this.customRoleKeys = $.customRoleKeys;
        this.description = $.description;
        this.key = $.key;
        this.maintainers = $.maintainers;
        this.memberIds = $.memberIds;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamState $;

        public Builder() {
            $ = new TeamState();
        }

        public Builder(TeamState defaults) {
            $ = new TeamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRoleKeys List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
         * 
         * @return builder
         * 
         */
        public Builder customRoleKeys(@Nullable Output<List<String>> customRoleKeys) {
            $.customRoleKeys = customRoleKeys;
            return this;
        }

        /**
         * @param customRoleKeys List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
         * 
         * @return builder
         * 
         */
        public Builder customRoleKeys(List<String> customRoleKeys) {
            return customRoleKeys(Output.of(customRoleKeys));
        }

        /**
         * @param customRoleKeys List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
         * 
         * @return builder
         * 
         */
        public Builder customRoleKeys(String... customRoleKeys) {
            return customRoleKeys(List.of(customRoleKeys));
        }

        /**
         * @param description The team description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The team description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key The team key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The team key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param maintainers List of member IDs for users who maintain the team.
         * 
         * @return builder
         * 
         */
        public Builder maintainers(@Nullable Output<List<String>> maintainers) {
            $.maintainers = maintainers;
            return this;
        }

        /**
         * @param maintainers List of member IDs for users who maintain the team.
         * 
         * @return builder
         * 
         */
        public Builder maintainers(List<String> maintainers) {
            return maintainers(Output.of(maintainers));
        }

        /**
         * @param maintainers List of member IDs for users who maintain the team.
         * 
         * @return builder
         * 
         */
        public Builder maintainers(String... maintainers) {
            return maintainers(List.of(maintainers));
        }

        /**
         * @param memberIds List of member IDs who belong to the team.
         * 
         * @return builder
         * 
         */
        public Builder memberIds(@Nullable Output<List<String>> memberIds) {
            $.memberIds = memberIds;
            return this;
        }

        /**
         * @param memberIds List of member IDs who belong to the team.
         * 
         * @return builder
         * 
         */
        public Builder memberIds(List<String> memberIds) {
            return memberIds(Output.of(memberIds));
        }

        /**
         * @param memberIds List of member IDs who belong to the team.
         * 
         * @return builder
         * 
         */
        public Builder memberIds(String... memberIds) {
            return memberIds(List.of(memberIds));
        }

        /**
         * @param name A human-friendly name for the team.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-friendly name for the team.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TeamState build() {
            return $;
        }
    }

}
