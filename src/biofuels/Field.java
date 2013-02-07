package biofuels;

import java.util.Map;

public class Field {
	private Crop planted;
	private float SOM;
	private Map<Integer, FieldHistoryEntry> history;
	private boolean fertilizer;
	private boolean pesticide;
	private boolean till;
}
