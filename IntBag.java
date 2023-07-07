package Lab01;

public class IntBag {
    private int[] bag;

    public IntBag(){
        bag = new int[5];
        bag[0] = -1;
    }

    public void add(int val){
        if(val >= 0){
            doubleSize();
            bag[getSize() + 1] = -1;
            bag[getSize()] = val;
        }
    }

    public void addIndex(int val, int index){
        if(val >= 0){
            doubleSize();
            if(index == getSize()){
                add(val);
            }
            else if(index < getSize()){
                for(int i = getSize(); i >= index; i--){
                    bag[i+1] = bag[i];
                }
                bag[index] = val;
            }
        }
    }

    public void removeIndex(int index){
        bag[index] = bag[getSize() - 1];
    }

    public boolean contains(int val){
        for(int i: bag){
            if(i == val){
                return true;
            }
        }
        return false;
    }

    public int getSize(){
        int count = 0;
        for(int i: bag){
            if(i == -1)
                return count;
            else
                count++;
        }
        return count;
    }

    public int getIndex(int index){
        return bag[index];
    }

    public void removeAll(int val){
        for(int i = getSize() - 1; i >= 0; i--){
            if(bag[i] == val){
                for (int j = i; j < getSize(); j++){
                    bag[j] = bag[j + 1];
                }
            }
        }
    }

    private void doubleSize(){
        if(getSize() >= bag.length - 1){
            int[] temp = bag;
            bag = new int[temp.length * 2];
            for(int i = 0; i < temp.length; i++){
                bag[i] = temp[i];
            }
        }
    }

    public String toString(){
        String output = "[";
        if(bag[0] != -1)
            output += bag[0];
        for(int i = 1; i < getSize(); i++){
            output += ", ";
            output += bag[i];
        }
        output += "]";
        return output;
    }
}
