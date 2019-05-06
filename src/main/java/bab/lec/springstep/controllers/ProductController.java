package bab.lec.springstep.controllers;

import bab.lec.springstep.forms.ProductForm;
import bab.lec.springstep.model.Product;
import bab.lec.springstep.services.impls.Product.ProductMongoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@Controller
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductMongoServiceImpl productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String productList(Model model){
        model.addAttribute("products", productService.getAll());
        return "product";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(Model model){
        ProductForm productForm = new ProductForm();
        model.addAttribute("productForm", productForm);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addStudent(Model model, @ModelAttribute("productForm") ProductForm productForm){
        Product newProduct = new Product(productForm.getId(), productForm.getName(), productForm.getPrice(), productForm.getMeasure(), productForm.getValueOfMeasure());
        productService.create(newProduct);
        model.addAttribute("products", productService.getAll());
        return "product";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(Model model, @PathVariable("id") String id){

        productService.delete(id);

        model.addAttribute("products", productService.getAll());
        return "product";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable("id") String id){

        Product product = productService.get(id);


        ProductForm productForm = new ProductForm();

        productForm.setId(product.getId());
        productForm.setName(product.getName());
        productForm.setPrice(product.getPrice());
        productForm.setMeasure(product.getMeasure());
        productForm.setValueOfMeasure(product.getValueOfMeasure());
        model.addAttribute("productForm", productForm);
        return "editProduct";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String editProduct(Model model,
                           @ModelAttribute("productForm") ProductForm productForm,
                           @PathVariable("id") String id){

        Product product = new Product();

        product.setId(productForm.getId());
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setMeasure(productForm.getMeasure());
        product.setValueOfMeasure(productForm.getValueOfMeasure());
        productService.update(product);
        model.addAttribute("productForm", productForm);
        model.addAttribute("products", productService.getAll());
        return "product";
    }





    /* @RequestMapping(value = "/student/add", method = RequestMethod.GET)
    public String addStudent(Model model){
        StudentForm studentForm = new StudentForm();

        Map<String, String> mavs = groupService.getAll().stream()
                .collect(Collectors.toMap(Group::getId, Group::getName));

        model.addAttribute("mavs", mavs);
        model.addAttribute("studentForm", studentForm);
        return "addStudent";
    }*/
}
