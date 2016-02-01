package prv.zielony.trafficmaster.integration.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;

/**
 * Created by zielony on 29.01.16.
 */
public abstract class ProxyRouteBuilder extends RouteBuilder {

    protected String buildTargetHttpEndpoint(String host, Integer port, boolean throwExceptionOnFailure) {

        StringBuilder builder = new StringBuilder();

        builder.append("http://");
        builder.append(host);
        builder.append(':');
        builder.append(port);
        builder.append("?bridgeEndpoint=true");
        builder.append("&amp;throwExceptionOnFailure=");
        builder.append(throwExceptionOnFailure);

        return builder.toString();
    }

    protected String getProxyEndpoint(String contextPath) {

        StringBuilder builder = new StringBuilder();
        builder.append("servlet://");
        builder.append(contextPath);
        builder.append("?matchOnUriPrefix=true");

        return builder.toString();
    }

    protected Collection<String> getTargetEndpoints(List<String> hosts,
                                                    List<Integer> ports,
                                                    boolean throwExceptionOnFailure) {

        if(hosts == null || hosts.isEmpty()) {
            throw new IllegalArgumentException("The hosts were not specified for a ProxyRouteBuilder");
        }

        if(ports == null || ports.isEmpty()) {
            throw new IllegalArgumentException("The ports were not specified for a ProxyRouteBuilder");
        }

        if(ports.size() != hosts.size()) {
            throw new IllegalArgumentException("The number of ports supplied to the ProxyRouteBuilder does not match " +
                    "the number of hosts");
        }

        Iterator<String> iHost = hosts.iterator();
        Iterator<Integer> iPort = ports.iterator();
        List<String> results = new LinkedList<String>();
        while(iHost.hasNext() && iPort.hasNext()) {
            results.add(buildTargetHttpEndpoint(iHost.next(), iPort.next(), throwExceptionOnFailure));
        }

        return results;
    }
}
