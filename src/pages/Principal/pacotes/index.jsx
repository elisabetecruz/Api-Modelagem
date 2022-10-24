import react from "react";

import Imagem4 from "../../assets/img/img Pantanal.jpg";
import Imagem5 from "../../assets/img/imgfloripa.jpg";
import "../../style.css";
export default function pacotes(){
    return(
        <section className="pacotes">

            <p className="pac">Pacotes completos com o
                melhor serviço pra voçê </p>

             <div className=" col-lg-4-col-md-6"/>
                <div className="card" style="width: 18rem;">
                    <img src="Imagem4" className="card-img-top" alt="cidade" />
                    <div className="card-body">
                        <h5 className="card-title">Pantanal Mato Grosso do sul</h5>
                        <p className="card-text">Pacotes a partir de </p>
                        <p>R$ 399</p>
                    </div>
                </div>
            <div className=" col-lg-4-col-md-6"/>
                <div className="card" style="width: 18rem;">
                <img src="Imagem5" className="card-img-top" alt="cidade" />
                        <div className="card-body">
                            <h5 className="card-title">Florionopis</h5>
                            <p className="card-text">Pacotes a partir de</p>
                            <p>R$ 250 </p>
                        </div>
                    </div>
            </section>
                )
                }