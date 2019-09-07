package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;


public class AppModule2 extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
	}
	
}
