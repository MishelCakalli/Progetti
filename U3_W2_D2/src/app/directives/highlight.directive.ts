import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private target: ElementRef, private renderer: Renderer2) {
    const coloreCasuale = this.coloreCasuale();
    this.renderer.setStyle(this.target.nativeElement, 'backgroundColor', coloreCasuale);
  }

  coloreCasuale(): string {
    const red = Math.floor(Math.random() * 256);
    const green = Math.floor(Math.random() * 256);
    const blue = Math.floor(Math.random() * 256);

    return `rgb(${red},${green},${blue})`;
  }

}
