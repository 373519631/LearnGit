package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


@Data
public class User {
   @Value("${fool}")
   private int  id ;
   private String name;
}
