package com.moducode.tutorial_sounds.data;

/**
 * Created by Jay on 2018-02-12.
 */

public class Sound {

    private String pathName;
    private String fileName;
    private Integer id;

    public Sound(String pathName){
        this.pathName = pathName;
        String[] splitPath = pathName.split("/");
        this.fileName = splitPath[splitPath.length - 1];
    }

    public String getPathName() {
        return pathName;
    }

    public String getFileName() {
        return fileName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
