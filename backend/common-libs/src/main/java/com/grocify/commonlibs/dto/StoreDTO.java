package com.grocify.commonlibs.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class StoreDTO {
	/* DTO for request used because while registering we only send user info
	 * but while storing in entity we adding created and updated time to take only
	 * user personal info we used DTO for request*/

    private Long id;

    private String name;


    private String address;

    private String gstNo;

    private String description;

    private boolean status;

    private LocalDate create_at;


    private LocalDate update_at;

    private Long userId;

}
