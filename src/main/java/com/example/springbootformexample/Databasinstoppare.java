package com.example.springbootformexample;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Databasinstoppare implements ApplicationRunner {

    private final AnnonsRepository repository;

    @Autowired
    public Databasinstoppare(AnnonsRepository repo){
        System.out.println("Databasins autowired");
        this.repository = repo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("p");

        if (repository.count() == 0) {
            System.out.println("databasen var tom");
            Person person = new Person("a", "b", "c", "d", 5);
            Annons annons = new Annons("t", person, "a", "b", 13, 13, 300, Category.Rubber_trees, null);

            repository.save(annons);
            //repository.save(person);
        }
    }

    /*This is how I DID it.
I store my images as a LONGBLOB in my MySQL database so use columnDefinition = "LONGBLOB". In your HTML code for your upload button, make sure you include the multiple = "true" in your tag if you are using HTML.

In your Controller class make a multipart file that will get the images if you are using binding models and also, you need to have a Set/List of images so you can go through them all.

MultipartFile[] images = bindingModel.getImages();
Set<Image> newImages = new HashSet<>();
I have this neat for loop so I can go through all of my images:

    for (MultipartFile multipartFileFOREACH : images)
        {
            Image newImage = new Image(multipartFileFOREACH.getBytes(), postEntity);//Image is an Entity here, postEntity is an object
            newImages.add(newImage);
            this.imageRepository.saveAndFlush(newImage);
        }
        this.articleRepository.saveAndFlush(articleEntity);
So, here I store my bytes into the LONGBLOB in the SQL database

Then for the actual view

    Set<Image> imagesBytes = post.getImages();
    List<String> images = new ArrayList<>();
    for (Image image : imagesBytes)
    {
        images.add(Base64.getEncoder().encodeToString(image.getLink()));
    }
My Image Entity has a link variable of type byte[]

Then I simply add the view for the HTML:

model.addAttribute("images", images);*/
}
