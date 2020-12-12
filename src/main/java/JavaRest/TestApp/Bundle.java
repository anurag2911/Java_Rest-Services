package JavaRest.TestApp;

public class Bundle {

	  private String appItemId;
	  private String appType;
	  private String displayName;
	  private String zone;
	  private int flags;
	  private int version;
	  private String iconData;
	  private String appStatus;
	  private Boolean iconIsGrayed;
	  private String description;
	  private Boolean passesSystemRequirements;
	  private Boolean isBlocked;
	  private AppHelpContact[] contacts;
	  private Boolean isLeaf;
	  private Boolean shouldBeShownInZapp;
	  private String appStatusCode;
	  private Boolean isFavourite;
	  private String iconDataWithOverlay;
	public String getAppItemId() {
		return appItemId;
	}
	public void setAppItemId(String appItemId) {
		this.appItemId = appItemId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int flags) {
		this.flags = flags;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getIconData() {
		return iconData;
	}
	public void setIconData(String iconData) {
		this.iconData = iconData;
	}
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	public Boolean getIconIsGrayed() {
		return iconIsGrayed;
	}
	public void setIconIsGrayed(Boolean iconIsGrayed) {
		this.iconIsGrayed = iconIsGrayed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getPassesSystemRequirements() {
		return passesSystemRequirements;
	}
	public void setPassesSystemRequirements(Boolean passesSystemRequirements) {
		this.passesSystemRequirements = passesSystemRequirements;
	}
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public Boolean getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	public Boolean getShouldBeShownInZapp() {
		return shouldBeShownInZapp;
	}
	public void setShouldBeShownInZapp(Boolean shouldBeShownInZapp) {
		this.shouldBeShownInZapp = shouldBeShownInZapp;
	}
	public String getAppStatusCode() {
		return appStatusCode;
	}
	public void setAppStatusCode(String appStatusCode) {
		this.appStatusCode = appStatusCode;
	}
	public Boolean getIsFavourite() {
		return isFavourite;
	}
	public void setIsFavourite(Boolean isFavourite) {
		this.isFavourite = isFavourite;
	}
	public String getIconDataWithOverlay() {
		return iconDataWithOverlay;
	}
	public void setIconDataWithOverlay(String iconDataWithOverlay) {
		this.iconDataWithOverlay = iconDataWithOverlay;
	}
	public AppHelpContact[] getContacts() {
		return contacts;
	}
	public void setContacts(AppHelpContact[] contacts) {
		this.contacts = contacts;
	}
	
	
}
