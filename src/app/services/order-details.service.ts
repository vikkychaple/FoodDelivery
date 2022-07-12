import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {

  constructor() { }

  //food details
  foodDetails=[
    {
      id:1,
      foodName:"Panner Grilled Sandwich",
      foodDetails:"Pan-fried masala panner.",
      foodPrice:200,
      foodImg:"https://foodiesweb.weebly.com/uploads/2/6/1/0/26106081/s751108525509701304_p1_i1_w929.jpeg"
    },
    {
      id:2,
      foodName:"Veggie Supreme",
      foodDetails:"Onion|Green Capsicum|Mushroom|Black Olives",
      foodPrice:369,
      foodImg:"https://vegannook.com/sites/default/files/recipe_images/veggie_supreme.jpg"
    },
    {
      id:3,
      foodName:"Panner Burger",
      foodDetails:"Panner.",
      foodPrice:149,
      foodImg:"https://bulldogalehouse.com/img/menu-burgers.jpg"
    },
    {
      id:4,
      foodName:"Veg Masala Naan",
      foodDetails:"A homely mix of mashed potato and veggies,seasoned with Indian spices.",
      foodPrice:140,
      foodImg:"https://th.bing.com/th/id/OIP.ESXp9M2CFMRmLkUO5KO46QHaLG?pid=ImgDet&rs=1"
    },
    {
      id:5,
      foodName:"Mutton Biryani",
      foodDetails:"This mutton biryani recipe has layers of mutton and saffron-milk infused rice cooked 'dum' style.",
      foodPrice:400,
      foodImg:"https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto/xsxi10onczh641t9cjmn"
    },
    {
      id:6,
      foodName:"Oreo Cheesecake Ice Cream",
      foodDetails:"Oreo ice Cream.",
      foodPrice:219,
      foodImg:"https://th.bing.com/th/id/R.6a21cee307edde25ce208d18f3f2bc55?rik=Hj9XEHLY3MORfA&riu=http%3a%2f%2fwww.the-girl-who-ate-everything.com%2fwp-content%2fuploads%2fblogger%2f_A39cgxoHN64%2fSpk75M9EnbI%2fAAAAAAAADvg%2faScnJ1FBy2o%2fs1600%2fIMG_3318.JPG&ehk=lSp1BT%2f%2fYW5s2V06BHQc4m1r1VEGLoqOQeIhYHJKLVU%3d&risl=&pid=ImgRaw&r=0"
    },
    {
      id:7,
      foodName:"Mutton",
      foodDetails:"Mutton",
      foodPrice:315,
      foodImg:"https://www.trawell.in/blog/wp-content/uploads/2021/06/Laal_Maas_Main-768x576.jpg"
    },
    {
      id:8,
      foodName:"Paneer Tikka",
      foodDetails:"Paneer tikka is an Indian dish made from chunks of paneer marinated in spices and grilled in a tandoor.n",
      foodPrice:215,
      foodImg:"https://th.bing.com/th/id/OIP.7RDkRKj7ktTyqOtnvyCwQgHaIz?pid=ImgDet&rs=1"
    },
    {
      id:9,
      foodName:"Chicken Kebabs",
      foodDetails:"A wonderful saffron chicken kebab recipe. Great when paired with slices of onions, peppers, mushrooms, and whole cherry tomatoes alternating with chicken on the skewers.",
      foodPrice:199,
      foodImg:"https://foodhistoria.com/wp-content/uploads/2020/05/bnjpdonwua1ke2db8jo4wv7t4iuxt54usanzomddz2t9himckjmdjsniu1r8fjno--scaled.jpg"
    }
  ]
}
