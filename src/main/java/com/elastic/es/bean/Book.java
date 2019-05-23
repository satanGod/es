package com.elastic.es.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "ds",type = "book")
public class Book {

    private Integer id;

    private String bookName;

    private String author;

}
