package com.kyobo.project.gonggu.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Where(clause = "del_yn = 'N'") //select 쿼리에 같이 붙어서 나간다.
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String categoryCode;

    @Column(nullable = false)
    private String categoryName;

}
