package com.xuanhoang.microservices.uploadimageservice.dto;

import com.xuanhoang.microservices.uploadimageservice.model.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageEvent {

    private String message;
    private String status;
    private Image image;
}
