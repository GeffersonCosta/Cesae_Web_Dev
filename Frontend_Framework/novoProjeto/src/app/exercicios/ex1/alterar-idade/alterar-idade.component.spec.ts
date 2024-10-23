import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlterarIdadeComponent } from './alterar-idade.component';

describe('AlterarIdadeComponent', () => {
  let component: AlterarIdadeComponent;
  let fixture: ComponentFixture<AlterarIdadeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AlterarIdadeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlterarIdadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
