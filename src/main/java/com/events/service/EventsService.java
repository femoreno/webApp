package com.events.service;


public class EventsService  {
    /*private String API_KEY = "AIzaSyDTK0igIQTCi5EYKL9tzOIJ9N6FUASGZos";
    @Autowired
    public EventsRepository evRep;

    public List<Events> getAllEvents(){

        return evRep.findAll().stream().map(events -> {
            if (events.getLatitude() == null || events.getLongitude() == null){
                return this.getFromGoogle(events);
            }
            else{
                return events;
            }
        });
    }

    private void getFromGoogle(Elements element){
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();

        try {
            GeocodingApiRequest req = GeocodingApi.newRequest(context);
            GeocodingResult[] results = req.address(address).await();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonResults = gson.toJson(results);
        } catch(ApiException e){
            //Handle API exceptions here
        }

    }*/

}
