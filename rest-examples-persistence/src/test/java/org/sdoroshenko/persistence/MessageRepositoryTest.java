package org.sdoroshenko.persistence;

import org.sdoroshenko.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"classpath:persistenceContext.xml"})
public class MessageRepositoryTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void getAllMessages() {
        List<Message> messages = messageRepository.getAllMessages();
        assertEquals(messages.size(), 1);
    }
}