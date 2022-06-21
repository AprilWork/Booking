package booking.data;

public interface Reservable {

	boolean isFreePlaceNow();

	default boolean checkin() {
		if (isFreePlaceNow() == true)
			return true;
		return false;
	};

	boolean checkout();

}
