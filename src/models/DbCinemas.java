package models;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class DbCinemas implements DbModel<CinemasSession> {
    CinemasSession cinemasSession;
    @Override
    public void add() throws Exception {
        try{

        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void sort() throws Exception {
        try{

        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public CinemasSession select() throws Exception {
        try{

        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void delete() throws Exception{
        try{

        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }
}
