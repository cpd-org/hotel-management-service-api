package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBranchDto {
    private String branchId;
    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;
}
