public class Value {

    public static Value VOID = new Value(new Object(), "void");

    final Object value;
    public final String datatype;

    public Value(Object value, String datatype){
        this.value = value;
        this.datatype = datatype;
    }

    public Boolean asBoolean(){
        return (Boolean) value;
    }

    public Double asDouble(){
        return (Double) value;
    }

    public String asString(){
        return (String) value;
    }

    public int asInt() { return (int) value; }

    public float asFloat() { return (float)value; }

    public int[] asIntArray(){
        return (int[])value;
    }

    public float[] asFloatArray(){
        return (float[])value;
    }

    public boolean isDouble(){
        return value instanceof Double;
    }

    @Override
    public int hashCode() {
        if(value==null){
            return 0;
        }
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(value==obj){
            return true;
        }
        if(value == null){
            return false;
        }
        if(obj == null){
            return false;
        }
        if(value.getClass() != obj.getClass()){
            return false;
        }

        Value that = (Value)obj;
        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return  String.valueOf(value);
    }
}
