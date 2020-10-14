package db;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import business.Actor;


import java.io.*;


public final class ActorTextFile implements DAO<Actor> {
	private List<Actor> actors = null;
    private Path actorsPath = null;
    private File actorsFile = null;
    private final String FIELD_SEP = "\t";
    
    public ActorTextFile() {
        actorsPath = Paths.get("actor.txt");
        actorsFile = actorsPath.toFile();
        actors = this.getAll();
    }
        @Override
        public List<Actor> getAll() {
            // if the products file has already been read, don't read it again
            if (actors != null) {
                return actors;
            }
            actors = new ArrayList<>();
            if (Files.exists(actorsPath)) {
                try (BufferedReader in = new BufferedReader(
                                         new FileReader(actorsFile))) {

                    // read products from file into array list
                    String line = in.readLine();
                    while (line != null) {
//                        String[] fields = line.split(FIELD_SEP);
//                        int id = int parse.fields[0];
//                        String description = fields[1];
//                        String price = fields[2];

                        Actor a = new Actor();
                        actors.add(a);

                        line = in.readLine();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                    return null;
                }
            } else {
                System.out.println(
                		actorsPath.toAbsolutePath() + " doesn't exist.");
                return null;            
            }
            return actors;
        }

        @Override
		@Override
        public int ActorTextFile(int ID) {
            return ID;
        }

        private boolean saveAll() {
            try (PrintWriter out = new PrintWriter(
                                   new BufferedWriter(
                                   new FileWriter(actorsFile)))) {

                // write all products in the array list
                // to the file
                for (Actor a : actors) {
                    out.print(a.getID() + FIELD_SEP);
                    out.print(a.getFirstName() + FIELD_SEP);
                    out.print(a.getLastName() + FIELD_SEP);
                    out.print(a.getGender() + FIELD_SEP);
                    out.println(a.getBirthDate());
                }
                return true;
            } catch (IOException e) {
                System.out.println(e);
                return false;
            }
        }
        
        @Override
        public boolean add(Actor a) {
        	actors.add(a);
            return this.saveAll();
        }

        @Override
        public boolean delete(Actor a) {
        	actors.remove(a);
            return this.saveAll();
        }

        @Override
        public boolean update(Actor newActor) {
            // get the old product and remove it
        	Actor oldActor = this.get(newActor.getID());
            int i = actors.indexOf(oldActor);
            actors.remove(i);

            // add the updated product
            actors.add(i, newActor);

            return this.saveAll();
        }
		@Override
		public Actor get(int id) {
			// TODO Auto-generated method stub
			return null;
		}

	






}







