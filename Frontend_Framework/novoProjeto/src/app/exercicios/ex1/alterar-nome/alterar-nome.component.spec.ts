import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlterarNomeComponent } from './alterar-nome.component';

describe('AlterarNomeComponent', () => {
  let component: AlterarNomeComponent;
  let fixture: ComponentFixture<AlterarNomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AlterarNomeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlterarNomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
