package com.example.lesson07_mini_project.config;

import org.jspecify.annotations.NonNull;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Condition that checks if the discount feature is enabled
 * in the application properties.
 */
public class DiscountCondition implements Condition {

    /**
     * Determines if the discount feature should be activated.
     * @param context the condition context providing environment info
     * @param metadata metadata of the annotated element
     * @return true if discount feature is enabled, false otherwise
     */
    @Override
    public boolean matches(@NonNull ConditionContext context,
                           @NonNull AnnotatedTypeMetadata metadata) {

        String value = context.getEnvironment()
                .getProperty("feature.discount.enabled");
        return "true".equals(value);
    }
}
