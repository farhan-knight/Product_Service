package com.example.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication   {
//
//    private final CategoryRepository categoryRepository;
//    private final ProductRespository productRespository;
//    private final PriceRespository priceRespository;
//
//    public ProductServiceApplication(CategoryRepository categoryRepository,
//                                     ProductRespository productRespository, PriceRespository priceRespository) {
//        this.categoryRepository = categoryRepository;
//        this.productRespository = productRespository;
//        this.priceRespository = priceRespository;
//    }
//
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

//    private MentorRepository mentorRepository;
//    private Tpc_MentorRepository tpc_mentorRepository;
//    private Tpc_StudentRepository tpc_studentRepository;
//    private J_MentorRepository J_MentorRepository;
//    private J_StudentRepository J_StudentRepository;
//    private S_MentorRepository s_MentorRepository;
//    private S_StudentRepository s_StudentRepository;
//    public ProductServiceApplication(MentorRepository mentorRepository,
//                                     Tpc_MentorRepository tpc_mentorRepository,
//                                     Tpc_StudentRepository tpc_studentRepository,
//                                     J_MentorRepository j_MentorRepository,
//                                     J_StudentRepository j_StudentRepository,
//                                     S_MentorRepository s_MentorRepository,
//                                     S_StudentRepository s_StudentRepository) {
//        this.mentorRepository = mentorRepository;
//        this.tpc_mentorRepository = tpc_mentorRepository;
//        this.tpc_studentRepository = tpc_studentRepository;
//        this.J_MentorRepository = j_MentorRepository;
//        this.J_StudentRepository = j_StudentRepository;
//        this.s_MentorRepository = s_MentorRepository;
//        this.s_StudentRepository = s_StudentRepository;
//    }
        //@Override
//    // @Transactional
//    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("farhan");
//        mentor.setEmail("farhanmd1204@gmail.com");
//        mentor.setSessions(5L);
//        mentorRepository.save(mentor);
//
//        Tpc_Mentor tpc_mentor = new Tpc_Mentor();
//        tpc_mentor.setName("farhan");
//        tpc_mentor.setEmail("mdfarhan8100@gmail.com");
//        tpc_mentor.setSessions(10l);
//        tpc_mentorRepository.save(tpc_mentor);
//
//        Tpc_Student tps = new Tpc_Student();
//
//        tps.setName("fahad");
//        tps.setEmail("farhad933@gmail.com");
//        tps.setPsp(76l);
//        tpc_studentRepository.save(tps);
//
//        J_Mentor jmentor = new J_Mentor();
//        jmentor.setName("farhan");
//        jmentor.setEmail("farhanmd1204@gmail.com");
//        jmentor.setSessions(5L);
//       J_MentorRepository.save(jmentor);
//
//        J_Student jStudent = new J_Student();
//
//        jStudent.setName("faisal");
//        jStudent.setEmail("snfenkme");
//        jStudent.setPsp(76l);
//        J_StudentRepository.save(jStudent);
//
//        S_Mentor smentor = new S_Mentor();
//        smentor.setName("farhan");
//        smentor.setEmail("farhanmd1204@gmail.com");
//        smentor.setSessions(5L);
//        s_MentorRepository.save(smentor);
//
//        S_Student sStudent = new S_Student();
//
//        sStudent.setName("faisal");
//        sStudent.setEmail("snfenkme");
//        sStudent.setPsp(76l);
//
//        s_StudentRepository.save(sStudent);

//        Category category = new Category();
//        category.setName("MSI LAPTOPS");
//        Category savedCategory = categoryRepository.save(category);
//
//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("116e7caf-308e-4ab3-9f71-a73284d16ee7"));
//
//        Product product = new Product();
//        product.setTitle("MSI Modern 14");
//        product.setPrice(45000.00);
//        product.setDescription("Modern 14 inch Laptop with ryzen 7530u processor");
//        product.setCategory(optionalCategory.get());
//        Product savedProduct = productRespository.save(product);
//
//        // find all the products of category MSI Laptop;
//
//        if(optionalCategory.isEmpty()){
//            throw new Exception("Category not found");
//        }
//        Category category = optionalCategory.get();
//
//        List<Product> productList = category.getProducts();//
//
//        for (Product product1 : productList) {
//            System.out.println(product1.getTitle());// might not work because of lazy intialization
//            // Eager intialization takes time so use when necessary.
//        }


        // deleting price to check mandatory condition

//        Price price = new Price();
//        price.setPrice(45000.00);
//        price.setCurrency("INR");
//        Price savePrice = priceRespository.save(price);
//
//        Category category = new Category();
//        category.setName("MSI LAPTOPS");
//
//        Category savedCategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setTitle("MSI Modern 14");
//        product.setPrice(savePrice);
//        product.setDescription("Modern 14 inch Laptop with ryzen 7530u processor");
//        product.setCategory(savedCategory);
//
//        Product savedProduct = productRespository.save(product);

//        priceRespository.deleteById((UUID.fromString("7adcf17e-0496-4b0b-aa59-f7952b337990"))); // not psbl due to foreign key constraints

        // if we want to delete product then it is possible but price and category stays.
        // Although category is helpful but we have to delete price so use cascade annotations.

      //productRespository.deleteById((UUID.fromString("6866fdd1-d881-4f46-8387-c280b4be43b1")));

        // checking eager fetch type for collection objects


//        Price price = new Price();
//        price.setPrice(45000.00);
//        price.setCurrency("INR");
//
//
//        Category category = new Category();
//        category.setName("MSI LAPTOPS");
//
//        Category savedCategory = categoryRepository.save(category);
//
//
//        Product product = new Product();
//        product.setTitle("MSI Modern 14");
//        product.setPrice(price);
//        product.setDescription("Modern 14 inch Laptop with ryzen 7530u processor");
//        product.setCategory(savedCategory);
//
//        Product savedProduct = productRespository.save(product);
//
//        Price price1 = new Price();
//        price1.setPrice(50000.00);
//        price1.setCurrency("INR");
//
//        Product product1 = new Product();
//        product1.setTitle("MSI Modern 15");
//        product1.setPrice(price1);
//        product1.setDescription("Modern 15 inch Laptop with ryzen 7530u processor");
//        product1.setCategory(savedCategory);
//
//        Product savedProduct1 = productRespository.save(product1);
//
//        Price price2 = new Price();
//        price2.setPrice(95000.00);
//        price2.setCurrency("INR");
//
//
//        Product product2 = new Product();
//        product2.setTitle("MSI GSI 14");
//        product2.setPrice(price2);
//        product2.setDescription("Modern 14 inch Laptop with ryzen 9000u processor");
//        product2.setCategory(savedCategory);
//
//        Product savedProduct3 = productRespository.save(product2);

//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("6171c641-0b9c-4b6e-9133-85c44937ce89"));
//
//        Category category2 = optionalCategory.get();
//
//        List<Product> productList = category2.getProducts();
//
//        for(Product product : productList){
//            System.out.println(product.getTitle());
//        }

        //Eager is required to fetch collections objects of a class like productlist
        // LAZY only fetches primitive attritbutes and to fetch collections we can use @a transactional
        // so that it assumes fetching productlist as a single DB call
    //}

    }

