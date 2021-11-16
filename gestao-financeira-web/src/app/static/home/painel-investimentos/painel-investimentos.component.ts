import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-painel-investimentos',
  templateUrl: './painel-investimentos.component.html',
  styleUrls: ['./painel-investimentos.component.css']
})
export class PainelInvestimentosComponent implements OnInit {

  constructor(public route: ActivatedRoute) {}

  ngOnInit(): void {
  }

}
