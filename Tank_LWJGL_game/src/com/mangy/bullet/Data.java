
package com.mangy.bullet;


public class Data {

		
		
 	int[]   BULLET_IBO = new int[]{
 			0 , 1 , 2 , 3,
 			4 , 5 , 6 , 7,
 			8 , 9 , 10, 11,
 			12, 13, 14, 15,
 			16 ,17, 18, 19,
 			20 ,21, 22, 23
 	};
    float[] BULLET_VBO = new float[]{
//__BOTOM_______________________________________________//    		
    		-0.1f , -0.1f , 0.0f,   0.0f , 0.0f,
    		 0.1f , -0.1f , 0.0f,   1.0f , 0.0f,
    		 0.1f ,  0.1f , 0.0f,   1.0f , 1.0f,
    		-0.1f ,  0.1f , 0.0f,   0.0f , 1.0f,
//______________________________________________________//
    		
    		
//__TOP________________________________________________//    		
    		-0.1f , -0.1f , 0.2f,   0.0f , 0.0f,
   		     0.1f , -0.1f , 0.2f,   1.0f , 0.0f,
   		     0.1f ,  0.1f , 0.2f,   1.0f , 1.0f,
   		    -0.1f ,  0.1f , 0.2f,   0.0f , 1.0f,    		
//______________________________________________________//
   		    
//__LATERALS_____________________________________________//
   		    -0.1f , -0.1f , 0.0f,   0.0f , 0.0f,
   		     0.1f , -0.1f , 0.0f,   1.0f , 0.0f,
   		     0.1f , -0.1f , 0.2f,   1.0f , 1.0f,
   		    -0.1f , -0.1f , 0.2f,   0.0f , 1.0f,
   		    
   		     0.1f , -0.1f , 0.0f,   0.0f , 0.0f,
   		     0.1f ,  0.1f , 0.0f,   1.0f , 0.0f,
   		     0.1f ,  0.1f , 0.2f,   1.0f , 1.0f,
   		     0.1f , -0.1f , 0.2f,   0.0f , 1.0f, 
   		     
   		     0.1f ,  0.1f , 0.0f,   0.0f , 0.0f,
   		    -0.1f ,  0.1f , 0.0f,   1.0f , 0.0f,
   		    -0.1f ,  0.1f , 0.2f,   1.0f , 1.0f,
   		     0.1f ,  0.1f , 0.2f,   0.0f , 1.0f,
   		     
   		    -0.1f ,  0.1f , 0.0f,   0.0f , 0.0f,
   		    -0.1f , -0.1f , 0.0f,   1.0f , 0.0f,
   		    -0.1f , -0.1f , 0.2f,   1.0f , 1.0f,
   		    -0.1f ,  0.1f , 0.2f,   0.0f , 1.0f 
//_______________________________________________________//   		    
    		
    		
    };
	public int[] getBULLET_IBO() {
		return BULLET_IBO;
	}
	public void setBULLET_IBO(int[] bULLET_IBO) {
		BULLET_IBO = bULLET_IBO;
	}
	public float[] getBULLET_VBO() {
		return BULLET_VBO;
	}
	public void setBULLET_VBO(float[] bULLET_VBO) {
		BULLET_VBO = bULLET_VBO;
	}
    
}
