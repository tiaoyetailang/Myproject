package com.atguigu.controller;



import com.atguigu.pojo.Book;
import com.atguigu.pojo.Cart;
import com.atguigu.pojo.User;
import com.atguigu.service.BookService;
import com.atguigu.service.CartService;
import com.atguigu.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class TeacherController {
	
@Autowired
UserService userService;

@Autowired
BookService bookService;

   @Autowired
	CartService cartService;




	@RequestMapping("loginsuccess")
	public String login(String username,Integer password, Model model,HttpServletRequest request){


		User user = userService.getByname(username);
		if(user==null){
			model.addAttribute("msg","用户名或密码错误");

			return "user/login";
		}else {
			if(user.getPassword().equals(password)){
				request.getSession().setAttribute("username",user.getUsername());
				return "user/login_success";

			}
		}

		model.addAttribute("msg","用户名或密码错误");
		return "user/login";
	}


	@RequestMapping("registsuccess")
	public  String  regist(User user,Model model,HttpServletRequest request){
		User byname = userService.getByname(user.getUsername());
		if(byname==null){
			userService.insert(user);
			request.getSession().setAttribute("username",user.getUsername());
			return "user/regist_success";
		}else{

			model.addAttribute("msg","用户名已存在");
			model.addAttribute("user",user);
			return "user/regist";
		}





	}

	@RequestMapping("bookmanager")
	public String bookmanager(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){


		PageHelper.startPage(pn,3);
		List<Book> all = bookService.getAll();


		PageInfo<Book> info = new PageInfo<>(all,4);
		int[] navigatepageNums = info.getNavigatepageNums();
		int pageNum = info.getPageNum();

		model.addAttribute("pageNum",pageNum);

		model.addAttribute("info",info);



		return "manager/book_manager";
	}


	@RequestMapping("edit/{id}")
	public String edit(@PathVariable("id")Integer id,Model model){
		Book book = bookService.getbyId(id);
		model.addAttribute("book",book);


		return "manager/book_edit";
	}

	@RequestMapping("updateOk/{id}")
	public  String updateOk(@PathVariable("id")Integer id,Book book){
		         book.setId(id);
		         bookService.update(book);





		return "redirect:/bookmanager";
	}
	@RequestMapping("add")
	public String add(Model model){
		Book book = new Book();
		model.addAttribute("book",book);

		return "manager/addbook_edit";
	}

	@RequestMapping("addOk")
	public String addOk(Book book){
             bookService.insert(book);


		return "redirect:/bookmanager";
	}

@RequestMapping("delete/{id}")
	public String deleteOk(@PathVariable("id") Integer id){
               bookService.delete(id);


	return "redirect:/bookmanager";

}
@ResponseBody
@RequestMapping("yanling/{id}")
public void QWEWQ(@PathVariable(value = "id") Integer id){
	if(id!=null){
		Book book = bookService.getbyId(id);
		Cart cart = new Cart();
		cart.setName(book.getName());
		cart.setPrice(book.getPrice());
		cartService.insert(cart);
		System.out.println(cart);
	}


}


@RequestMapping("fuck")
	public String tiaozhuan(Integer id,@RequestParam(value = "pn",defaultValue = "1")Integer pn,HttpServletRequest request,Model model, Integer min,Integer max){



		PageHelper.startPage(pn,4);



	if(min==null&&max==null){


        List<Book> all = bookService.getAll();

        PageInfo<Book> info = new PageInfo<>(all,2);


		request.getSession().setAttribute("allbook",info);


        return "forward:/index.jsp";

    }else{
		List<Book> all = bookService.getByPrice(min, max);
		int size = all.size();
		PageInfo<Book> info = new PageInfo<>(all,2);
model.addAttribute("size",size);
		model.addAttribute("min",min);
		model.addAttribute("max",max);
		model.addAttribute("allbook",info);




		return  "forward:/index.jsp";
    }


}
	@RequestMapping("zhuxiao")
	public String zhuxiao(HttpServletRequest request){
		request.getSession().removeAttribute("username");


		return "forward:/index.jsp";

}

@RequestMapping("gouwuche")
	public String gouwuche(Model model){

	List<Cart> carts = cartService.getAll();
	int a=0;
	if(carts!=null){
		int size = carts.size();
		for(Cart cart:carts){
			BigDecimal price = cart.getPrice();
			int i = price.intValue();
			a+=i;
			model.addAttribute("a",a);
			model.addAttribute("carts",carts);
			model.addAttribute("size",size);
		}
	}






   return "cart/cart";
}


@RequestMapping("qingkong")
	public String qingkong(){
		cartService.delete();


	return "redirect:/gouwuche";

}

@RequestMapping("jianyan")
	public  String jianyan(HttpServletRequest request){
          if(request.getSession().getAttribute("username")==null){
          	return "user/login";
		  }else{
			  return "manager/manager";
		  }



}
@ResponseBody
@RequestMapping("first")
public List<String> adas(String username,String password){
		List<String> list =new ArrayList<>();
		list.add(username);
		list.add(password);
		return list;

}
@ResponseBody
@RequestMapping("liang")
public boolean abcde(@Param("username")String  username,@Param("password") String password){
	System.out.println(username+password);
	if(username.equals("123")) {


		return true;
	}else{
		return false;


	}

}
@RequestMapping("ling")
public String adas(){


		return "user/456";

}


}
