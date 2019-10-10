package com.neo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author : 骏杰
 * @date : 2019/10/10
 */
@Document(collection = "geographicalRegion")  //spring.data为mongodb定义的注解，直接映射数据库的document名称
public class GisRegion {

    @Id  //指定字段的主键字段
    private int locationId;

    @Field("regionName")  //属性映射数据库document属性名称，若未指定，默认存储实体类属性名称
    private String regionName;
    private String regionCode;
    private String regionType;
    private GeoJsonPolygon geometry;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public GeoJsonPolygon getGeometry() {
        return geometry;
    }

    public void setGeometry(GeoJsonPolygon geometry) {
        this.geometry = geometry;
    }
}