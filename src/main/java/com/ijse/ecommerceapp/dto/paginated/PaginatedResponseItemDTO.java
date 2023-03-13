package com.ijse.ecommerceapp.dto.paginated;

import com.ijse.ecommerceapp.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaginatedResponseItemDTO {
    private java.util.List<ProductDTO> List;
}
