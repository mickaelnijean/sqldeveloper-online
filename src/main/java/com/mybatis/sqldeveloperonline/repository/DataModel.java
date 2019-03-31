package com.mybatis.sqldeveloperonline.repository;

import java.util.List;
import java.util.Map;

public class DataModel {

    List<Map<String,String>> jsonToSend;

    public List<Map<String, String>> getJsonToSend() {
        return jsonToSend;
    }

    public void setJsonToSend(List<Map<String, String>> jsonToSend) {
        this.jsonToSend = jsonToSend;
    }
}
