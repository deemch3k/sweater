package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Dima P.
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
}
