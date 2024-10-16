public class ListaMonedas {

    public int ordenListaMonedas() {
        String[] currencies = {
                "USD – Dólar estadounidense", "AED – Dirham de los Emiratos Árabes Unidos", "AFN – Afgani afgano",
                "ALL – Lek albanés", "AMD – Dram armenio", "ANG – Florín antillano neerlandés",
                "AOA – Kwanza angoleño", "ARS – Peso argentino", "AUD – Dólar australiano",
                "AWG – Florín arubeño", "AZN – Manat azerbaiyano", "BAM – Marco convertible bosnio",
                "BBD – Dólar de Barbados", "BDT – Taka de Bangladés", "BGN – Lev búlgaro",
                "BHD – Dinar bareiní", "BIF – Franco burundés", "BMD – Dólar bermudeño",
                "BND – Dólar de Brunéi", "BOB – Boliviano boliviano", "BRL – Real brasileño",
                "BSD – Dólar bahameño", "BTN – Ngultrum butanés", "BWP – Pula botsuano",
                "BYN – Rublo bielorruso", "BZD – Dólar beliceño", "CAD – Dólar canadiense",
                "CDF – Franco congoleño", "CHF – Franco suizo", "CLP – Peso chileno",
                "CNY – Yuan chino", "COP – Peso colombiano", "CRC – Colón costarricense",
                "CUP – Peso cubano", "CVE – Escudo caboverdiano", "CZK – Corona checa",
                "DJF – Franco yibutiano", "DKK – Corona danesa", "DOP – Peso dominicano",
                "DZD – Dinar argelino", "EGP – Libra egipcia", "ERN – Nakfa eritreo",
                "ETB – Birr etíope", "EUR – Euro", "FJD – Dólar fiyiano",
                "FKP – Libra de las Islas Malvinas", "FOK – Corona feroesa", "GBP – Libra esterlina",
                "GEL – Lari georgiano", "GGP – Libra de Guernsey", "GHS – Cedi ghanés",
                "GIP – Libra de Gibraltar", "GMD – Dalasi gambiano", "GNF – Franco guineano",
                "GTQ – Quetzal guatemalteco", "GYD – Dólar guyanés", "HKD – Dólar de Hong Kong",
                "HNL – Lempira hondureño", "HRK – Kuna croata", "HTG – Gourde haitiano",
                "HUF – Florín húngaro", "IDR – Rupia indonesia", "ILS – Nuevo shékel israelí",
                "IMP – Libra de la Isla de Man", "INR – Rupia india", "IQD – Dinar iraquí",
                "IRR – Rial iraní", "ISK – Corona islandesa", "JEP – Libra de Jersey",
                "JMD – Dólar jamaiquino", "JOD – Dinar jordano", "JPY – Yen japonés",
                "KES – Chelín keniano", "KGS – Som kirguís", "KHR – Riel camboyano",
                "KID – Dólar de Kiribati", "KMF – Franco comorense", "KRW – Won surcoreano",
                "KWD – Dinar kuwaití", "KYD – Dólar caimano", "KZT – Tenge kazajo",
                "LAK – Kip laosiano", "LBP – Libra libanesa", "LKR – Rupia de Sri Lanka",
                "LRD – Dólar liberiano", "LSL – Loti lesotense", "LYD – Dinar libio",
                "MAD – Dirham marroquí", "MDL – Leu moldavo", "MGA – Ariary malgache",
                "MKD – Dinar macedonio", "MMK – Kyat birmano", "MNT – Tugrik mongol",
                "MOP – Pataca macanesa", "MRU – Ouguiya mauritana", "MUR – Rupia mauriciana",
                "MVR – Rufiyaa maldiva", "MWK – Kwacha malauí", "MXN – Peso mexicano",
                "MYR – Ringgit malasio", "MZN – Metical mozambiqueño", "NAD – Dólar namibio",
                "NGN – Naira nigeriana", "NIO – Córdoba nicaragüense", "NOK – Corona noruega",
                "NPR – Rupia nepalí", "NZD – Dólar neozelandés", "OMR – Rial omaní",
                "PAB – Balboa panameño", "PEN – Sol peruano", "PGK – Kina papuana",
                "PHP – Peso filipino", "PKR – Rupia paquistaní", "PLN – Złoty polaco",
                "PYG – Guaraní paraguayo", "QAR – Riyal catarí", "RON – Leu rumano",
                "RSD – Dinar serbio", "RUB – Rublo ruso", "RWF – Franco ruandés",
                "SAR – Riyal saudí", "SBD – Dólar de las Islas Salomón", "SCR – Rupia seychellense",
                "SDG – Libra sudanesa", "SEK – Corona sueca", "SGD – Dólar de Singapur",
                "SHP – Libra de Santa Elena", "SLE – Leona de Sierra Leona", "SLL – Leone de Sierra Leona",
                "SOS – Chelín somalí", "SRD – Dólar surinamés", "SSP – Libra sursudanesa",
                "STN – Dobra santotomense", "SYP – Libra siria", "SZL – Lilangeni suazi",
                "THB – Baht tailandés", "TJS – Somoni tayiko", "TMT – Manat turcomano",
                "TND – Dinar tunecino", "TOP – Paʻanga tongano", "TRY – Lira turca",
                "TTD – Dólar trinitense", "TVD – Dólar tuvaluano", "TWD – Nuevo dólar taiwanés",
                "TZS – Chelín tanzano", "UAH – Grivna ucraniana", "UGX – Chelín ugandés",
                "UYU – Peso uruguayo", "UZS – Som uzbeko", "VES – Bolívar venezolano",
                "VND – Dong vietnamita", "VUV – Vatu vanuatuense", "WST – Tala samoana",
                "XAF – Franco CFA de África Central", "XCD – Dólar del Caribe Oriental", "XDR – Derechos especiales de giro",
                "XOF – Franco CFA de África Occidental", "XPF – Franco CFP", "YER – Rial yemení",
                "ZAR – Rand sudafricano", "ZMW – Kwacha zambiano", "ZWL – Dólar zimbabuense"
        };

        int numRows = (int) Math.ceil(currencies.length) / 3;
        for (int i = 0; i < numRows; i++) {
            String col1 = i < currencies.length ? currencies[i] : "";
            String col2 = i + numRows < currencies.length ? currencies[i + numRows] : "";
            String col3 = i + 2 * numRows < currencies.length ? currencies[i + 2 * numRows] : "";

            System.out.printf("%-46s %-46s %-46s%n", col1, col2, col3);

        }
        System.out.println("\n");
        return 0;
    }
}
