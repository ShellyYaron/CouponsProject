package com.shelly.coupons.dto;

import lombok.Data;

import java.util.List;

@Data
public class APIResponse<T> {
    private int recordCount;
    private List<T> response;

    public APIResponse(int recordCount, List<T> response) {
        this.recordCount = recordCount;
        this.response = response;
    }

    public APIResponse() {
    }
}
