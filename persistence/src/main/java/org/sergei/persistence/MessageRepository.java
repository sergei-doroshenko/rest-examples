package org.sergei.persistence;

import org.sergei.model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * A repository that stores {@link Message}.
 */
@Repository
public interface MessageRepository {

    List<Message> getAllMessages();
}
