package com.company.secondmodulehomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostModel {
    @NotNull(message = "Post ID cannot be empty!")
    private String postId;
    @NotNull(message = "Client ID cannot be empty!")
    private String clientId;
    @NotNull(message = "Recipient ID cannot be empty!")
    private String postRecipientId;
    private String postItem;
    private String status;
}
