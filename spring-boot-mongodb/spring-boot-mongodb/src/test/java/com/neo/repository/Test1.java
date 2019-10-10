package com.neo.repository;

import com.neo.model.TestLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : 骏杰
 * @date : 2019/10/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    @Autowired
    private TestRepository testRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void test(){
        Point point = new Point(118.92046, 34.71561);
        Point point1 = new Point(118.920551,34.715557);
        TestLocation t1 = new TestLocation(null,point);
        TestLocation t2 = new TestLocation(null,point1);
        mongoTemplate.insert(t1);
        mongoTemplate.insert(t2);
    }

    @Test
    public void test1(){
        Point point = new Point(118.920508, 34.715587);

        //设置距离
        Distance distance = new Distance(0.006, Metrics.KILOMETERS);
        List<TestLocation> personList = testRepository.findByLocationNear(point, distance);
        System.out.println("------------>>>"+personList.size());
    }



}
