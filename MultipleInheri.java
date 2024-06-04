     interface Mishra{  
        void print();  
        }  
     interface Himanshu{  
        void fun();  
        }  
          
        class MultipleInheri implements Mishra, Himanshu{  
        public void fun(){
            System.out.println("This is multiple inheritance Example");}  
        public static void main(String args[]){  
            MultipleInheri obj = new MultipleInheri();  
            obj.fun();  
         }  
        } 

