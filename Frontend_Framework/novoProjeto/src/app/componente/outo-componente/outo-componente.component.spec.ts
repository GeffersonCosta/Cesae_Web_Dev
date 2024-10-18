import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutoComponenteComponent } from './outo-componente.component';

describe('OutoComponenteComponent', () => {
  let component: OutoComponenteComponent;
  let fixture: ComponentFixture<OutoComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OutoComponenteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OutoComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
