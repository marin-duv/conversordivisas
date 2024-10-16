import java.util.Map;

public record Moneda     (String result,
                          String documentation,
                          String terms_of_use,
                          float time_last_update_unix,
                          String time_last_update_utc,
                          float time_next_update_unix,
                          String time_next_update_utc,
                          String base_code,
                          Map<String, Float> conversion_rates
){}