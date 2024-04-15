package com.patrick.springsecurity.repository;

import com.patrick.springsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
