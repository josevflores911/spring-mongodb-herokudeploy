package com.mongo.springMongoDB.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class TodoDTO {

    @Id
    private String id;

    @NotNull(message="Todo cannot be null")
    private String todo;

    @NotNull(message="Description cannot be null")
    private String description;

    @NotNull(message="Completed cannot be null")
    private Boolean completed;

    private Date createdAt;

    private Date updatedAt;


}
