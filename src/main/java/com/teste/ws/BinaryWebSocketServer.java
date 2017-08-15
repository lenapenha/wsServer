//package com.teste.ws;
//
//import javax.websocket.*;
//import javax.websocket.server.ServerEndpoint;
//import java.io.IOException;
//import java.nio.ByteBuffer;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@ServerEndpoint("/images")
//public class BinaryWebSocketServer {
//
//    private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());
//
//    @OnOpen
//    public void open(Session cliente){
//
//        System.out.println("Novo cliente" + cliente);
//        sessions.add(cliente);
//    }
//
//    @OnClose
//    public void close(Session cliente) {
//
//        System.out.println("Cliente desconectado" + cliente);
//        sessions.remove(cliente);
//    }
//
//    @OnError
//    public void onError(Throwable error) {
//    }
//
//    @OnMessage
//    public void onMessage(ByteBuffer byteBuffer) {
//        for (Session session : sessions) {
//            try {
//                session.getBasicRemote().sendBinary(byteBuffer);
//            } catch (IOException ex) {
//                Logger.getLogger(BinaryWebSocketServer.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//}
