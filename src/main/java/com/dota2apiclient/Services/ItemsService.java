package com.dota2apiclient.Services;

import com.dota2apiclient.ApiClient.ApiClient;
import com.dota2apiclient.ApiClient.Models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {
    @Autowired
    ApiClient apiClient;

    @Cacheable
    public List<Item> getAll() {
        return apiClient.GetItems().getItems();
    }

    public Item get(long id) {
        return getAll().stream()
                .filter((item) -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
