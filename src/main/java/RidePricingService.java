public class RidePricingService {
    public static final double MOTORBIKE_BASE_FARE   = 13_000;
    public static final double MOTORBIKE_PER_KM      = 4_000;
    public static final double CAR_BASE_FARE         = 28_000;
    public static final double CAR_PER_KM            = 9_000;
    public static final double BASE_DISTANCE         = 2.0;
    public static final double SURGE_MULTIPLIER      = 2.0;

    public static final double MIN_DISTANCE          = 0.0;
    public static final double MAX_DISTANCE          = 1000.0;

    public static double calculatePrice(float vehicleType,float distance, boolean peakHour) {

        // --- Kiểm tra hợp lệ ---
        if (vehicleType < 1 || vehicleType > 2) {
            return -1;
        }
        if (distance < MIN_DISTANCE || distance > MAX_DISTANCE) {
            return -1;
        }

        // --- Tính giá cơ bản ---
        double baseFare;
        double perKmFare;

        if (vehicleType < 2 && vehicleType >= 1) {
            baseFare  = MOTORBIKE_BASE_FARE;
            perKmFare = MOTORBIKE_PER_KM;
        } else {
            baseFare  = CAR_BASE_FARE;
            perKmFare = CAR_PER_KM;
        }

        double price = baseFare;
        if (distance > BASE_DISTANCE) {
            price += (distance - BASE_DISTANCE) * perKmFare;
        }

        if (peakHour) {
            price *= SURGE_MULTIPLIER;
        }

        return price;
    }
}
