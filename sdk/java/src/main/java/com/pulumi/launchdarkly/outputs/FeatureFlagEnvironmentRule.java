// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.FeatureFlagEnvironmentRuleClause;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFlagEnvironmentRule {
    /**
     * @return Group percentage rollout by a custom attribute. This argument is only valid if `rollout_weights` is also specified.
     * 
     */
    private @Nullable String bucketBy;
    /**
     * @return List of nested blocks specifying the logical clauses to evaluate. To learn more, read Nested Clauses Blocks.
     * 
     */
    private @Nullable List<FeatureFlagEnvironmentRuleClause> clauses;
    /**
     * @return List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rollout_weights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rollout_weights`.
     * 
     */
    private @Nullable List<Integer> rolloutWeights;
    /**
     * @return The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rollout_weights`.
     * 
     */
    private @Nullable Integer variation;

    private FeatureFlagEnvironmentRule() {}
    /**
     * @return Group percentage rollout by a custom attribute. This argument is only valid if `rollout_weights` is also specified.
     * 
     */
    public Optional<String> bucketBy() {
        return Optional.ofNullable(this.bucketBy);
    }
    /**
     * @return List of nested blocks specifying the logical clauses to evaluate. To learn more, read Nested Clauses Blocks.
     * 
     */
    public List<FeatureFlagEnvironmentRuleClause> clauses() {
        return this.clauses == null ? List.of() : this.clauses;
    }
    /**
     * @return List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rollout_weights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rollout_weights`.
     * 
     */
    public List<Integer> rolloutWeights() {
        return this.rolloutWeights == null ? List.of() : this.rolloutWeights;
    }
    /**
     * @return The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rollout_weights`.
     * 
     */
    public Optional<Integer> variation() {
        return Optional.ofNullable(this.variation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFlagEnvironmentRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketBy;
        private @Nullable List<FeatureFlagEnvironmentRuleClause> clauses;
        private @Nullable List<Integer> rolloutWeights;
        private @Nullable Integer variation;
        public Builder() {}
        public Builder(FeatureFlagEnvironmentRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketBy = defaults.bucketBy;
    	      this.clauses = defaults.clauses;
    	      this.rolloutWeights = defaults.rolloutWeights;
    	      this.variation = defaults.variation;
        }

        @CustomType.Setter
        public Builder bucketBy(@Nullable String bucketBy) {
            this.bucketBy = bucketBy;
            return this;
        }
        @CustomType.Setter
        public Builder clauses(@Nullable List<FeatureFlagEnvironmentRuleClause> clauses) {
            this.clauses = clauses;
            return this;
        }
        public Builder clauses(FeatureFlagEnvironmentRuleClause... clauses) {
            return clauses(List.of(clauses));
        }
        @CustomType.Setter
        public Builder rolloutWeights(@Nullable List<Integer> rolloutWeights) {
            this.rolloutWeights = rolloutWeights;
            return this;
        }
        public Builder rolloutWeights(Integer... rolloutWeights) {
            return rolloutWeights(List.of(rolloutWeights));
        }
        @CustomType.Setter
        public Builder variation(@Nullable Integer variation) {
            this.variation = variation;
            return this;
        }
        public FeatureFlagEnvironmentRule build() {
            final var o = new FeatureFlagEnvironmentRule();
            o.bucketBy = bucketBy;
            o.clauses = clauses;
            o.rolloutWeights = rolloutWeights;
            o.variation = variation;
            return o;
        }
    }
}
