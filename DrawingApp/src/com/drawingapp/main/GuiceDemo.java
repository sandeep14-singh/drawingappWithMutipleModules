package com.drawingapp.main;

import java.util.ArrayList;
import java.util.List;

import com.drawingapp.module.AppModule1;
import com.drawingapp.module.AppModule2;
import com.drawingapp.requests.CircleRequest;
import com.drawingapp.requests.SquareRequest;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQAURE_REQ = "SQUARE";
	private static final String CIRCLE_REQ = "CIRCLE";
	
	private static void sendRequest(String inputRequest) {
		

		Injector injector = Guice.createInjector(new AppModule1());
		
		if(inputRequest.equals(SQAURE_REQ)){
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
		}
		
		if(inputRequest.equals(CIRCLE_REQ)){						
			CircleRequest request = injector.getInstance(CircleRequest.class);
			request.makeRequest();
		}		
		
	}
	
	public static void main(String[] args) {		
		//sendRequest(SQAURE_REQ);		
		sendRequest(CIRCLE_REQ);
	}
}
