package com.cpd.hotel_system.hotel_management_service_api.entity;

import java.util.List;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @Column(name="branch_id", length = 80)
    private String branchId;

    @Column(name="room_count")
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name="branch_type", nullable = false)
    private BranchType branchType;

    @Column(name="branch_name", nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToOne(mappedBy = "branch")
    private Address address;

    @OneToMany(mappedBy = "branch")
    private List<Room> rooms;
}
