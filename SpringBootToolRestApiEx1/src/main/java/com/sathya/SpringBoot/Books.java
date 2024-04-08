package com.sathya.SpringBoot;

import javax.swing.Spring;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	
	
	private int isbn;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;

}
