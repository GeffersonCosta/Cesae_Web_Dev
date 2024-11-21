import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateAnimalComponent } from './create-animal.component';

describe('CreateAnimalComponent', () => {
  let component: CreateAnimalComponent;
  let fixture: ComponentFixture<CreateAnimalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CreateAnimalComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
