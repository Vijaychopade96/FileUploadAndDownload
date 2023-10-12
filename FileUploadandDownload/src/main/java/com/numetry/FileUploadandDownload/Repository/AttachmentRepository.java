package com.numetry.FileUploadandDownload.Repository;


import com.numetry.FileUploadandDownload.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,String> {
}
