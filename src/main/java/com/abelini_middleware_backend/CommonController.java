package com.abelini_middleware_backend;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CommonController {
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
    private final CommonService commonService;

    public CommonController(CommonService commonService) {
        this.commonService = commonService;
    }

    @PostMapping("/api/v1/migrate/product/shopify")
    public ResponseEntity<?> migrateProductShopify(@RequestParam String productId,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response) {
        return commonService.migrateProductShopify(productId, request, response);
    }
}
