import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * An explosion. It starts by expanding and then collapsing. 
 * The explosion will explode other obejcts that the explosion intersects.
 * 
 * @author Poul Henriksen
 * @version 1.0.1
 */
public class Explosion extends Actor
{
    //TODO (17): Declare a static instance constant called IMAGE_COUNT that is initialized to 12
    /** How many images should be used in the animation of the explostion */
    
    
    //TODO (18): Declare a static instance GreenfootImage array called images
    /** 
     * The images in the explosion. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    
    
    //TODO (19): Declare an instance variable called imageNum initialized to 0
    /** Current size of the explosion */
    
    
    //TODO (20): Declare an instance variable called increment initialized to 1
    /** How much do we increment the index in the explosion animation. */
    
    
    //TODO (21): Declare an instance variable called actCycles initialized to 0
    
    
    
    /**
     * TODO (31): Declare a default constructor for Explosion
     * 
     * TODO (32): Make a call to the initializeImages method
     * 
     * TODO (33): Set the image of Explosion to the first element
     *            of the images array
     */
    
    
    /**
     * TODO (34): Declare the act method for Explosion
     * 
     * TODO (35): If the actCycles variable is equal to 0...
     * 
     *     TODO (36): Play the MetalExplosion sound
     *     
     * TODO (37): Increment actCycles by 1
     * 
     * TODO (38): Set the image of the Explosion to the image
     *            that is stored at the imageNum index of the 
     *            images array
     *            
     * TODO (39): Increase imageNum by increment
     * 
     * TODO (40): If imageNum is greater than or equal to IMAGE_COUNT
     * 
     *     TODO (41): Set increment to negative increment
     *     
     *     TODO (42): Set imageNum to imageNum plus increment
     *     
     * TODO (43): If imageNum is less than zero...
     * 
     *     TODO (44): Remove this object from the world
     *     
     *     TODO (45): Set actCycles to zero
     */
    
    
    /**
     * TODO (22): Declare a private synchronized static method called initializeImages
     *            that does not return anything and has no parameters
     * 
     * TODO (23): Declare a local variable called baseImage initialized to a
     *            new GreenfootImage using the explosion-big.png filename
     * 
     * TODO (24): Declare a local variable called size
     * 
     * TODO (25): If the images array is equal to nothing...
     *                
     *     TODO (26): Set the images array to a new GreenfootImage array that 
     *                has a size of IMAGE_COUNT
     *                
     *     TODO (27): Create a loop that will allow you to go through every element of the array
     *     
     *         TODO (28): Set size to be (i+1) * ( the width of the baseImage divided by IMAGE_COUNT )
     *         
     *         TODO (29): Set the current index of the images array to a new GreenfootImage 
     *                    using the baseImage variable
     *         
     *         TODO (30): Scale the current index of the images array to be an image with a 
     *                    width and height of size
     */
    
}