package com.karolmajta.stp.views;

import com.karolmajta.stp.exception.UnboundViewException;

import processing.core.PApplet;

/**
 * Implemented by all classes that can draw a model on given PApplet canvas.
 * 
 * @author Karol
 *
 * @param <Model> model for this IDrawable. Should be made protected and easily
 * 		accessed in implementing classes
 */
public interface IDrawable<Model> {
	/**
	 * Draw this view on given PApplet.
	 * @param p
	 * @throws UnboundViewException if {@link IDrawable#draw(PApplet)} was
	 * 		called before {@link IDrawable#bindModel(Object)}.
	 */
	public void draw(PApplet p) throws UnboundViewException;
	
	/**
	 * Binds given model to this {@link IDrawable}
	 * @param model
	 */
	public void bindModel(Model model);
	
	/**
	 * Set this {@link IDrawable} visible or not
	 * @param flag
	 */
	public void setVisible(boolean flag);
	
	/**
	 * Return information if this {@link IDrawable} is visible or not. 
	 * @return
	 */
	public boolean isVisible();
}
