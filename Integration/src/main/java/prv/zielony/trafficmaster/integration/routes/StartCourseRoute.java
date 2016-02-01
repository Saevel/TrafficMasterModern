package prv.zielony.trafficmaster.integration.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.LoadBalanceDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * Created by zielony on 29.01.16.
 */
@Component
public class StartCourseRoute extends ProxyRouteBuilder {

    @Value("${course.tracker.server.host}")
    protected List<String> hosts;

    @Value("${course.tracker.server.port}")
    protected List<Integer> ports;

    @Value("${course.tracker}")
    protected String contextPath;

    @Value("${throw.exception.on.failure}")
    protected boolean throwExceptionOnFailure;

    @Override
    public void configure() throws Exception {

        LoadBalanceDefinition routeDefinition = from(this.getProxyEndpoint(contextPath))
                .loadBalance()
                .failover();

        Collection<String> endpoints = this.getTargetEndpoints(hosts, ports, throwExceptionOnFailure);

        for(String endpoint : endpoints) {
            routeDefinition.to(endpoint);
        }
    }
}
