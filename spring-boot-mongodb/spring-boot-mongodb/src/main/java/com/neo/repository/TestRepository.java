package com.neo.repository;


import com.neo.model.TestLocation;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : 骏杰
 * @date : 2019/10/10
 */
@Component
public interface TestRepository extends MongoRepository<TestLocation,String> {
    List<TestLocation> findByLocationNear(Point location, Distance distance);
}
