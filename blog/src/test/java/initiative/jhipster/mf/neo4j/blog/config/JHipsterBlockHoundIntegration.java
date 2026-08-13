package initiative.jhipster.mf.neo4j.blog.config;

import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

public class JHipsterBlockHoundIntegration implements BlockHoundIntegration {

    @Override
    public void applyTo(BlockHound.Builder builder) {
        builder.allowBlockingCallsInside("java.util.UUID", "randomUUID");
        builder.allowBlockingCallsInside("org.springframework.validation.beanvalidation.SpringValidatorAdapter", "validate");
        builder.allowBlockingCallsInside("initiative.jhipster.mf.neo4j.blog.service.MailService", "sendEmailFromTemplate");
        builder.allowBlockingCallsInside("initiative.jhipster.mf.neo4j.blog.security.DomainUserDetailsService", "createSpringSecurityUser");
        builder.allowBlockingCallsInside("org.springframework.data.neo4j.core.PropertyFilterSupport", "getInputProperties");
        builder.allowBlockingCallsInside("org.springframework.web.reactive.result.method.InvocableHandlerMethod", "invoke");
        builder.allowBlockingCallsInside("org.springdoc.core.service.OpenAPIService", "build");
        builder.allowBlockingCallsInside("org.springdoc.core.service.OpenAPIService", "getWebhooksClasses");
        builder.allowBlockingCallsInside("org.springdoc.core.service.AbstractRequestService", "build");
        builder.allowBlockingCallsInside("org.neo4j.driver.internal.util.Futures", "blockingGet");
        // jhipster-needle-blockhound-integration - JHipster will add additional gradle plugins here
    }
}
