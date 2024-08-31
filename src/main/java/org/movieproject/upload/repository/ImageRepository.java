
package org.movieproject.upload.repository;

import org.movieproject.upload.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    Image findByMember_memberNo(Integer memberNo);
}
