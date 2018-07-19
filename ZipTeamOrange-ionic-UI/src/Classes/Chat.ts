import { Message } from "./Messsage";
import { User } from "./user";

export class Chat{
    id: number;
    name: String;
    private messages: Message[];
    private users: User[];
}