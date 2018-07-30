double w1 = Double.parseDouble(w1txt.getText());
double w2 = Double.parseDouble(w2txt.getText());
double b = Double.parseDouble(btxt.getText());
int i1 = Integer.parseInt(xtxt.getText());
int i2 = Integer.parseInt(ytxt.getText());
double z = prediction2(i1,i2,w1,w2,b);
if(z>0.5){
    JOptionPane.showMessageDialog(null,"UP");
    System.out.println("UP");
}
else {
    JOptionPane.showMessageDialog(null,"DOWN");
    System.out.println("DOWN");
}
