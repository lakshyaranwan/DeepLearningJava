public static double sigmoid (double z){
	    return 1/(1+Math.pow((Math.E),(-1*z)));
}
	
public static double sigmoid_p(double x){
	    return sigmoid(x)  * (1-sigmoid(x));
}

public static double prediction(double w1, double w2,double bias, int[]point){
            double z = w1*point[0]+w2*point[1]+bias;
	    return sigmoid(z);
}

public static double prediction2(int i1,int i2, double w1, double w2,double bias){
            double z = w1*i1+w2*i2+bias;
	    return sigmoid(z);
}
