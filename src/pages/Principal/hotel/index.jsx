import React from "react";

import Imagem6 from "../../assets/img/Maceio.jpg";
import Imagem7 from "../../assets/img/porto seguro.jpg";
import "../../style.css";
export default function hotel(){
return(
  <section class="Hoteis">
        
  <div className=" col-lg-4-col-md-6">
      <div className="card" style="width: 18rem;">
        <img src="Imagem7" className="card-img-top" alt="hotel"/>
         <div className="card-body">
          <h5 className="card-title">Hotel Villa Rossa Porto seguro</h5>
          <p className="card-text">Diarias a partir de</p>
          <p>R$150</p>
         </div>
      </div>
  </div>
  <div className=" col-lg-4-col-md-6">
    <div className="card" style="width: 18rem;">
      <img src="Imagem6" className="card-img-top" alt="hotel"/>
        <div className="card-body">
          <h5 className="card-title">Hotel Paraiso da lagoa Maceio</h5>
          <p className="card-text">Diarias a partir de</p>
          <p>R$180</p>
        </div>
    </div>
  </div>
  </section> 
)

}
   