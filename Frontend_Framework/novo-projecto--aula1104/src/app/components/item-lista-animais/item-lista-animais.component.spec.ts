import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemListaAnimaisComponent } from './item-lista-animais.component';

describe('ItemListaAnimaisComponent', () => {
  let component: ItemListaAnimaisComponent;
  let fixture: ComponentFixture<ItemListaAnimaisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ItemListaAnimaisComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ItemListaAnimaisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
