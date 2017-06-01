package code.sma.core;

/**
 * data element, the smallest unit of the feature-based data
 * 
 * @author Chao.Chen
 * @version $Id: DataElem.java, v 0.1 2017年6月1日 上午10:35:45 Chao.Chen Exp $
 */
public class DataElem {
    /** result label, rate or {0,1} for classification*/
    protected float   label;
    /** number of nonzero global feature*/
    protected short   num_global;
    /** number of nonzero user feature*/
    protected short   num_ufactor;
    /** number of nonzero item feature*/
    protected short   num_ifacotr;

    /** array of global feature index*/
    protected int[]   index_global;
    /** array of user feature index*/
    protected short[] index_user;
    /** array of item feature index*/
    protected short[] index_item;

    /** array of global feature value */
    protected float[] value_global;
    /** array of global feature value */
    protected float[] value_ufactor;
    /** array of global feature value */
    protected float[] value_ifactor;

    public DataElem(float label) {
        super();
        this.label = label;
    }

    public DataElem(float label, short num_global, short num_ufactor, short num_ifacotr,
                    int[] index_global, short[] index_user, short[] index_item,
                    float[] value_global, float[] value_ufactor, float[] value_ifactor) {
        super();
        this.label = label;
        this.num_global = num_global;
        this.num_ufactor = num_ufactor;
        this.num_ifacotr = num_ifacotr;
        this.index_global = index_global;
        this.index_user = index_user;
        this.index_item = index_item;
        this.value_global = value_global;
        this.value_ufactor = value_ufactor;
        this.value_ifactor = value_ifactor;
    }

    /**
     * Getter method for property <tt>label</tt>.
     * 
     * @return property value of label
     */
    public float getLabel() {
        return label;
    }

    /**
     * Setter method for property <tt>label</tt>.
     * 
     * @param label value to be assigned to property label
     */
    public void setLabel(float label) {
        this.label = label;
    }

    /**
     * Getter method for property <tt>num_global</tt>.
     * 
     * @return property value of num_global
     */
    public short getNum_global() {
        return num_global;
    }

    /**
     * Setter method for property <tt>num_global</tt>.
     * 
     * @param num_global value to be assigned to property num_global
     */
    public void setNum_global(short num_global) {
        this.num_global = num_global;
    }

    /**
     * Getter method for property <tt>num_ufactor</tt>.
     * 
     * @return property value of num_ufactor
     */
    public short getNum_ufactor() {
        return num_ufactor;
    }

    /**
     * Setter method for property <tt>num_ufactor</tt>.
     * 
     * @param num_ufactor value to be assigned to property num_ufactor
     */
    public void setNum_ufactor(short num_ufactor) {
        this.num_ufactor = num_ufactor;
    }

    /**
     * Getter method for property <tt>num_ifacotr</tt>.
     * 
     * @return property value of num_ifacotr
     */
    public short getNum_ifacotr() {
        return num_ifacotr;
    }

    /**
     * Setter method for property <tt>num_ifacotr</tt>.
     * 
     * @param num_ifacotr value to be assigned to property num_ifacotr
     */
    public void setNum_ifacotr(short num_ifacotr) {
        this.num_ifacotr = num_ifacotr;
    }

    /**
     * Getter method for property <tt>value_global</tt>.
     * 
     * @return property value of value_global
     */
    public float[] getValue_global() {
        return value_global;
    }

    /**
     * Setter method for property <tt>value_global</tt>.
     * 
     * @param value_global value to be assigned to property value_global
     */
    public void setValue_global(float[] value_global) {
        this.value_global = value_global;
    }

    /**
     * Getter method for property <tt>value_ufactor</tt>.
     * 
     * @return property value of value_ufactor
     */
    public float[] getValue_ufactor() {
        return value_ufactor;
    }

    /**
     * Setter method for property <tt>value_ufactor</tt>.
     * 
     * @param value_ufactor value to be assigned to property value_ufactor
     */
    public void setValue_ufactor(float[] value_ufactor) {
        this.value_ufactor = value_ufactor;
    }

    /**
     * Getter method for property <tt>value_ifactor</tt>.
     * 
     * @return property value of value_ifactor
     */
    public float[] getValue_ifactor() {
        return value_ifactor;
    }

    /**
     * Setter method for property <tt>value_ifactor</tt>.
     * 
     * @param value_ifactor value to be assigned to property value_ifactor
     */
    public void setValue_ifactor(float[] value_ifactor) {
        this.value_ifactor = value_ifactor;
    }

    /**
     * Getter method for property <tt>index_global</tt>.
     * 
     * @return property value of index_global
     */
    public int[] getIndex_global() {
        return index_global;
    }

    /**
     * Setter method for property <tt>index_global</tt>.
     * 
     * @param index_global value to be assigned to property index_global
     */
    public void setIndex_global(int[] index_global) {
        this.index_global = index_global;
    }

    /**
     * Getter method for property <tt>index_user</tt>.
     * 
     * @return property value of index_user
     */
    public short[] getIndex_user() {
        return index_user;
    }

    /**
     * Setter method for property <tt>index_user</tt>.
     * 
     * @param index_user value to be assigned to property index_user
     */
    public void setIndex_user(short[] index_user) {
        this.index_user = index_user;
    }

    /**
     * Getter method for property <tt>index_item</tt>.
     * 
     * @return property value of index_item
     */
    public short[] getIndex_item() {
        return index_item;
    }

    /**
     * Setter method for property <tt>index_item</tt>.
     * 
     * @param index_item value to be assigned to property index_item
     */
    public void setIndex_item(short[] index_item) {
        this.index_item = index_item;
    }

}