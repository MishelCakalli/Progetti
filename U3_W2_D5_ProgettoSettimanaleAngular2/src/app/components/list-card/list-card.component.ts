// list-card.component.ts

import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo.interface';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.scss']
})
export class ListCardComponent implements OnInit {
  todos: Todo[] = [];

  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.todos = this.todoService.todos;
    console.log(this.todos);
  }

  checkBox(todo: Todo) {
    todo.completed = !todo.completed;
  }
}
