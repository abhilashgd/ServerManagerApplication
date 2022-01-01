package io.gateways.server.repo;

import io.gateways.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/1/22
 */
public interface ServerRepo
        extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
