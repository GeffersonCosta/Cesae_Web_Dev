import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutroComponenteComponent } from './outro-componente.component';

describe('OutroComponenteComponent', () => {
  let component: OutroComponenteComponent;
  let fixture: ComponentFixture<OutroComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OutroComponenteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OutroComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
