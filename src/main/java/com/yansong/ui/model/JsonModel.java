package com.yansong.ui.model;

import android.support.annotation.NonNull;

import com.example.sunny.demo0921.net.INetHandler;

import java.util.HashMap;

/**
 * Created by sunny01 on 2017/9/25.
 */

public class JsonModel<T extends INetHandler> {

    private HashMap<String, T> container = new HashMap<>();

    /**
     *
     * @param key
     * @param netHandler
     */
    public void put(@NonNull String key, @NonNull T netHandler) {
        container.put(key, netHandler);
    }

    public HashMap<String, T> getNetDatas() {
        return container;
    }

    public void addModel(JsonModel model) {
        container.putAll(model.getNetDatas());
    }

    public T remove(@NonNull String key) {
        return container.remove(key);
    }

    public <E extends INetHandler> E getData(@NonNull String key) {
        return (E) container.get(key);
    }

}
