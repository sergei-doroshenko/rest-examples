package org.sergei.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.sergei.model.Message;
import org.sergei.persistence.MessageRepository;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class MessageServiceTest {

    @InjectMocks
    private MessageService messageService;
    @Mock
    private MessageRepository messageRepository;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllMessages() {
        Message message = new Message();
        message.setId(3L);
        message.setPayload("Test message!");
        List<Message> messages = Collections.singletonList(message);
        Mockito.when(messageRepository.getAllMessages()).thenReturn(messages);

        List<Message> result = messageService.getAllMessages();

        assertNotNull(result);
        assertEquals(result, messages);
    }
}