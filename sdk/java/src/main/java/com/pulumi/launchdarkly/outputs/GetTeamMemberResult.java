// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTeamMemberResult {
    private List<String> customRoles;
    private String email;
    /**
     * @return The team member&#39;s given name.
     * 
     */
    private String firstName;
    /**
     * @return The 24 character alphanumeric ID of the team member.
     * 
     */
    private String id;
    /**
     * @return The team member&#39;s family name.
     * 
     */
    private String lastName;
    /**
     * @return The role associated with team member. Possible roles are `owner`, `reader`, `writer`, or `admin`.
     * 
     */
    private String role;

    private GetTeamMemberResult() {}
    public List<String> customRoles() {
        return this.customRoles;
    }
    public String email() {
        return this.email;
    }
    /**
     * @return The team member&#39;s given name.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return The 24 character alphanumeric ID of the team member.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The team member&#39;s family name.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return The role associated with team member. Possible roles are `owner`, `reader`, `writer`, or `admin`.
     * 
     */
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamMemberResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> customRoles;
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private String role;
        public Builder() {}
        public Builder(GetTeamMemberResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRoles = defaults.customRoles;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder customRoles(List<String> customRoles) {
            this.customRoles = Objects.requireNonNull(customRoles);
            return this;
        }
        public Builder customRoles(String... customRoles) {
            return customRoles(List.of(customRoles));
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetTeamMemberResult build() {
            final var o = new GetTeamMemberResult();
            o.customRoles = customRoles;
            o.email = email;
            o.firstName = firstName;
            o.id = id;
            o.lastName = lastName;
            o.role = role;
            return o;
        }
    }
}
