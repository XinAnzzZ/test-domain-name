package com.yuhangma.repository;

import com.yuhangma.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author XinAnzzZ
 * @date 2019/1/7 18:32
 */
public interface TestRepository extends JpaRepository<Test, Integer> {
}
