package org.example.inventario_casa_desktop.Modelo;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectionMongoDB {
    public MongoClient getConnectionMongo(){
        return MongoClients.create("mongodb://localhost:27017/Platos");
    }

    private MongoCollection getOrCreateCollection(MongoDatabase mongoDatabase, String collectionName){
        return mongoDatabase.getCollection(collectionName);
    }

}
