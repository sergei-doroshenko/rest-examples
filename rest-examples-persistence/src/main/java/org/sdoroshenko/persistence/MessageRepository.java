package org.sdoroshenko.persistence;

import org.sdoroshenko.model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * A repository that stores {@link Message}.
 */
@Repository
public interface MessageRepository {

    List<Message> getAllMessages();
}
