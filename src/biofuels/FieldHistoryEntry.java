package biofuels;

public class FieldHistoryEntry {
	public final Crop crop;
	public final float SOM;
	public final float lastYield;
	private final boolean fertilizer;
	private final boolean pesticide;
	private final boolean till;
	
	public FieldHistoryEntry(Crop crop, float SOM, int lastYield, boolean fertilizer, boolean pesticide, boolean till){
		this.crop = crop;
		this.SOM = SOM;
		this.lastYield = lastYield;
		this.fertilizer = fertilizer;
		this.pesticide = pesticide;
		this.till = till;
	}
}
