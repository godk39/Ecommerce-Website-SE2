package com.ecommerce.library.service;

import com.ecommerce.library.dto.ProductDto;
import com.ecommerce.library.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    Product update(MultipartFile imageProduct ,ProductDto productDto);

    Product save(MultipartFile imageProduct, ProductDto productDto);

    Product getProductById(Long id);

    void deleteById(Long id);
    void enableById(Long id);

    ProductDto getById(Long id);

    Page<ProductDto> pageProducts(int pageNo);
    Page<ProductDto> searchProducts(int pageNo, String keyword);

    List<Product> getAllProducts();

    List<Product> listViewProducts();

    List<Product> getRelatedProducts(Long categoryId);

    List<Product> getProductsInCategory(Long categoryId);

    List<Product> filterHighPrice();

    List<Product> filterLowPrice();
}
