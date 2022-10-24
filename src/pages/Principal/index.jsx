import  React from "react";

import Imagem1 from "../../assets/img/img principal.jpg";
import Imagem2 from "../../assets/img/img floripa.jpg";
import Imagem3 from "../../assets/img/img alagoas.jpg";
import "../../style.css";
export default function Principal (){
    return(
        <main className="contenier=fluid">
        <h1>Aqui seu sonho acontece</h1>
        <img src="Imagem1" className="img-fluid" alt="imagem de uma praia"/>
  
        <h2>Dicas de viajem</h2>
       
    <section className="Melhoresdestinos">
      
    <div className=" col-lg-4-col-md-6">
        <div className="card" style="width: 18rem;">
          <img src="Imagem2" className="card-img-top" alt="cidade"/>
           <div className="card-body">
            <h5 className="card-title">Florionopis</h5>
            <p className="card-text">Lindas praias.</p>
           </div>
        </div>
    </div>
    <div className=" col-lg-4-col-md-6">
      <div className="card" style="width: 18rem;">
        <img src=" Imagem3" className="card-img-top" alt="cidade"/>
          <div className="card-body">
            <h5 className="card-title">Alagoas</h5>
            <p className="card-text">Lindos recifes para conhecer.</p>
          </div>
      </div>
    </div>
    </section> 
  </main>
    )
}