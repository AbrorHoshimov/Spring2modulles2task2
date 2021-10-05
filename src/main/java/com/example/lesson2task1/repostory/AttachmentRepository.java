package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Attachment;
import com.example.lesson2task1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
