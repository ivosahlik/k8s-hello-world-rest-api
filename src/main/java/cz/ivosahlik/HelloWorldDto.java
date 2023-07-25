package cz.ivosahlik;

import lombok.*;

@Data
public class HelloWorldDto {

	private String message;

	public HelloWorldDto(String message) {
		this.message = message;
	}

}
