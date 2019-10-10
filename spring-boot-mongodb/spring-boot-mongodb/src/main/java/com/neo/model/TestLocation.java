package com.neo.model;


import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author : 骏杰
 * @date : 2019/10/10
 */
@Document(collection="testLocation")
public class TestLocation {

    private String id;

    //必须强制命名为location,否则mongTemplate不识别,会报错,还有就是point的包别导错了.
    private Point location;

    public TestLocation(String id, Point location) {
        this.id = id;
        this.location = location;
    }

    public TestLocation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
