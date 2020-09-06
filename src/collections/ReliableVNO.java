package collections;

public class ReliableVNO {

	private int release;
	private int patch;
	private int revision;
	private boolean bool;
	private long lv;
	private float fv;
	private double dv;
	
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	public int getPatch() {
		return patch;
	}
	public void setPatch(int patch) {
		this.patch = patch;
	}
	public int getRevision() {
		return revision;
	}
	public void setRevision(int revision) {
		this.revision = revision;
	}
	
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public long getLv() {
		return lv;
	}
	public void setLv(long lv) {
		this.lv = lv;
	}
	public float getFv() {
		return fv;
	}
	public void setFv(float fv) {
		this.fv = fv;
	}
	public double getDv() {
		return dv;
	}
	public void setDv(double dv) {
		this.dv = dv;
	}
	@Override
	public int hashCode(){
		int hasvalue=11;
		int boolval=bool? 0 :1;
		int longval=(int) (lv^(lv>>>32));
		int floatval= Float.floatToIntBits(fv);
		long num = Double.doubleToLongBits(dv);
		int doubleval=(int)(num^(num>>>32));
		hasvalue=31*hasvalue+release;
		hasvalue=31*hasvalue+patch;
		hasvalue=31*hasvalue+revision;
		hasvalue=31*hasvalue+boolval;
		hasvalue=31*hasvalue+longval;
		hasvalue=31*hasvalue+floatval;
		hasvalue=31*hasvalue+doubleval;
		return hasvalue;
	}

}
