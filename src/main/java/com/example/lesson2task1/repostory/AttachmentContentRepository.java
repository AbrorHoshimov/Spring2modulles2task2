package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Attachment;
import com.example.lesson2task1.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
