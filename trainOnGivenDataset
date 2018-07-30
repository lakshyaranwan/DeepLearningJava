int ttime = Integer.parseInt(ttimetxt.getText());
	    Random rand = new Random();
	    // dataset
		int[] ds1 = {1,1,0};
		int[] ds2 = {2,1,0};
		int[] ds3 = {3,1,0};
		int[] ds4 = {4,1,0};
		int[] ds5 = {5,2,0};
		int[] ds6 = {6,2,0};
		int[] ds7 = {4,2,0};
		
		int[] ds8 = {1,2,1};
		int[] ds9 = {2,2,1};
		int[] ds10 = {1,3,1};
		int[] ds11 = {2,3,1};
		int[] ds12 = {1,4,1};
		int[] ds13 = {2,4,1};
		int[] ds14 = {2,6,1};
		
		int[][] dataset = {ds1,ds2,ds3,ds4,ds5,ds6,ds7,ds8,ds9,ds10,ds11,ds12,ds13,ds14};
		// dataset done
		
		//weights and bias initialize
		double w1 = Math.random();
		double w2 = Math.random();
		double b = Math.random();
               
		
		double learningrate = 0.1;
                
                double total_cost = 0;
		
	    //training
	    for(int iter = 0; iter<ttime;iter++){
	        int ri = rand.nextInt(14);
                int[] point = dataset[ri];
	 
	        double pred = prediction(w1,w2,b,dataset[ri]);
	        int target = point[2]; 
	        double cost = Math.pow((pred - target),2);
                
	        double z = w1*point[0]+w2*point[1]+b;
	        double dcost_dpred = 2*(pred-target);
	        double dpred_dz = sigmoid_p(z);
	        
	        double dz_dw1 = point[0];
	        double dz_dw2 = point[1];
	        double dz_db = 1;
	        
	        double dcost_dz  = dcost_dpred * dpred_dz; 
	        
	        double dcost_dw1 = dcost_dz*dz_dw1;
	        double dcost_dw2 = dcost_dz*dz_dw2;
	        double dcost_db = dcost_dz*dz_db;
	        
	        w1 = w1 - (learningrate*dcost_dw1); 
	        w2 = w2 - (learningrate*dcost_dw2); 
	        b = b - (learningrate*dcost_db); 
	        System.out.println(""+Arrays.toString(point));
	        System.out.println(""+cost);
                if(iter%100 ==0){
                   total_cost = cost + total_cost; 
                }
                
	       
	    }
            double avg_cost = total_cost/((ttime-1)/100);
            
            System.out.println("Training done "+ttime+" times !");
            System.out.println("avg error = " + avg_cost );
            System.out.println("w1 = " + w1 );
            System.out.println("w2 = " + w2 );
            System.out.println("b = " + b );
            w1txt.setText(""+w1);
	    w2txt.setText(""+w2);
	    btxt.setText(""+b);
