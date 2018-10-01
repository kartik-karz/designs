public void animate(View view) {                                                   
    ImageView v = (ImageView) view;                                                
    Drawable d = v.getDrawable();                                                  
    if (d instanceof AnimatedVectorDrawable) {                                     
        AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;                   
        avd.start();                                                               
    } else if (d instanceof AnimatedVectorDrawableCompat) {                        
        AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;       
        avd.start();                                                               
    }                                                                              
}
