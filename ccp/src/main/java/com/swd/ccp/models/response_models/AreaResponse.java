package com.swd.ccp.models.response_models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AreaResponse {
    private Integer id;

    private String name;

    private List<CatResponse> catList;

    private List<SeatResponse> seatList;

}
