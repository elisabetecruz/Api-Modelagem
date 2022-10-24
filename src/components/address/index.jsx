import react from "react";

import "../../style.css";
export default function Address(){
    return(
        <div className="contenier">
        
          <div className="col-lg-2-mb-3">
           <h4>Bahia Tur</h4>
           <ul>
             <li>Sobre nós</li>
             <li>Sala de imprensa</li>
           </ul>
            </div>
          <div className="col-lg-2-mb-3">
           <h4>Televendas</h4>
             <ul>
               <li>0800 678 2390</li>
               <li>segunda a sexta: das 08hs ás 20hs </li>
               <li>Sabado e Domingo: das 09hs ás 19hs</li>
             </ul>
          </div>
          <div className="col-lg-2-mb-3">
            <h4>Entre em contato conosco</h4>
                  <ul>
                    <li>Suporte pós venda 11 3465-7853</li>
                    <li>Segunda á sabado das 08hs ás 21hs</li>
                    <li>Remarcação de viajem 11 3465-2815</li>
                  </ul>
            </div>
         </div> 
    
    )
}