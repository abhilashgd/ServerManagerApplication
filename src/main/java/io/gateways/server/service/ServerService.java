package io.gateways.server.service;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/1/22
 */

import io.gateways.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
