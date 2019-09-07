package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;


public class AppModule1 extends AbstractModule{
	
	@Override
	protected void configure() {
		install(new AppModule2());
		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
	
	}
	
}
