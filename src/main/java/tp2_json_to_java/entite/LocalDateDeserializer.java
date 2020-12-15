package tp2_json_to_java.entite;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {
	protected LocalDateDeserializer() {
		super(LocalDate.class);
	}

	@Override
	public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException {
		String dateAuFormatString = parser.readValueAs(String.class);
		return LocalDate.parse(dateAuFormatString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
